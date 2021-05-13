package event.driven.scenario.dse.rules;

import event.driven.scenario.dse.queries.PedestrianMoves;
import event.driven.scenario.dse.queries.RandomVehicleMovesMeasurements;
import event.driven.scenario.dse.queries.VehicleAccelerates;
import event.driven.scenario.dse.queries.VehicleAcceleratesMeasurements;
import event.driven.scenario.dse.queries.VehicleAcceleratesTEST;
import event.driven.scenario.dse.queries.VehicleAcceleratesWOM;
import event.driven.scenario.dse.queries.VehicleMoves;
import event.driven.scenario.dse.queries.VehicleMovesMeasurements;
import event.driven.scenario.dse.queries.VehicleMovesTEST;
import event.driven.scenario.dse.queries.VehicleMovesWOM;
import event.driven.scenario.dse.queries.VehicleSlowsDown;
import event.driven.scenario.dse.queries.VehicleSlowsDownMeasurements;
import event.driven.scenario.dse.queries.VehicleSlowsDownTEST;
import event.driven.scenario.dse.queries.VehicleSlowsDownWOM;
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
public class EdsdlDseRulesWithoutMachine {
  @Extension
  private BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory();
  
  public float time;
  
  public BatchTransformationRule<?, ?> vehicleMoves;
  
  public BatchTransformationRule<?, ?> vehicleSlowsDown;
  
  public BatchTransformationRule<?, ?> vehicleAccelerates;
  
  public BatchTransformationRule<?, ?> pedestrianMoves;
  
  public BatchTransformationRule<?, ?> vehicleMovesMeasurements;
  
  public BatchTransformationRule<?, ?> vehicleSlowsDownMeasurements;
  
  public BatchTransformationRule<?, ?> vehicleAcceleratesMeasurements;
  
  public BatchTransformationRule<?, ?> randomVehicleMovesMeasurements;
  
  public BatchTransformationRule<?, ?> vehicleMovesTEST;
  
  public BatchTransformationRule<?, ?> vehicleSlowsDownTEST;
  
  public BatchTransformationRule<?, ?> vehicleAcceleratesTEST;
  
  public BatchTransformationRule<?, ?> vehicleMovesWOM;
  
  public BatchTransformationRule<?, ?> vehicleSlowsDownWOM;
  
