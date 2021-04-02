/**
 * Generated from platform:/resource/event.driven.scenario.dl.dse/src/event/driven/scenario/dse/queries/queries.vql
 */
package event.driven.scenario.dse.queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in queries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file queries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package event.driven.scenario.dse.queries, the group contains the definition of the following patterns: <ul>
 * <li>inScene</li>
 * <li>vehicleOnRoad</li>
 * <li>getPossibleTransitions</li>
 * <li>vehicleSlowsDown</li>
 * <li>vehicleAccelerates</li>
 * <li>vehicleMoves</li>
 * <li>pedestrianMoves</li>
 * <li>vehicleReachesRoadEndWithPedestrian</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() {
    if (INSTANCE == null) {
        INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() {
    querySpecifications.add(InScene.instance());
    querySpecifications.add(VehicleOnRoad.instance());
    querySpecifications.add(GetPossibleTransitions.instance());
    querySpecifications.add(VehicleSlowsDown.instance());
    querySpecifications.add(VehicleAccelerates.instance());
    querySpecifications.add(VehicleMoves.instance());
    querySpecifications.add(PedestrianMoves.instance());
    querySpecifications.add(VehicleReachesRoadEndWithPedestrian.instance());
  }
  
  public InScene getInScene() {
    return InScene.instance();
  }
  
  public InScene.Matcher getInScene(final ViatraQueryEngine engine) {
    return InScene.Matcher.on(engine);
  }
  
  public VehicleOnRoad getVehicleOnRoad() {
    return VehicleOnRoad.instance();
  }
  
  public VehicleOnRoad.Matcher getVehicleOnRoad(final ViatraQueryEngine engine) {
    return VehicleOnRoad.Matcher.on(engine);
  }
  
  public GetPossibleTransitions getGetPossibleTransitions() {
    return GetPossibleTransitions.instance();
  }
  
  public GetPossibleTransitions.Matcher getGetPossibleTransitions(final ViatraQueryEngine engine) {
    return GetPossibleTransitions.Matcher.on(engine);
  }
  
  public VehicleSlowsDown getVehicleSlowsDown() {
    return VehicleSlowsDown.instance();
  }
  
  public VehicleSlowsDown.Matcher getVehicleSlowsDown(final ViatraQueryEngine engine) {
    return VehicleSlowsDown.Matcher.on(engine);
  }
  
  public VehicleAccelerates getVehicleAccelerates() {
    return VehicleAccelerates.instance();
  }
  
  public VehicleAccelerates.Matcher getVehicleAccelerates(final ViatraQueryEngine engine) {
    return VehicleAccelerates.Matcher.on(engine);
  }
  
  public VehicleMoves getVehicleMoves() {
    return VehicleMoves.instance();
  }
  
  public VehicleMoves.Matcher getVehicleMoves(final ViatraQueryEngine engine) {
    return VehicleMoves.Matcher.on(engine);
  }
  
  public PedestrianMoves getPedestrianMoves() {
    return PedestrianMoves.instance();
  }
  
  public PedestrianMoves.Matcher getPedestrianMoves(final ViatraQueryEngine engine) {
    return PedestrianMoves.Matcher.on(engine);
  }
  
  public VehicleReachesRoadEndWithPedestrian getVehicleReachesRoadEndWithPedestrian() {
    return VehicleReachesRoadEndWithPedestrian.instance();
  }
  
  public VehicleReachesRoadEndWithPedestrian.Matcher getVehicleReachesRoadEndWithPedestrian(final ViatraQueryEngine engine) {
    return VehicleReachesRoadEndWithPedestrian.Matcher.on(engine);
  }
}
