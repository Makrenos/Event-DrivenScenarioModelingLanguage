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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
import scenedl.PositionAttribute;
import scenedl.Scene;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern vehicleMoves(scene: Scene, vehicle: DynamicEntity, vehiclePos: PositionAttribute){
 *         	
 *         	Scene.elements(scene,vehicle);
 *         	DynamicEntity.name(vehicle,"car");
 *         	find inScene(vehicle,scene);
 *         	DynamicEntity.position(vehicle,vehiclePos);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class VehicleMoves extends BaseGeneratedEMFQuerySpecification<VehicleMoves.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.vehicleMoves pattern,
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
    
    private PositionAttribute fVehiclePos;
    
    private static List<String> parameterNames = makeImmutableList("scene", "vehicle", "vehiclePos");
    
    private Match(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
      this.fScene = pScene;
      this.fVehicle = pVehicle;
      this.fVehiclePos = pVehiclePos;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "scene": return this.fScene;
          case "vehicle": return this.fVehicle;
          case "vehiclePos": return this.fVehiclePos;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fScene;
          case 1: return this.fVehicle;
          case 2: return this.fVehiclePos;
          default: return null;
      }
    }
    
    public Scene getScene() {
      return this.fScene;
    }
    
    public DynamicEntity getVehicle() {
      return this.fVehicle;
    }
    
    public PositionAttribute getVehiclePos() {
      return this.fVehiclePos;
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
      if ("vehiclePos".equals(parameterName) ) {
          this.fVehiclePos = (PositionAttribute) newValue;
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
    
    public void setVehiclePos(final PositionAttribute pVehiclePos) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fVehiclePos = pVehiclePos;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.vehicleMoves";
    }
    
    @Override
    public List<String> parameterNames() {
      return VehicleMoves.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fScene, fVehicle, fVehiclePos};
    }
    
    @Override
    public VehicleMoves.Match toImmutable() {
      return isMutable() ? newMatch(fScene, fVehicle, fVehiclePos) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"scene\"=" + prettyPrintValue(fScene) + ", ");
      result.append("\"vehicle\"=" + prettyPrintValue(fVehicle) + ", ");
      result.append("\"vehiclePos\"=" + prettyPrintValue(fVehiclePos));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fScene, fVehicle, fVehiclePos);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof VehicleMoves.Match)) {
          VehicleMoves.Match other = (VehicleMoves.Match) obj;
          return Objects.equals(fScene, other.fScene) && Objects.equals(fVehicle, other.fVehicle) && Objects.equals(fVehiclePos, other.fVehiclePos);
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
    public VehicleMoves specification() {
      return VehicleMoves.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static VehicleMoves.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pVehiclePos the fixed value of pattern parameter vehiclePos, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static VehicleMoves.Match newMutableMatch(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
      return new Mutable(pScene, pVehicle, pVehiclePos);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pVehiclePos the fixed value of pattern parameter vehiclePos, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static VehicleMoves.Match newMatch(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
      return new Immutable(pScene, pVehicle, pVehiclePos);
    }
    
    private static final class Mutable extends VehicleMoves.Match {
      Mutable(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
        super(pScene, pVehicle, pVehiclePos);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends VehicleMoves.Match {
      Immutable(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
        super(pScene, pVehicle, pVehiclePos);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.vehicleMoves pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern vehicleMoves(scene: Scene, vehicle: DynamicEntity, vehiclePos: PositionAttribute){
   * 	
   * 	Scene.elements(scene,vehicle);
   * 	DynamicEntity.name(vehicle,"car");
   * 	find inScene(vehicle,scene);
   * 	DynamicEntity.position(vehicle,vehiclePos);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see VehicleMoves
   * 
   */
  public static class Matcher extends BaseMatcher<VehicleMoves.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static VehicleMoves.Matcher on(final ViatraQueryEngine engine) {
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
    public static VehicleMoves.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_SCENE = 0;
    
    private static final int POSITION_VEHICLE = 1;
    
    private static final int POSITION_VEHICLEPOS = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(VehicleMoves.Matcher.class);
    
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
     * @param pVehiclePos the fixed value of pattern parameter vehiclePos, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<VehicleMoves.Match> getAllMatches(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
      return rawStreamAllMatches(new Object[]{pScene, pVehicle, pVehiclePos}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pVehiclePos the fixed value of pattern parameter vehiclePos, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<VehicleMoves.Match> streamAllMatches(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
      return rawStreamAllMatches(new Object[]{pScene, pVehicle, pVehiclePos});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pVehiclePos the fixed value of pattern parameter vehiclePos, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<VehicleMoves.Match> getOneArbitraryMatch(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
      return rawGetOneArbitraryMatch(new Object[]{pScene, pVehicle, pVehiclePos});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pVehiclePos the fixed value of pattern parameter vehiclePos, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
      return rawHasMatch(new Object[]{pScene, pVehicle, pVehiclePos});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pVehiclePos the fixed value of pattern parameter vehiclePos, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
      return rawCountMatches(new Object[]{pScene, pVehicle, pVehiclePos});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pVehiclePos the fixed value of pattern parameter vehiclePos, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos, final Consumer<? super VehicleMoves.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pScene, pVehicle, pVehiclePos}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pVehiclePos the fixed value of pattern parameter vehiclePos, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public VehicleMoves.Match newMatch(final Scene pScene, final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
      return VehicleMoves.Match.newMatch(pScene, pVehicle, pVehiclePos);
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
    public Stream<Scene> streamAllValuesOfscene(final VehicleMoves.Match partialMatch) {
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
    public Stream<Scene> streamAllValuesOfscene(final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
      return rawStreamAllValuesOfscene(new Object[]{null, pVehicle, pVehiclePos});
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Scene> getAllValuesOfscene(final VehicleMoves.Match partialMatch) {
      return rawStreamAllValuesOfscene(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Scene> getAllValuesOfscene(final DynamicEntity pVehicle, final PositionAttribute pVehiclePos) {
      return rawStreamAllValuesOfscene(new Object[]{null, pVehicle, pVehiclePos}).collect(Collectors.toSet());
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
    public Stream<DynamicEntity> streamAllValuesOfvehicle(final VehicleMoves.Match partialMatch) {
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
    public Stream<DynamicEntity> streamAllValuesOfvehicle(final Scene pScene, final PositionAttribute pVehiclePos) {
      return rawStreamAllValuesOfvehicle(new Object[]{pScene, null, pVehiclePos});
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfvehicle(final VehicleMoves.Match partialMatch) {
      return rawStreamAllValuesOfvehicle(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfvehicle(final Scene pScene, final PositionAttribute pVehiclePos) {
      return rawStreamAllValuesOfvehicle(new Object[]{pScene, null, pVehiclePos}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehiclePos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<PositionAttribute> rawStreamAllValuesOfvehiclePos(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VEHICLEPOS, parameters).map(PositionAttribute.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehiclePos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PositionAttribute> getAllValuesOfvehiclePos() {
      return rawStreamAllValuesOfvehiclePos(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehiclePos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<PositionAttribute> streamAllValuesOfvehiclePos() {
      return rawStreamAllValuesOfvehiclePos(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehiclePos.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<PositionAttribute> streamAllValuesOfvehiclePos(final VehicleMoves.Match partialMatch) {
      return rawStreamAllValuesOfvehiclePos(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehiclePos.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<PositionAttribute> streamAllValuesOfvehiclePos(final Scene pScene, final DynamicEntity pVehicle) {
      return rawStreamAllValuesOfvehiclePos(new Object[]{pScene, pVehicle, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehiclePos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PositionAttribute> getAllValuesOfvehiclePos(final VehicleMoves.Match partialMatch) {
      return rawStreamAllValuesOfvehiclePos(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehiclePos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PositionAttribute> getAllValuesOfvehiclePos(final Scene pScene, final DynamicEntity pVehicle) {
      return rawStreamAllValuesOfvehiclePos(new Object[]{pScene, pVehicle, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected VehicleMoves.Match tupleToMatch(final Tuple t) {
      try {
          return VehicleMoves.Match.newMatch((Scene) t.get(POSITION_SCENE), (DynamicEntity) t.get(POSITION_VEHICLE), (PositionAttribute) t.get(POSITION_VEHICLEPOS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected VehicleMoves.Match arrayToMatch(final Object[] match) {
      try {
          return VehicleMoves.Match.newMatch((Scene) match[POSITION_SCENE], (DynamicEntity) match[POSITION_VEHICLE], (PositionAttribute) match[POSITION_VEHICLEPOS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected VehicleMoves.Match arrayToMatchMutable(final Object[] match) {
      try {
          return VehicleMoves.Match.newMutableMatch((Scene) match[POSITION_SCENE], (DynamicEntity) match[POSITION_VEHICLE], (PositionAttribute) match[POSITION_VEHICLEPOS]);
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
    public static IQuerySpecification<VehicleMoves.Matcher> querySpecification() {
      return VehicleMoves.instance();
    }
  }
  
  private VehicleMoves() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static VehicleMoves instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected VehicleMoves.Matcher instantiate(final ViatraQueryEngine engine) {
    return VehicleMoves.Matcher.on(engine);
  }
  
  @Override
  public VehicleMoves.Matcher instantiate() {
    return VehicleMoves.Matcher.create();
  }
  
  @Override
  public VehicleMoves.Match newEmptyMatch() {
    return VehicleMoves.Match.newEmptyMatch();
  }
  
  @Override
  public VehicleMoves.Match newMatch(final Object... parameters) {
    return VehicleMoves.Match.newMatch((scenedl.Scene) parameters[0], (scenedl.DynamicEntity) parameters[1], (scenedl.PositionAttribute) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link VehicleMoves} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link VehicleMoves#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final VehicleMoves INSTANCE = new VehicleMoves();
    
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
    private static final VehicleMoves.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_scene = new PParameter("scene", "scenedl.Scene", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "Scene")), PParameterDirection.INOUT);
    
    private final PParameter parameter_vehicle = new PParameter("vehicle", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_vehiclePos = new PParameter("vehiclePos", "scenedl.PositionAttribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_scene, parameter_vehicle, parameter_vehiclePos);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.vehicleMoves";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("scene","vehicle","vehiclePos");
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
          PVariable var_vehiclePos = body.getOrCreateVariableByName("vehiclePos");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehiclePos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_scene, parameter_scene),
             new ExportedParameter(body, var_vehicle, parameter_vehicle),
             new ExportedParameter(body, var_vehiclePos, parameter_vehiclePos)
          ));
          // 		Scene.elements(scene,vehicle)
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene", "elements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Element")));
          new Equality(body, var__virtual_0_, var_vehicle);
          // 	DynamicEntity.name(vehicle,"car")
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, "car");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Element", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var__virtual_1_);
          // 	find inScene(vehicle,scene)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_vehicle, var_scene), InScene.instance().getInternalQueryRepresentation());
          // 	DynamicEntity.position(vehicle,vehiclePos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_3_, var_vehiclePos);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
