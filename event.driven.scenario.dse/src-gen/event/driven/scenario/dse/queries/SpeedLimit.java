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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import scenedl.DynamicEntity;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern speedLimit(vehicle: DynamicEntity, limit : java Integer){
 *         	limit == 2;
 *         	DynamicEntity.speed(vehicle,speed);
 *         	PositionAttribute.x(speed,speedX);
 *         	PositionAttribute.y(speed,speedY);
 *         	check(speedX == limit || speedY == limit);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SpeedLimit extends BaseGeneratedEMFQuerySpecification<SpeedLimit.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.speedLimit pattern,
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
    private DynamicEntity fVehicle;
    
    private Integer fLimit;
    
    private static List<String> parameterNames = makeImmutableList("vehicle", "limit");
    
    private Match(final DynamicEntity pVehicle, final Integer pLimit) {
      this.fVehicle = pVehicle;
      this.fLimit = pLimit;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "vehicle": return this.fVehicle;
          case "limit": return this.fLimit;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fVehicle;
          case 1: return this.fLimit;
          default: return null;
      }
    }
    
    public DynamicEntity getVehicle() {
      return this.fVehicle;
    }
    
    public Integer getLimit() {
      return this.fLimit;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("vehicle".equals(parameterName) ) {
          this.fVehicle = (DynamicEntity) newValue;
          return true;
      }
      if ("limit".equals(parameterName) ) {
          this.fLimit = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void setVehicle(final DynamicEntity pVehicle) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fVehicle = pVehicle;
    }
    
    public void setLimit(final Integer pLimit) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLimit = pLimit;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.speedLimit";
    }
    
    @Override
    public List<String> parameterNames() {
      return SpeedLimit.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fVehicle, fLimit};
    }
    
    @Override
    public SpeedLimit.Match toImmutable() {
      return isMutable() ? newMatch(fVehicle, fLimit) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"vehicle\"=" + prettyPrintValue(fVehicle) + ", ");
      result.append("\"limit\"=" + prettyPrintValue(fLimit));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fVehicle, fLimit);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SpeedLimit.Match)) {
          SpeedLimit.Match other = (SpeedLimit.Match) obj;
          return Objects.equals(fVehicle, other.fVehicle) && Objects.equals(fLimit, other.fLimit);
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
    public SpeedLimit specification() {
      return SpeedLimit.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SpeedLimit.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pLimit the fixed value of pattern parameter limit, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SpeedLimit.Match newMutableMatch(final DynamicEntity pVehicle, final Integer pLimit) {
      return new Mutable(pVehicle, pLimit);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pLimit the fixed value of pattern parameter limit, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SpeedLimit.Match newMatch(final DynamicEntity pVehicle, final Integer pLimit) {
      return new Immutable(pVehicle, pLimit);
    }
    
    private static final class Mutable extends SpeedLimit.Match {
      Mutable(final DynamicEntity pVehicle, final Integer pLimit) {
        super(pVehicle, pLimit);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SpeedLimit.Match {
      Immutable(final DynamicEntity pVehicle, final Integer pLimit) {
        super(pVehicle, pLimit);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.speedLimit pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern speedLimit(vehicle: DynamicEntity, limit : java Integer){
   * 	limit == 2;
   * 	DynamicEntity.speed(vehicle,speed);
   * 	PositionAttribute.x(speed,speedX);
   * 	PositionAttribute.y(speed,speedY);
   * 	check(speedX == limit || speedY == limit);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SpeedLimit
   * 
   */
  public static class Matcher extends BaseMatcher<SpeedLimit.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SpeedLimit.Matcher on(final ViatraQueryEngine engine) {
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
    public static SpeedLimit.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_VEHICLE = 0;
    
    private static final int POSITION_LIMIT = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SpeedLimit.Matcher.class);
    
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
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pLimit the fixed value of pattern parameter limit, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SpeedLimit.Match> getAllMatches(final DynamicEntity pVehicle, final Integer pLimit) {
      return rawStreamAllMatches(new Object[]{pVehicle, pLimit}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pLimit the fixed value of pattern parameter limit, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SpeedLimit.Match> streamAllMatches(final DynamicEntity pVehicle, final Integer pLimit) {
      return rawStreamAllMatches(new Object[]{pVehicle, pLimit});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pLimit the fixed value of pattern parameter limit, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SpeedLimit.Match> getOneArbitraryMatch(final DynamicEntity pVehicle, final Integer pLimit) {
      return rawGetOneArbitraryMatch(new Object[]{pVehicle, pLimit});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pLimit the fixed value of pattern parameter limit, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DynamicEntity pVehicle, final Integer pLimit) {
      return rawHasMatch(new Object[]{pVehicle, pLimit});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pLimit the fixed value of pattern parameter limit, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DynamicEntity pVehicle, final Integer pLimit) {
      return rawCountMatches(new Object[]{pVehicle, pLimit});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pLimit the fixed value of pattern parameter limit, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DynamicEntity pVehicle, final Integer pLimit, final Consumer<? super SpeedLimit.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pVehicle, pLimit}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param pLimit the fixed value of pattern parameter limit, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SpeedLimit.Match newMatch(final DynamicEntity pVehicle, final Integer pLimit) {
      return SpeedLimit.Match.newMatch(pVehicle, pLimit);
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
    public Stream<DynamicEntity> streamAllValuesOfvehicle(final SpeedLimit.Match partialMatch) {
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
    public Stream<DynamicEntity> streamAllValuesOfvehicle(final Integer pLimit) {
      return rawStreamAllValuesOfvehicle(new Object[]{null, pLimit});
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfvehicle(final SpeedLimit.Match partialMatch) {
      return rawStreamAllValuesOfvehicle(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for vehicle.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfvehicle(final Integer pLimit) {
      return rawStreamAllValuesOfvehicle(new Object[]{null, pLimit}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for limit.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Integer> rawStreamAllValuesOflimit(final Object[] parameters) {
      return rawStreamAllValues(POSITION_LIMIT, parameters).map(Integer.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for limit.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOflimit() {
      return rawStreamAllValuesOflimit(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for limit.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOflimit() {
      return rawStreamAllValuesOflimit(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for limit.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOflimit(final SpeedLimit.Match partialMatch) {
      return rawStreamAllValuesOflimit(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for limit.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOflimit(final DynamicEntity pVehicle) {
      return rawStreamAllValuesOflimit(new Object[]{pVehicle, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for limit.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOflimit(final SpeedLimit.Match partialMatch) {
      return rawStreamAllValuesOflimit(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for limit.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOflimit(final DynamicEntity pVehicle) {
      return rawStreamAllValuesOflimit(new Object[]{pVehicle, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected SpeedLimit.Match tupleToMatch(final Tuple t) {
      try {
          return SpeedLimit.Match.newMatch((DynamicEntity) t.get(POSITION_VEHICLE), (Integer) t.get(POSITION_LIMIT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SpeedLimit.Match arrayToMatch(final Object[] match) {
      try {
          return SpeedLimit.Match.newMatch((DynamicEntity) match[POSITION_VEHICLE], (Integer) match[POSITION_LIMIT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SpeedLimit.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SpeedLimit.Match.newMutableMatch((DynamicEntity) match[POSITION_VEHICLE], (Integer) match[POSITION_LIMIT]);
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
    public static IQuerySpecification<SpeedLimit.Matcher> querySpecification() {
      return SpeedLimit.instance();
    }
  }
  
  private SpeedLimit() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SpeedLimit instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SpeedLimit.Matcher instantiate(final ViatraQueryEngine engine) {
    return SpeedLimit.Matcher.on(engine);
  }
  
  @Override
  public SpeedLimit.Matcher instantiate() {
    return SpeedLimit.Matcher.create();
  }
  
  @Override
  public SpeedLimit.Match newEmptyMatch() {
    return SpeedLimit.Match.newEmptyMatch();
  }
  
  @Override
  public SpeedLimit.Match newMatch(final Object... parameters) {
    return SpeedLimit.Match.newMatch((scenedl.DynamicEntity) parameters[0], (java.lang.Integer) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link SpeedLimit} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link SpeedLimit#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SpeedLimit INSTANCE = new SpeedLimit();
    
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
    private static final SpeedLimit.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_vehicle = new PParameter("vehicle", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_limit = new PParameter("limit", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_vehicle, parameter_limit);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.speedLimit";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("vehicle","limit");
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
          PVariable var_vehicle = body.getOrCreateVariableByName("vehicle");
          PVariable var_limit = body.getOrCreateVariableByName("limit");
          PVariable var_speed = body.getOrCreateVariableByName("speed");
          PVariable var_speedX = body.getOrCreateVariableByName("speedX");
          PVariable var_speedY = body.getOrCreateVariableByName("speedY");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_limit), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_vehicle, parameter_vehicle),
             new ExportedParameter(body, var_limit, parameter_limit)
          ));
          // 	limit == 2
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, 2);
          new Equality(body, var_limit, var__virtual_0_);
          // 	DynamicEntity.speed(vehicle,speed)
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "speed")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_1_, var_speed);
          // 	PositionAttribute.x(speed,speedX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_speed), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_speed, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_2_, var_speedX);
          // 	PositionAttribute.y(speed,speedY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_speed), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_speed, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_3_, var_speedY);
          // 	check(speedX == limit || speedY == limit)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern speedLimit";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("limit", "speedX", "speedY");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer limit = (Integer) provider.getValue("limit");
                  Integer speedX = (Integer) provider.getValue("speedX");
                  Integer speedY = (Integer) provider.getValue("speedY");
                  return evaluateExpression_1_2(limit, speedX, speedY);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1() {
    return 2;
  }
  
  private static boolean evaluateExpression_1_2(final Integer limit, final Integer speedX, final Integer speedY) {
    return (com.google.common.base.Objects.equal(speedX, limit) || com.google.common.base.Objects.equal(speedY, limit));
  }
}
