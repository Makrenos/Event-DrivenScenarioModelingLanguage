package event.driven.scenario.dse.rules;

import edsdl.Action;
import edsdl.Transition;
import event.driven.scenario.dse.queries.PedestrianMoves;
import event.driven.scenario.dse.queries.VehicleAccelerates;
import event.driven.scenario.dse.queries.VehicleMoves;
import event.driven.scenario.dse.queries.VehicleSlowsDown;
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
import scenedl.RegularAttribute;
import scenedl.StaticEntity;

@SuppressWarnings("all")
public class EdsdlDseRules {
  @Extension
  private BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory();
  
  public BatchTransformationRule<?, ?> vehicleMoves;
  
  public BatchTransformationRule<?, ?> vehicleSlowsDown;
  
  public BatchTransformationRule<?, ?> vehicleAccelerates;
  
  public BatchTransformationRule<?, ?> pedestrianMoves;
  
  public int getSpeed(final DynamicEntity e) {
    EList<RegularAttribute> _attributes = e.getAttributes();
    for (final RegularAttribute a : _attributes) {
      boolean _equals = a.getName().equals("speed");
      if (_equals) {
        return a.getValue();
      }
    }
    return 0;
  }
  
  public int setSpeed(final DynamicEntity e, final int by) {
    EList<RegularAttribute> _attributes = e.getAttributes();
    for (final RegularAttribute a : _attributes) {
      boolean _equals = a.getName().equals("speed");
      if (_equals) {
        int _value = a.getValue();
        int _plus = (_value + by);
        a.setValue(_plus);
        return a.getValue();
      }
    }
    return 0;
  }
  
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
    EList<Transition> _outTransitions = de.getContainedIn().getStateMachine().getRuntimestate().get(0).getActualState().getOutTransitions();
    for (final Transition t : _outTransitions) {
      EList<Action> _ruleBasedActions = t.getRuleBasedActions();
      for (final Action a_1 : _ruleBasedActions) {
        boolean _contains = a_1.getName().contains(rule);
        if (_contains) {
          de.getContainedIn().getStateMachine().getRuntimestate().get(0).setActualState(t.getTargetState());
        }
      }
    }
  }
  
  public EdsdlDseRules() {
    try {
      final Consumer<VehicleMoves.Match> _function = (VehicleMoves.Match it) -> {
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x = it.getVehicle().getPosition().getX();
        int _speed = this.getSpeed(it.getVehicle());
        int _plus = (_x + _speed);
        _position.setX(_plus);
        this.actuateModel(it.getVehicle(), this.vehicleMoves.getName());
      };
      this.vehicleMoves = this.factory.<VehicleMoves.Match, VehicleMoves.Matcher>createRule(VehicleMoves.instance()).name("vehicleMoves").action(_function).build();
      final Consumer<VehicleSlowsDown.Match> _function_1 = (VehicleSlowsDown.Match it) -> {
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x = it.getVehicle().getPosition().getX();
        int _setSpeed = this.setSpeed(it.getVehicle(), (it.getBy()).intValue());
        int _plus = (_x + _setSpeed);
        _position.setX(_plus);
        this.actuateModel(it.getVehicle(), this.vehicleSlowsDown.getName());
      };
      this.vehicleSlowsDown = this.factory.<VehicleSlowsDown.Match, VehicleSlowsDown.Matcher>createRule(VehicleSlowsDown.instance()).name("vehicleSlowsDown").action(_function_1).build();
      final Consumer<VehicleAccelerates.Match> _function_2 = (VehicleAccelerates.Match it) -> {
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x = it.getVehicle().getPosition().getX();
        int _setSpeed = this.setSpeed(it.getVehicle(), (it.getBy()).intValue());
        int _plus = (_x + _setSpeed);
        _position.setX(_plus);
        this.actuateModel(it.getVehicle(), this.vehicleAccelerates.getName());
      };
      this.vehicleAccelerates = this.factory.<VehicleAccelerates.Match, VehicleAccelerates.Matcher>createRule(VehicleAccelerates.instance()).name("vehicleAccelerates").action(_function_2).build();
      final Consumer<PedestrianMoves.Match> _function_3 = (PedestrianMoves.Match it) -> {
        PositionAttribute _position = it.getPedestrian().getPosition();
        int _y = it.getPedestrian().getPosition().getY();
        int _speed = this.getSpeed(it.getPedestrian());
        int _minus = (_y - _speed);
        _position.setY(_minus);
        this.actuateModel(it.getPedestrian(), this.pedestrianMoves.getName());
      };
      this.pedestrianMoves = this.factory.<PedestrianMoves.Match, PedestrianMoves.Matcher>createRule(PedestrianMoves.instance()).name("pedestrianMoves").action(_function_3).build();
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
