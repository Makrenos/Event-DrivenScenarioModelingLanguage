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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
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

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern vehicleSlowsDown(scene: Scene, vehicle: DynamicEntity, by : java Integer){
 *         	find inScene(vehicle,scene);
 *         	Scene.elements(scene,vehicle);
 *         	DynamicEntity.name(vehicle,"ego");
 *         	by == -1;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class VehicleSlowsDown extends BaseGeneratedEMFQuerySpecification<VehicleSlowsDown.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.vehicleSlowsDown pattern,
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
    
    private Integer fBy;
    
    private static List<String> parameterNames = makeImmutableList("scene", "vehicle", "by");
    
    private Match(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy) {
      this.fScene = pScene;
      this.fVehicle = pVehicle;
      this.fBy = pBy;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "scene": return this.fScene;
          case "vehicle": return this.fVehicle;
          case "by": return this.fBy;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fScene;
          case 1: return this.fVehicle;
          case 2: return this.fBy;
          default: return null;
      }
    }
    
    public Scene getScene() {
      return this.fScene;
    }
    
    public DynamicEntity getVehicle() {
      return this.fVehicle;
    }
    
    public Integer getBy() {
      return this.fBy;
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
      if ("by".equals(parameterName) ) {
          this.fBy = (Integer) newValue;
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
    
    public void setBy(final Integer pBy) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBy = pBy;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.vehicleSlowsDown";
    }
    
    @Override
    public List<String> parameterNames() {
      return VehicleSlowsDown.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fScene, fVehicle, fBy};
    }
    
    @Override
    public VehicleSlowsDown.Match toImmutable() {
      return isMutable() ? newMatch(fScene, fVehicle, fBy) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"scene\"=" + prettyPrintValue(fScene) + ", ");
      result.append("\"vehicle\"=" + prettyPrintValue(fVehicle) + ", ");
      result.append("\"by\"=" + prettyPrintValue(fBy));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fScene, fVehicle, fBy);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof VehicleSlowsDown.Match)) {
          VehicleSlowsDown.Match other = (VehicleSlowsDown.Match) obj;
          return Objects.equals(fScene, other.fScene) && Objects.equals(fVehicle, other.fVehicle) && Objects.equals(fBy, other.fBy);
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
    public VehicleSlowsDown specification() {
      return VehicleSlowsDown.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static VehicleSlowsDown.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pBy the fixed value of pattern parameter by, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static VehicleSlowsDown.Match newMutableMatch(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy) {
      return new Mutable(pScene, pVehicle, pBy);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pBy the fixed value of pattern parameter by, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static VehicleSlowsDown.Match newMatch(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy) {
      return new Immutable(pScene, pVehicle, pBy);
    }
    
    private static final class Mutable extends VehicleSlowsDown.Match {
      Mutable(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy) {
        super(pScene, pVehicle, pBy);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends VehicleSlowsDown.Match {
      Immutable(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy) {
        super(pScene, pVehicle, pBy);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.vehicleSlowsDown pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern vehicleSlowsDown(scene: Scene, vehicle: DynamicEntity, by : java Integer){
   * 	find inScene(vehicle,scene);
   * 	Scene.elements(scene,vehicle);
   * 	DynamicEntity.name(vehicle,"ego");
   * 	by == -1;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see VehicleSlowsDown
   * 
   */
  public static class Matcher extends BaseMatcher<VehicleSlowsDown.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static VehicleSlowsDown.Matcher on(final ViatraQueryEngine engine) {
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
    public static VehicleSlowsDown.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_SCENE = 0;
    
    private static final int POSITION_VEHICLE = 1;
    
    private static final int POSITION_BY = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(VehicleSlowsDown.Matcher.class);
    
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
     * @param pBy the fixed value of pattern parameter by, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<VehicleSlowsDown.Match> getAllMatches(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy) {
      return rawStreamAllMatches(new Object[]{pScene, pVehicle, pBy}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pBy the fixed value of pattern parameter by, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<VehicleSlowsDown.Match> streamAllMatches(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy) {
      return rawStreamAllMatches(new Object[]{pScene, pVehicle, pBy});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pBy the fixed value of pattern parameter by, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<VehicleSlowsDown.Match> getOneArbitraryMatch(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy) {
      return rawGetOneArbitraryMatch(new Object[]{pScene, pVehicle, pBy});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pBy the fixed value of pattern parameter by, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy) {
      return rawHasMatch(new Object[]{pScene, pVehicle, pBy});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pBy the fixed value of pattern parameter by, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy) {
      return rawCountMatches(new Object[]{pScene, pVehicle, pBy});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pBy the fixed value of pattern parameter by, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy, final Consumer<? super VehicleSlowsDown.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pScene, pVehicle, pBy}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pBy the fixed value of pattern parameter by, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public VehicleSlowsDown.Match newMatch(final Scene pScene, final DynamicEntity pVehicle, final Integer pBy) {
      return VehicleSlowsDown.Match.newMatch(pScene, pVehicle, pBy);
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
    public Stream<Scene> streamAllValuesOfscene(final VehicleSlowsDown.Match partialMatch) {
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
    public Stream<Scene> streamAllValuesOfscene(final DynamicEntity pVehicle, final Integer pBy) {
      return rawStreamAllValuesOfscene(new Object[]{null, pVehicle, pBy});
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Scene> getAllValuesOfscene(final VehicleSlowsDown.Match partialMatch) {
      return rawStreamAllValuesOfscene(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Scene> getAllValuesOfscene(final DynamicEntity pVehicle, final Integer pBy) {
      return rawStreamAllValuesOfscene(new Object[]{null, pVehicle, pBy}).collect(Collectors.toSet());
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
    public Stream<DynamicEntity> streamAllValuesOfvehicle(final VehicleSlowsDown.Match partialMatch) {
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
    public Stream<DynamicEntity> streamAllValuesOfvehicle(final Scene pScene, final Integer pBy) {
      return rawStreamAllValuesOfvehicle(new Object[]{pScene, null, pBy});
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfvehicle(final VehicleSlowsDown.Match partialMatch) {
      return rawStreamAllValuesOfvehicle(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfvehicle(final Scene pScene, final Integer pBy) {
      return rawStreamAllValuesOfvehicle(new Object[]{pScene, null, pBy}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for by.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Integer> rawStreamAllValuesOfby(final Object[] parameters) {
      return rawStreamAllValues(POSITION_BY, parameters).map(Integer.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for by.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfby() {
      return rawStreamAllValuesOfby(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for by.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfby() {
      return rawStreamAllValuesOfby(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for by.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfby(final VehicleSlowsDown.Match partialMatch) {
      return rawStreamAllValuesOfby(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for by.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfby(final Scene pScene, final DynamicEntity pVehicle) {
      return rawStreamAllValuesOfby(new Object[]{pScene, pVehicle, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for by.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfby(final VehicleSlowsDown.Match partialMatch) {
      return rawStreamAllValuesOfby(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for by.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfby(final Scene pScene, final DynamicEntity pVehicle) {
      return rawStreamAllValuesOfby(new Object[]{pScene, pVehicle, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected VehicleSlowsDown.Match tupleToMatch(final Tuple t) {
      try {
          return VehicleSlowsDown.Match.newMatch((Scene) t.get(POSITION_SCENE), (DynamicEntity) t.get(POSITION_VEHICLE), (Integer) t.get(POSITION_BY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected VehicleSlowsDown.Match arrayToMatch(final Object[] match) {
      try {
          return VehicleSlowsDown.Match.newMatch((Scene) match[POSITION_SCENE], (DynamicEntity) match[POSITION_VEHICLE], (Integer) match[POSITION_BY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected VehicleSlowsDown.Match arrayToMatchMutable(final Object[] match) {
      try {
          return VehicleSlowsDown.Match.newMutableMatch((Scene) match[POSITION_SCENE], (DynamicEntity) match[POSITION_VEHICLE], (Integer) match[POSITION_BY]);
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
    public static IQuerySpecification<VehicleSlowsDown.Matcher> querySpecification() {
      return VehicleSlowsDown.instance();
    }
  }
  
  private VehicleSlowsDown() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static VehicleSlowsDown instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected VehicleSlowsDown.Matcher instantiate(final ViatraQueryEngine engine) {
    return VehicleSlowsDown.Matcher.on(engine);
  }
  
  @Override
  public VehicleSlowsDown.Matcher instantiate() {
    return VehicleSlowsDown.Matcher.create();
  }
  
  @Override
  public VehicleSlowsDown.Match newEmptyMatch() {
    return VehicleSlowsDown.Match.newEmptyMatch();
  }
  
  @Override
  public VehicleSlowsDown.Match newMatch(final Object... parameters) {
    return VehicleSlowsDown.Match.newMatch((scenedl.Scene) parameters[0], (scenedl.DynamicEntity) parameters[1], (java.lang.Integer) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link VehicleSlowsDown} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link VehicleSlowsDown#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final VehicleSlowsDown INSTANCE = new VehicleSlowsDown();
    
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
    private static final VehicleSlowsDown.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_scene = new PParameter("scene", "scenedl.Scene", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "Scene")), PParameterDirection.INOUT);
    
    private final PParameter parameter_vehicle = new PParameter("vehicle", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_by = new PParameter("by", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_scene, parameter_vehicle, parameter_by);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.vehicleSlowsDown";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("scene","vehicle","by");
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
          PVariable var_by = body.getOrCreateVariableByName("by");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_by), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_scene, parameter_scene),
             new ExportedParameter(body, var_vehicle, parameter_vehicle),
             new ExportedParameter(body, var_by, parameter_by)
          ));
          // 	find inScene(vehicle,scene)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_vehicle, var_scene), InScene.instance().getInternalQueryRepresentation());
          // 	Scene.elements(scene,vehicle)
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene", "elements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Element")));
          new Equality(body, var__virtual_0_, var_vehicle);
          // 	DynamicEntity.name(vehicle,"ego")
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, "ego");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Element", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var__virtual_1_);
          // 	by == -1
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new ConstantValue(body, var__virtual_3_, -1);
          new Equality(body, var_by, var__virtual_3_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1() {
    return 1;
  }
}