  public BatchTransformationRule<?, ?> vehicleAcceleratesWOM;
  
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
    float _time = this.time;
    long _nanoTime = System.nanoTime();
    long _minus = (_nanoTime - startTime);
    float _divide = (((float) _minus) / 1000000000);
    this.time = (_time + _divide);
  }
  
  public EdsdlDseRulesWithoutMachine() {
    try {
      final Consumer<VehicleMoves.Match> _function = (VehicleMoves.Match it) -> {
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x = it.getVehicle().getPosition().getX();
        int _x_1 = it.getVehicle().getSpeed().getX();
        int _plus = (_x + _x_1);
        _position.setX(_plus);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_1 = (_y + _y_1);
        _position_1.setY(_plus_1);
        this.actuateModel(it.getVehicle(), this.vehicleMoves.getName());
      };
      this.vehicleMoves = this.factory.<VehicleMoves.Match, VehicleMoves.Matcher>createRule(VehicleMoves.instance()).name("vehicleMoves").action(_function).build();
      final Consumer<VehicleSlowsDown.Match> _function_1 = (VehicleSlowsDown.Match it) -> {
        PositionAttribute _speed = it.getVehicle().getSpeed();
        int _x = it.getVehicle().getSpeed().getX();
        Integer _by = it.getBy();
        int _plus = (_x + (_by).intValue());
        _speed.setX(_plus);
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x_1 = it.getVehicle().getPosition().getX();
        int _x_2 = it.getVehicle().getSpeed().getX();
        int _plus_1 = (_x_1 + _x_2);
        _position.setX(_plus_1);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_2 = (_y + _y_1);
        _position_1.setY(_plus_2);
        this.actuateModel(it.getVehicle(), this.vehicleSlowsDown.getName());
      };
      this.vehicleSlowsDown = this.factory.<VehicleSlowsDown.Match, VehicleSlowsDown.Matcher>createRule(VehicleSlowsDown.instance()).name("vehicleSlowsDown").action(_function_1).build();
      final Consumer<VehicleAccelerates.Match> _function_2 = (VehicleAccelerates.Match it) -> {
        PositionAttribute _speed = it.getVehicle().getSpeed();
        int _x = it.getVehicle().getSpeed().getX();
        Integer _by = it.getBy();
        int _plus = (_x + (_by).intValue());
        _speed.setX(_plus);
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x_1 = it.getVehicle().getPosition().getX();
        int _x_2 = it.getVehicle().getSpeed().getX();
        int _plus_1 = (_x_1 + _x_2);
        _position.setX(_plus_1);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_2 = (_y + _y_1);
        _position_1.setY(_plus_2);
        this.actuateModel(it.getVehicle(), this.vehicleAccelerates.getName());
      };
      this.vehicleAccelerates = this.factory.<VehicleAccelerates.Match, VehicleAccelerates.Matcher>createRule(VehicleAccelerates.instance()).name("vehicleAccelerates").action(_function_2).build();
      final Consumer<PedestrianMoves.Match> _function_3 = (PedestrianMoves.Match it) -> {
        PositionAttribute _position = it.getPedestrian().getPosition();
        int _x = it.getPedestrian().getPosition().getX();
        int _x_1 = it.getPedestrian().getSpeed().getX();
        int _plus = (_x + _x_1);
        _position.setX(_plus);
        PositionAttribute _position_1 = it.getPedestrian().getPosition();
        int _y = it.getPedestrian().getPosition().getY();
        int _y_1 = it.getPedestrian().getSpeed().getY();
        int _plus_1 = (_y + _y_1);
        _position_1.setY(_plus_1);
        this.actuateModel(it.getPedestrian(), this.pedestrianMoves.getName());
      };
      this.pedestrianMoves = this.factory.<PedestrianMoves.Match, PedestrianMoves.Matcher>createRule(PedestrianMoves.instance()).name("pedestrianMoves").action(_function_3).build();
      final Consumer<VehicleMovesMeasurements.Match> _function_4 = (VehicleMovesMeasurements.Match it) -> {
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x = it.getVehicle().getPosition().getX();
        int _x_1 = it.getVehicle().getSpeed().getX();
        int _plus = (_x + _x_1);
        _position.setX(_plus);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_1 = (_y + _y_1);
        _position_1.setY(_plus_1);
        this.actuateModel(it.getVehicle(), this.vehicleMoves.getName());
      };
      this.vehicleMovesMeasurements = this.factory.<VehicleMovesMeasurements.Match, VehicleMovesMeasurements.Matcher>createRule(VehicleMovesMeasurements.instance()).name("vehicleMoves").action(_function_4).build();
      final Consumer<RandomVehicleMovesMeasurements.Match> _function_5 = (RandomVehicleMovesMeasurements.Match it) -> {
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x = it.getVehicle().getPosition().getX();
        int _x_1 = it.getVehicle().getSpeed().getX();
        int _plus = (_x + _x_1);
        _position.setX(_plus);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_1 = (_y + _y_1);
        _position_1.setY(_plus_1);
        this.actuateModel(it.getVehicle(), this.vehicleMoves.getName());
      };
      this.randomVehicleMovesMeasurements = this.factory.<RandomVehicleMovesMeasurements.Match, RandomVehicleMovesMeasurements.Matcher>createRule(RandomVehicleMovesMeasurements.instance()).name("randomVehicleMoves").action(_function_5).build();
      final Consumer<VehicleSlowsDownMeasurements.Match> _function_6 = (VehicleSlowsDownMeasurements.Match it) -> {
        PositionAttribute _speed = it.getVehicle().getSpeed();
        int _x = it.getVehicle().getSpeed().getX();
        Integer _by = it.getBy();
        int _plus = (_x + (_by).intValue());
        _speed.setX(_plus);
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x_1 = it.getVehicle().getPosition().getX();
        int _x_2 = it.getVehicle().getSpeed().getX();
        int _plus_1 = (_x_1 + _x_2);
        _position.setX(_plus_1);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_2 = (_y + _y_1);
        _position_1.setY(_plus_2);
        this.actuateModel(it.getVehicle(), this.vehicleSlowsDown.getName());
      };
      this.vehicleSlowsDownMeasurements = this.factory.<VehicleSlowsDownMeasurements.Match, VehicleSlowsDownMeasurements.Matcher>createRule(VehicleSlowsDownMeasurements.instance()).name("vehicleSlowsDown").action(_function_6).build();
      final Consumer<VehicleAcceleratesMeasurements.Match> _function_7 = (VehicleAcceleratesMeasurements.Match it) -> {
        PositionAttribute _speed = it.getVehicle().getSpeed();
        int _x = it.getVehicle().getSpeed().getX();
        Integer _by = it.getBy();
        int _plus = (_x + (_by).intValue());
        _speed.setX(_plus);
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x_1 = it.getVehicle().getPosition().getX();
        int _x_2 = it.getVehicle().getSpeed().getX();
        int _plus_1 = (_x_1 + _x_2);
        _position.setX(_plus_1);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_2 = (_y + _y_1);
        _position_1.setY(_plus_2);
        this.actuateModel(it.getVehicle(), this.vehicleAccelerates.getName());
      };
      this.vehicleAcceleratesMeasurements = this.factory.<VehicleAcceleratesMeasurements.Match, VehicleAcceleratesMeasurements.Matcher>createRule(VehicleAcceleratesMeasurements.instance()).name("vehicleAccelerates").action(_function_7).build();
      final Consumer<VehicleMovesTEST.Match> _function_8 = (VehicleMovesTEST.Match it) -> {
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x = it.getVehicle().getPosition().getX();
        int _x_1 = it.getVehicle().getSpeed().getX();
        int _plus = (_x + _x_1);
        _position.setX(_plus);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_1 = (_y + _y_1);
        _position_1.setY(_plus_1);
        this.actuateModel(it.getVehicle(), this.vehicleMoves.getName());
      };
      this.vehicleMovesTEST = this.factory.<VehicleMovesTEST.Match, VehicleMovesTEST.Matcher>createRule(VehicleMovesTEST.instance()).name("vehicleMoves").action(_function_8).build();
      final Consumer<VehicleSlowsDownTEST.Match> _function_9 = (VehicleSlowsDownTEST.Match it) -> {
        PositionAttribute _speed = it.getVehicle().getSpeed();
        int _x = it.getVehicle().getSpeed().getX();
        Integer _by = it.getBy();
        int _plus = (_x + (_by).intValue());
        _speed.setX(_plus);
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x_1 = it.getVehicle().getPosition().getX();
        int _x_2 = it.getVehicle().getSpeed().getX();
        int _plus_1 = (_x_1 + _x_2);
        _position.setX(_plus_1);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_2 = (_y + _y_1);
        _position_1.setY(_plus_2);
        this.actuateModel(it.getVehicle(), this.vehicleSlowsDown.getName());
      };
      this.vehicleSlowsDownTEST = this.factory.<VehicleSlowsDownTEST.Match, VehicleSlowsDownTEST.Matcher>createRule(VehicleSlowsDownTEST.instance()).name("vehicleSlowsDown").action(_function_9).build();
      final Consumer<VehicleAcceleratesTEST.Match> _function_10 = (VehicleAcceleratesTEST.Match it) -> {
        PositionAttribute _speed = it.getVehicle().getSpeed();
        int _x = it.getVehicle().getSpeed().getX();
        Integer _by = it.getBy();
        int _plus = (_x + (_by).intValue());
        _speed.setX(_plus);
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x_1 = it.getVehicle().getPosition().getX();
        int _x_2 = it.getVehicle().getSpeed().getX();
        int _plus_1 = (_x_1 + _x_2);
        _position.setX(_plus_1);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_2 = (_y + _y_1);
        _position_1.setY(_plus_2);
        this.actuateModel(it.getVehicle(), this.vehicleAccelerates.getName());
      };
      this.vehicleAcceleratesTEST = this.factory.<VehicleAcceleratesTEST.Match, VehicleAcceleratesTEST.Matcher>createRule(VehicleAcceleratesTEST.instance()).name("vehicleAccelerates").action(_function_10).build();
      final Consumer<VehicleMovesWOM.Match> _function_11 = (VehicleMovesWOM.Match it) -> {
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x = it.getVehicle().getPosition().getX();
        int _x_1 = it.getVehicle().getSpeed().getX();
        int _plus = (_x + _x_1);
        _position.setX(_plus);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_1 = (_y + _y_1);
        _position_1.setY(_plus_1);
        this.actuateModel(it.getVehicle(), this.vehicleMoves.getName());
      };
      this.vehicleMovesWOM = this.factory.<VehicleMovesWOM.Match, VehicleMovesWOM.Matcher>createRule(VehicleMovesWOM.instance()).name("vehicleMoves").action(_function_11).build();
      final Consumer<VehicleSlowsDownWOM.Match> _function_12 = (VehicleSlowsDownWOM.Match it) -> {
        PositionAttribute _speed = it.getVehicle().getSpeed();
        int _x = it.getVehicle().getSpeed().getX();
        Integer _by = it.getBy();
        int _plus = (_x + (_by).intValue());
        _speed.setX(_plus);
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x_1 = it.getVehicle().getPosition().getX();
        int _x_2 = it.getVehicle().getSpeed().getX();
        int _plus_1 = (_x_1 + _x_2);
        _position.setX(_plus_1);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_2 = (_y + _y_1);
        _position_1.setY(_plus_2);
        this.actuateModel(it.getVehicle(), this.vehicleSlowsDown.getName());
      };
      this.vehicleSlowsDownWOM = this.factory.<VehicleSlowsDownWOM.Match, VehicleSlowsDownWOM.Matcher>createRule(VehicleSlowsDownWOM.instance()).name("vehicleSlowsDown").action(_function_12).build();
      final Consumer<VehicleAcceleratesWOM.Match> _function_13 = (VehicleAcceleratesWOM.Match it) -> {
        PositionAttribute _speed = it.getVehicle().getSpeed();
        int _x = it.getVehicle().getSpeed().getX();
        Integer _by = it.getBy();
        int _plus = (_x + (_by).intValue());
        _speed.setX(_plus);
        PositionAttribute _position = it.getVehicle().getPosition();
        int _x_1 = it.getVehicle().getPosition().getX();
        int _x_2 = it.getVehicle().getSpeed().getX();
        int _plus_1 = (_x_1 + _x_2);
        _position.setX(_plus_1);
        PositionAttribute _position_1 = it.getVehicle().getPosition();
        int _y = it.getVehicle().getPosition().getY();
        int _y_1 = it.getVehicle().getSpeed().getY();
        int _plus_2 = (_y + _y_1);
        _position_1.setY(_plus_2);
        this.actuateModel(it.getVehicle(), this.vehicleAccelerates.getName());
      };
      this.vehicleAcceleratesWOM = this.factory.<VehicleAcceleratesWOM.Match, VehicleAcceleratesWOM.Matcher>createRule(VehicleAcceleratesWOM.instance()).name("vehicleAccelerates").action(_function_13).build();
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
