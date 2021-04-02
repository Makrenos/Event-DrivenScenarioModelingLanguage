/**
 * Generated from platform:/resource/event.driven.scenario.dl.dse/src/event/driven/scenario/dse/queries/queries.vql
 */
package event.driven.scenario.dse.queries;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import scenedl.DynamicEntity;
import scenedl.Scene;
import scenedl.StaticEntity;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         //Objectives
 *         pattern vehicleReachesRoadEndWithPedestrian(scene: Scene, vehicle: DynamicEntity, pedestrian: DynamicEntity,crosswalk: StaticEntity){
 *         	Scene.elements(scene,vehicle);
 *         	Scene.elements(scene,road);
 *         	Scene.elements(scene,pedestrian);
 *         	Scene.elements(scene,crosswalk);
 *         	
 *         	StaticEntity.name(crosswalk,"crosswalk");
 *         	DynamicEntity.name(pedestrian,"pedestrian");
 *         	StaticEntity.name(road,"road");
 *         	
 *         	StaticEntity.lanes(crosswalk,crosswalkLanes);
 *         	Lane.endingPosition(crosswalkLanes,crosswalkPos);
 *         	PositionAttribute.y(crosswalkPos,crosswalkPosY);
 *         	PositionAttribute.x(crosswalkPos,crosswalkPosX);
 *         	
 *         	DynamicEntity.position(pedestrian,pedestrianePos);
 *         	PositionAttribute.y(pedestrianePos,pedestrianPosY);
 *         	
 *         	DynamicEntity.name(vehicle,"car");
 *         	
 *         	DynamicEntity.position(vehicle,vehiclePos);
 *         	PositionAttribute.x(vehiclePos,vehiclePosX);
 *         	
 *         	find inScene(pedestrian,scene);
 *         	find inScene(vehicle,scene);
 *         	
 *         	//find vehicleOnRoad(vehicle,road);	
 *         	
 *         	check(vehiclePosX {@literal >} crosswalkPosX && pedestrianPosY {@literal >} crosswalkPosY);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class VehicleReachesRoadEndWithPedestrian extends BaseGeneratedEMFQuerySpecification<VehicleReachesRoadEndWithPedestrian.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.vehicleReachesRoadEndWithPedestrian pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Scene fScene;
    
    private DynamicEntity fVehicle;
    
    private DynamicEntity fPedestrian;
    
    private StaticEntity fCrosswalk;
    
    private static List<String> parameterNames = makeImmutableList("scene", "vehicle", "pedestrian", "crosswalk");
    
    private Match(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      this.fScene = pScene;
      this.fVehicle = pVehicle;
      this.fPedestrian = pPedestrian;
      this.fCrosswalk = pCrosswalk;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "scene": return this.fScene;
          case "vehicle": return this.fVehicle;
          case "pedestrian": return this.fPedestrian;
          case "crosswalk": return this.fCrosswalk;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fScene;
          case 1: return this.fVehicle;
          case 2: return this.fPedestrian;
          case 3: return this.fCrosswalk;
          default: return null;
      }
    }
    
    public Scene getScene() {
      return this.fScene;
    }
    
    public DynamicEntity getVehicle() {
      return this.fVehicle;
    }
    
    public DynamicEntity getPedestrian() {
      return this.fPedestrian;
    }
    
    public StaticEntity getCrosswalk() {
      return this.fCrosswalk;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("scene".equals(parameterName) ) {
          this.fScene = (Scene) newValue;
          return true;
      }
      if ("vehicle".equals(parameterName) ) {
          this.fVehicle = (DynamicEntity) newValue;
          return true;
      }
      if ("pedestrian".equals(parameterName) ) {
          this.fPedestrian = (DynamicEntity) newValue;
          return true;
      }
      if ("crosswalk".equals(parameterName) ) {
          this.fCrosswalk = (StaticEntity) newValue;
          return true;
      }
      return false;
    }
    
    public void setScene(final Scene pScene) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fScene = pScene;
    }
    
    public void setVehicle(final DynamicEntity pVehicle) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fVehicle = pVehicle;
    }
    
    public void setPedestrian(final DynamicEntity pPedestrian) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPedestrian = pPedestrian;
    }
    
    public void setCrosswalk(final StaticEntity pCrosswalk) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCrosswalk = pCrosswalk;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.vehicleReachesRoadEndWithPedestrian";
    }
    
    @Override
    public List<String> parameterNames() {
      return VehicleReachesRoadEndWithPedestrian.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fScene, fVehicle, fPedestrian, fCrosswalk};
    }
    
    @Override
    public VehicleReachesRoadEndWithPedestrian.Match toImmutable() {
      return isMutable() ? newMatch(fScene, fVehicle, fPedestrian, fCrosswalk) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"scene\"=" + prettyPrintValue(fScene) + ", ");
      result.append("\"vehicle\"=" + prettyPrintValue(fVehicle) + ", ");
      result.append("\"pedestrian\"=" + prettyPrintValue(fPedestrian) + ", ");
      result.append("\"crosswalk\"=" + prettyPrintValue(fCrosswalk));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fScene, fVehicle, fPedestrian, fCrosswalk);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof VehicleReachesRoadEndWithPedestrian.Match)) {
          VehicleReachesRoadEndWithPedestrian.Match other = (VehicleReachesRoadEndWithPedestrian.Match) obj;
          return Objects.equals(fScene, other.fScene) && Objects.equals(fVehicle, other.fVehicle) && Objects.equals(fPedestrian, other.fPedestrian) && Objects.equals(fCrosswalk, other.fCrosswalk);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public VehicleReachesRoadEndWithPedestrian specification() {
      return VehicleReachesRoadEndWithPedestrian.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static VehicleReachesRoadEndWithPedestrian.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pCrosswalk the fixed value of pattern parameter crosswalk, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static VehicleReachesRoadEndWithPedestrian.Match newMutableMatch(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return new Mutable(pScene, pVehicle, pPedestrian, pCrosswalk);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pCrosswalk the fixed value of pattern parameter crosswalk, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static VehicleReachesRoadEndWithPedestrian.Match newMatch(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return new Immutable(pScene, pVehicle, pPedestrian, pCrosswalk);
    }
    
    private static final class Mutable extends VehicleReachesRoadEndWithPedestrian.Match {
      Mutable(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
        super(pScene, pVehicle, pPedestrian, pCrosswalk);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends VehicleReachesRoadEndWithPedestrian.Match {
      Immutable(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
        super(pScene, pVehicle, pPedestrian, pCrosswalk);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.vehicleReachesRoadEndWithPedestrian pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //Objectives
   * pattern vehicleReachesRoadEndWithPedestrian(scene: Scene, vehicle: DynamicEntity, pedestrian: DynamicEntity,crosswalk: StaticEntity){
   * 	Scene.elements(scene,vehicle);
   * 	Scene.elements(scene,road);
   * 	Scene.elements(scene,pedestrian);
   * 	Scene.elements(scene,crosswalk);
   * 	
   * 	StaticEntity.name(crosswalk,"crosswalk");
   * 	DynamicEntity.name(pedestrian,"pedestrian");
   * 	StaticEntity.name(road,"road");
   * 	
   * 	StaticEntity.lanes(crosswalk,crosswalkLanes);
   * 	Lane.endingPosition(crosswalkLanes,crosswalkPos);
   * 	PositionAttribute.y(crosswalkPos,crosswalkPosY);
   * 	PositionAttribute.x(crosswalkPos,crosswalkPosX);
   * 	
   * 	DynamicEntity.position(pedestrian,pedestrianePos);
   * 	PositionAttribute.y(pedestrianePos,pedestrianPosY);
   * 	
   * 	DynamicEntity.name(vehicle,"car");
   * 	
   * 	DynamicEntity.position(vehicle,vehiclePos);
   * 	PositionAttribute.x(vehiclePos,vehiclePosX);
   * 	
   * 	find inScene(pedestrian,scene);
   * 	find inScene(vehicle,scene);
   * 	
   * 	//find vehicleOnRoad(vehicle,road);	
   * 	
   * 	check(vehiclePosX {@literal >} crosswalkPosX && pedestrianPosY {@literal >} crosswalkPosY);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see VehicleReachesRoadEndWithPedestrian
   * 
   */
  public static class Matcher extends BaseMatcher<VehicleReachesRoadEndWithPedestrian.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static VehicleReachesRoadEndWithPedestrian.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static VehicleReachesRoadEndWithPedestrian.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_SCENE = 0;
    
    private static final int POSITION_VEHICLE = 1;
    
    private static final int POSITION_PEDESTRIAN = 2;
    
    private static final int POSITION_CROSSWALK = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(VehicleReachesRoadEndWithPedestrian.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pCrosswalk the fixed value of pattern parameter crosswalk, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<VehicleReachesRoadEndWithPedestrian.Match> getAllMatches(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return rawStreamAllMatches(new Object[]{pScene, pVehicle, pPedestrian, pCrosswalk}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pCrosswalk the fixed value of pattern parameter crosswalk, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<VehicleReachesRoadEndWithPedestrian.Match> streamAllMatches(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return rawStreamAllMatches(new Object[]{pScene, pVehicle, pPedestrian, pCrosswalk});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pCrosswalk the fixed value of pattern parameter crosswalk, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<VehicleReachesRoadEndWithPedestrian.Match> getOneArbitraryMatch(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return rawGetOneArbitraryMatch(new Object[]{pScene, pVehicle, pPedestrian, pCrosswalk});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pCrosswalk the fixed value of pattern parameter crosswalk, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return rawHasMatch(new Object[]{pScene, pVehicle, pPedestrian, pCrosswalk});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pCrosswalk the fixed value of pattern parameter crosswalk, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return rawCountMatches(new Object[]{pScene, pVehicle, pPedestrian, pCrosswalk});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pCrosswalk the fixed value of pattern parameter crosswalk, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk, final Consumer<? super VehicleReachesRoadEndWithPedestrian.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pScene, pVehicle, pPedestrian, pCrosswalk}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pCrosswalk the fixed value of pattern parameter crosswalk, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public VehicleReachesRoadEndWithPedestrian.Match newMatch(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return VehicleReachesRoadEndWithPedestrian.Match.newMatch(pScene, pVehicle, pPedestrian, pCrosswalk);
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Scene> rawStreamAllValuesOfscene(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SCENE, parameters).map(Scene.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Scene> getAllValuesOfscene() {
      return rawStreamAllValuesOfscene(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Scene> streamAllValuesOfscene() {
      return rawStreamAllValuesOfscene(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Scene> streamAllValuesOfscene(final VehicleReachesRoadEndWithPedestrian.Match partialMatch) {
      return rawStreamAllValuesOfscene(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Scene> streamAllValuesOfscene(final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return rawStreamAllValuesOfscene(new Object[]{null, pVehicle, pPedestrian, pCrosswalk});
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Scene> getAllValuesOfscene(final VehicleReachesRoadEndWithPedestrian.Match partialMatch) {
      return rawStreamAllValuesOfscene(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Scene> getAllValuesOfscene(final DynamicEntity pVehicle, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return rawStreamAllValuesOfscene(new Object[]{null, pVehicle, pPedestrian, pCrosswalk}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DynamicEntity> rawStreamAllValuesOfvehicle(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VEHICLE, parameters).map(DynamicEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfvehicle() {
      return rawStreamAllValuesOfvehicle(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfvehicle() {
      return rawStreamAllValuesOfvehicle(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfvehicle(final VehicleReachesRoadEndWithPedestrian.Match partialMatch) {
      return rawStreamAllValuesOfvehicle(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfvehicle(final Scene pScene, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return rawStreamAllValuesOfvehicle(new Object[]{pScene, null, pPedestrian, pCrosswalk});
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfvehicle(final VehicleReachesRoadEndWithPedestrian.Match partialMatch) {
      return rawStreamAllValuesOfvehicle(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfvehicle(final Scene pScene, final DynamicEntity pPedestrian, final StaticEntity pCrosswalk) {
      return rawStreamAllValuesOfvehicle(new Object[]{pScene, null, pPedestrian, pCrosswalk}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DynamicEntity> rawStreamAllValuesOfpedestrian(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PEDESTRIAN, parameters).map(DynamicEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfpedestrian() {
      return rawStreamAllValuesOfpedestrian(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfpedestrian() {
      return rawStreamAllValuesOfpedestrian(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfpedestrian(final VehicleReachesRoadEndWithPedestrian.Match partialMatch) {
      return rawStreamAllValuesOfpedestrian(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfpedestrian(final Scene pScene, final DynamicEntity pVehicle, final StaticEntity pCrosswalk) {
      return rawStreamAllValuesOfpedestrian(new Object[]{pScene, pVehicle, null, pCrosswalk});
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfpedestrian(final VehicleReachesRoadEndWithPedestrian.Match partialMatch) {
      return rawStreamAllValuesOfpedestrian(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfpedestrian(final Scene pScene, final DynamicEntity pVehicle, final StaticEntity pCrosswalk) {
      return rawStreamAllValuesOfpedestrian(new Object[]{pScene, pVehicle, null, pCrosswalk}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for crosswalk.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<StaticEntity> rawStreamAllValuesOfcrosswalk(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CROSSWALK, parameters).map(StaticEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for crosswalk.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StaticEntity> getAllValuesOfcrosswalk() {
      return rawStreamAllValuesOfcrosswalk(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for crosswalk.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<StaticEntity> streamAllValuesOfcrosswalk() {
      return rawStreamAllValuesOfcrosswalk(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for crosswalk.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<StaticEntity> streamAllValuesOfcrosswalk(final VehicleReachesRoadEndWithPedestrian.Match partialMatch) {
      return rawStreamAllValuesOfcrosswalk(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for crosswalk.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<StaticEntity> streamAllValuesOfcrosswalk(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian) {
      return rawStreamAllValuesOfcrosswalk(new Object[]{pScene, pVehicle, pPedestrian, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for crosswalk.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StaticEntity> getAllValuesOfcrosswalk(final VehicleReachesRoadEndWithPedestrian.Match partialMatch) {
      return rawStreamAllValuesOfcrosswalk(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for crosswalk.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StaticEntity> getAllValuesOfcrosswalk(final Scene pScene, final DynamicEntity pVehicle, final DynamicEntity pPedestrian) {
      return rawStreamAllValuesOfcrosswalk(new Object[]{pScene, pVehicle, pPedestrian, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected VehicleReachesRoadEndWithPedestrian.Match tupleToMatch(final Tuple t) {
      try {
          return VehicleReachesRoadEndWithPedestrian.Match.newMatch((Scene) t.get(POSITION_SCENE), (DynamicEntity) t.get(POSITION_VEHICLE), (DynamicEntity) t.get(POSITION_PEDESTRIAN), (StaticEntity) t.get(POSITION_CROSSWALK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected VehicleReachesRoadEndWithPedestrian.Match arrayToMatch(final Object[] match) {
      try {
          return VehicleReachesRoadEndWithPedestrian.Match.newMatch((Scene) match[POSITION_SCENE], (DynamicEntity) match[POSITION_VEHICLE], (DynamicEntity) match[POSITION_PEDESTRIAN], (StaticEntity) match[POSITION_CROSSWALK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected VehicleReachesRoadEndWithPedestrian.Match arrayToMatchMutable(final Object[] match) {
      try {
          return VehicleReachesRoadEndWithPedestrian.Match.newMutableMatch((Scene) match[POSITION_SCENE], (DynamicEntity) match[POSITION_VEHICLE], (DynamicEntity) match[POSITION_PEDESTRIAN], (StaticEntity) match[POSITION_CROSSWALK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<VehicleReachesRoadEndWithPedestrian.Matcher> querySpecification() {
      return VehicleReachesRoadEndWithPedestrian.instance();
    }
  }
  
  private VehicleReachesRoadEndWithPedestrian() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static VehicleReachesRoadEndWithPedestrian instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected VehicleReachesRoadEndWithPedestrian.Matcher instantiate(final ViatraQueryEngine engine) {
    return VehicleReachesRoadEndWithPedestrian.Matcher.on(engine);
  }
  
  @Override
  public VehicleReachesRoadEndWithPedestrian.Matcher instantiate() {
    return VehicleReachesRoadEndWithPedestrian.Matcher.create();
  }
  
  @Override
  public VehicleReachesRoadEndWithPedestrian.Match newEmptyMatch() {
    return VehicleReachesRoadEndWithPedestrian.Match.newEmptyMatch();
  }
  
  @Override
  public VehicleReachesRoadEndWithPedestrian.Match newMatch(final Object... parameters) {
    return VehicleReachesRoadEndWithPedestrian.Match.newMatch((scenedl.Scene) parameters[0], (scenedl.DynamicEntity) parameters[1], (scenedl.DynamicEntity) parameters[2], (scenedl.StaticEntity) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link VehicleReachesRoadEndWithPedestrian} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link VehicleReachesRoadEndWithPedestrian#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final VehicleReachesRoadEndWithPedestrian INSTANCE = new VehicleReachesRoadEndWithPedestrian();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final VehicleReachesRoadEndWithPedestrian.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_scene = new PParameter("scene", "scenedl.Scene", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "Scene")), PParameterDirection.INOUT);
    
    private final PParameter parameter_vehicle = new PParameter("vehicle", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pedestrian = new PParameter("pedestrian", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_crosswalk = new PParameter("crosswalk", "scenedl.StaticEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "StaticEntity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_scene, parameter_vehicle, parameter_pedestrian, parameter_crosswalk);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.vehicleReachesRoadEndWithPedestrian";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("scene","vehicle","pedestrian","crosswalk");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_scene = body.getOrCreateVariableByName("scene");
          PVariable var_vehicle = body.getOrCreateVariableByName("vehicle");
          PVariable var_pedestrian = body.getOrCreateVariableByName("pedestrian");
          PVariable var_crosswalk = body.getOrCreateVariableByName("crosswalk");
          PVariable var_road = body.getOrCreateVariableByName("road");
          PVariable var_crosswalkLanes = body.getOrCreateVariableByName("crosswalkLanes");
          PVariable var_crosswalkPos = body.getOrCreateVariableByName("crosswalkPos");
          PVariable var_crosswalkPosY = body.getOrCreateVariableByName("crosswalkPosY");
          PVariable var_crosswalkPosX = body.getOrCreateVariableByName("crosswalkPosX");
          PVariable var_pedestrianePos = body.getOrCreateVariableByName("pedestrianePos");
          PVariable var_pedestrianPosY = body.getOrCreateVariableByName("pedestrianPosY");
          PVariable var_vehiclePos = body.getOrCreateVariableByName("vehiclePos");
          PVariable var_vehiclePosX = body.getOrCreateVariableByName("vehiclePosX");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_crosswalk), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "StaticEntity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_scene, parameter_scene),
             new ExportedParameter(body, var_vehicle, parameter_vehicle),
             new ExportedParameter(body, var_pedestrian, parameter_pedestrian),
             new ExportedParameter(body, var_crosswalk, parameter_crosswalk)
          ));
          // 	Scene.elements(scene,vehicle)
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene", "elements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Element")));
          new Equality(body, var__virtual_0_, var_vehicle);
          // 	Scene.elements(scene,road)
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene", "elements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Element")));
          new Equality(body, var__virtual_1_, var_road);
          // 	Scene.elements(scene,pedestrian)
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene", "elements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Element")));
          new Equality(body, var__virtual_2_, var_pedestrian);
          // 	Scene.elements(scene,crosswalk)
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene", "elements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Element")));
          new Equality(body, var__virtual_3_, var_crosswalk);
          // 		StaticEntity.name(crosswalk,"crosswalk")
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ConstantValue(body, var__virtual_4_, "crosswalk");
          new TypeConstraint(body, Tuples.flatTupleOf(var_crosswalk), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "StaticEntity")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_crosswalk, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Element", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_5_, var__virtual_4_);
          // 	DynamicEntity.name(pedestrian,"pedestrian")
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new ConstantValue(body, var__virtual_6_, "pedestrian");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Element", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_7_, var__virtual_6_);
          // 	StaticEntity.name(road,"road")
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new ConstantValue(body, var__virtual_8_, "road");
          new TypeConstraint(body, Tuples.flatTupleOf(var_road), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "StaticEntity")));
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_road, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Element", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_9_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_9_, var__virtual_8_);
          // 		StaticEntity.lanes(crosswalk,crosswalkLanes)
          new TypeConstraint(body, Tuples.flatTupleOf(var_crosswalk), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "StaticEntity")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_crosswalk, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "StaticEntity", "lanes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Lane")));
          new Equality(body, var__virtual_10_, var_crosswalkLanes);
          // 	Lane.endingPosition(crosswalkLanes,crosswalkPos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_crosswalkLanes), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Lane")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_crosswalkLanes, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Lane", "endingPosition")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_11_, var_crosswalkPos);
          // 	PositionAttribute.y(crosswalkPos,crosswalkPosY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_crosswalkPos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_crosswalkPos, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_12_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_12_, var_crosswalkPosY);
          // 	PositionAttribute.x(crosswalkPos,crosswalkPosX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_crosswalkPos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_crosswalkPos, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_13_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_13_, var_crosswalkPosX);
          // 		DynamicEntity.position(pedestrian,pedestrianePos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian, var__virtual_14_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_14_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_14_, var_pedestrianePos);
          // 	PositionAttribute.y(pedestrianePos,pedestrianPosY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianePos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianePos, var__virtual_15_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_15_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_15_, var_pedestrianPosY);
          // 		DynamicEntity.name(vehicle,"car")
          PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
          new ConstantValue(body, var__virtual_16_, "car");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Element", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_17_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_17_, var__virtual_16_);
          // 		DynamicEntity.position(vehicle,vehiclePos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_18_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_18_, var_vehiclePos);
          // 	PositionAttribute.x(vehiclePos,vehiclePosX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehiclePos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_19_ = body.getOrCreateVariableByName(".virtual{19}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehiclePos, var__virtual_19_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_19_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_19_, var_vehiclePosX);
          // 		find inScene(pedestrian,scene)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_pedestrian, var_scene), InScene.instance().getInternalQueryRepresentation());
          // 	find inScene(vehicle,scene)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_vehicle, var_scene), InScene.instance().getInternalQueryRepresentation());
          // 		//find vehicleOnRoad(vehicle,road);			check(vehiclePosX > crosswalkPosX && pedestrianPosY > crosswalkPosY)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern vehicleReachesRoadEndWithPedestrian";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("crosswalkPosX", "crosswalkPosY", "pedestrianPosY", "vehiclePosX");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer crosswalkPosX = (Integer) provider.getValue("crosswalkPosX");
                  Integer crosswalkPosY = (Integer) provider.getValue("crosswalkPosY");
                  Integer pedestrianPosY = (Integer) provider.getValue("pedestrianPosY");
                  Integer vehiclePosX = (Integer) provider.getValue("vehiclePosX");
                  return evaluateExpression_1_1(crosswalkPosX, crosswalkPosY, pedestrianPosY, vehiclePosX);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer crosswalkPosX, final Integer crosswalkPosY, final Integer pedestrianPosY, final Integer vehiclePosX) {
    return ((vehiclePosX.compareTo(crosswalkPosX) > 0) && (pedestrianPosY.compareTo(crosswalkPosY) > 0));
  }
}
