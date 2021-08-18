package event.driven.scenario.dse.rules;

import edsdl.Action;
import edsdl.Transition;
import event.driven.scenario.dse.queries.FollowLaneBehavior;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import scenedl.DynamicEntity;
import scenedl.Element;
import scenedl.Lane;
import scenedl.PositionAttribute;
import scenedl.StaticEntity;

@SuppressWarnings("all")
public class EdsdlDseRules {
  @Extension
  private BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory();
  
  public BatchTransformationRule<?, ?> followLaneBehavior;
  
  public BatchTransformationRule<?, ?> hasTwoBehavior;
  
  public float time;
  
  /**
   * def int getSpeed(DynamicEntity e){
   * for(RegularAttribute a : e.attributes){
   * if(a.name.equals("speed")){
   * 
   * return a.value;
   * }
   * }
   * return 0
   * }
   * 
   * def int setSpeed(DynamicEntity e,int by){
   * for(RegularAttribute a : e.attributes){
   * if(a.name.equals("speed")){
   * a.value = a.value+by
   * return a.value
   * }
   * }
   * return 0
   * }
   */
  public void actuateModel(final DynamicEntity de, final String rule) {
    boolean outOfFeatureZone = true;
    EList<Element> _elements = de.getContainedIn().getElements();
    for (final Element e : _elements) {
      boolean _equals = e.getType().equals("static_entity");
      if (_equals) {
        StaticEntity se = ((StaticEntity) e);
        PositionAttribute seStartPos = se.getLanes().get(0).getStartingPosition();
        PositionAttribute seEndPos = se.getLanes().get(0).getEndingPosition();
        EList<Lane> _lanes = se.getLanes();
        for (final Lane a : _lanes) {
          {
            int _x = a.getStartingPosition().getX();
            int _x_1 = seStartPos.getX();
            boolean _lessThan = (_x < _x_1);
            if (_lessThan) {
              seStartPos = a.getStartingPosition();
            }
            int _y = a.getEndingPosition().getY();
            int _y_1 = seEndPos.getY();
            boolean _greaterThan = (_y > _y_1);
            if (_greaterThan) {
              seEndPos = a.getEndingPosition();
            }
          }
        }
        if (((((de.getPosition().getX() >= seStartPos.getX()) && (de.getPosition().getX() <= seEndPos.getX())) && (de.getPosition().getY() >= seStartPos.getY())) && (de.getPosition().getY() <= seEndPos.getY()))) {
          outOfFeatureZone = false;
          de.setOn(se);
        }
      }
    }
    if (outOfFeatureZone) {
      de.setOn(null);
    }
    long startTime = System.nanoTime();
    boolean _equals_1 = de.getName().equals("ego");
    if (_equals_1) {
      EList<Transition> _outTransitions = de.getContainedIn().getStateMachine().getRuntimestate().get(0).getActualState().getOutTransitions();
      for (final Transition t : _outTransitions) {
        EList<Action> _ruleBasedActions = t.getRuleBasedActions();
        for (final Action a_1 : _ruleBasedActions) {
          boolean _equals_2 = a_1.getName().equals(rule);
          if (_equals_2) {
            de.getContainedIn().getStateMachine().getRuntimestate().get(0).setActualState(t.getTargetState());
          }
        }
      }
    }
    float _time = this.time;
    long _nanoTime = System.nanoTime();
    long _minus = (_nanoTime - startTime);
    float _divide = (((float) _minus) / 1000000000);
    this.time = (_time + _divide);
  }
  
  public EdsdlDseRules() {
    try {
      final Consumer<FollowLaneBehavior.Match> _function = (FollowLaneBehavior.Match it) -> {
        System.out.println(it.getStaticComponent().getName());
      };
      this.followLaneBehavior = this.factory.<FollowLaneBehavior.Match, FollowLaneBehavior.Matcher>createRule(FollowLaneBehavior.instance()).name("followLaneBehavior").action(_function).build();
    } catch (final Throwable _t) {
      if (_t instanceof ViatraQueryException) {
        final ViatraQueryException e = (ViatraQueryException)_t;
        throw new DSEException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
