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
 *         //Conditions
 *         pattern danger(vehicle: DynamicEntity){
 *         	DynamicEntity.name(pedestrian,"pedestrian");
 *         	DynamicEntity.position(pedestrian,pedestrianPosition);
 *         	PositionAttribute.x(pedestrianPosition,pedestrianPositionX);
 *         	PositionAttribute.y(pedestrianPosition,pedestrianPositionY);
 *         	DynamicEntity.position(vehicle,vehiclePosition);
 *         	PositionAttribute.x(vehiclePosition,vehiclePositionX);
 *         	PositionAttribute.y(vehiclePosition,vehiclePositionY);
 *         	DynamicEntity.speed(vehicle,speed);
 *         	
 *         	PositionAttribute.y(speed,speedY);
 *         	check(vehiclePositionX{@literal <}pedestrianPositionX);
 *         	check((vehiclePositionY+speedY+1) == pedestrianPositionY);
 *         } or {
 *         	DynamicEntity.name(pedestrian,"pedestrian");
 *         	DynamicEntity.position(pedestrian,pedestrianPosition);
 *         	PositionAttribute.x(pedestrianPosition,pedestrianPositionX);
 *         	
 *         	DynamicEntity.position(vehicle,vehiclePosition);
 *         	PositionAttribute.x(vehiclePosition,vehiclePositionX);
 *         	
 *         	DynamicEntity.speed(vehicle,speed);
 *         	PositionAttribute.x(speed,speedX);
 *         	
 *         	
 *         	check((vehiclePositionX+speedX+1) == pedestrianPositionX);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Danger extends BaseGeneratedEMFQuerySpecification<Danger.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.danger pattern,
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
    
    private static List<String> parameterNames = makeImmutableList("vehicle");
    
    private Match(final DynamicEntity pVehicle) {
      this.fVehicle = pVehicle;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "vehicle": return this.fVehicle;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fVehicle;
          default: return null;
      }
    }
    
    public DynamicEntity getVehicle() {
      return this.fVehicle;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("vehicle".equals(parameterName) ) {
          this.fVehicle = (DynamicEntity) newValue;
          return true;
      }
      return false;
    }
    
    public void setVehicle(final DynamicEntity pVehicle) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fVehicle = pVehicle;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.danger";
    }
    
    @Override
    public List<String> parameterNames() {
      return Danger.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fVehicle};
    }
    
    @Override
    public Danger.Match toImmutable() {
      return isMutable() ? newMatch(fVehicle) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"vehicle\"=" + prettyPrintValue(fVehicle));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fVehicle);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Danger.Match)) {
          Danger.Match other = (Danger.Match) obj;
          return Objects.equals(fVehicle, other.fVehicle);
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
    public Danger specification() {
      return Danger.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Danger.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Danger.Match newMutableMatch(final DynamicEntity pVehicle) {
      return new Mutable(pVehicle);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Danger.Match newMatch(final DynamicEntity pVehicle) {
      return new Immutable(pVehicle);
    }
    
    private static final class Mutable extends Danger.Match {
      Mutable(final DynamicEntity pVehicle) {
        super(pVehicle);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Danger.Match {
      Immutable(final DynamicEntity pVehicle) {
        super(pVehicle);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.danger pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //Conditions
   * pattern danger(vehicle: DynamicEntity){
   * 	DynamicEntity.name(pedestrian,"pedestrian");
   * 	DynamicEntity.position(pedestrian,pedestrianPosition);
   * 	PositionAttribute.x(pedestrianPosition,pedestrianPositionX);
   * 	PositionAttribute.y(pedestrianPosition,pedestrianPositionY);
   * 	DynamicEntity.position(vehicle,vehiclePosition);
   * 	PositionAttribute.x(vehiclePosition,vehiclePositionX);
   * 	PositionAttribute.y(vehiclePosition,vehiclePositionY);
   * 	DynamicEntity.speed(vehicle,speed);
   * 	
   * 	PositionAttribute.y(speed,speedY);
   * 	check(vehiclePositionX{@literal <}pedestrianPositionX);
   * 	check((vehiclePositionY+speedY+1) == pedestrianPositionY);
   * } or {
   * 	DynamicEntity.name(pedestrian,"pedestrian");
   * 	DynamicEntity.position(pedestrian,pedestrianPosition);
   * 	PositionAttribute.x(pedestrianPosition,pedestrianPositionX);
   * 	
   * 	DynamicEntity.position(vehicle,vehiclePosition);
   * 	PositionAttribute.x(vehiclePosition,vehiclePositionX);
   * 	
   * 	DynamicEntity.speed(vehicle,speed);
   * 	PositionAttribute.x(speed,speedX);
   * 	
   * 	
   * 	check((vehiclePositionX+speedX+1) == pedestrianPositionX);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Danger
   * 
   */
  public static class Matcher extends BaseMatcher<Danger.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Danger.Matcher on(final ViatraQueryEngine engine) {
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
    public static Danger.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_VEHICLE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Danger.Matcher.class);
    
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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Danger.Match> getAllMatches(final DynamicEntity pVehicle) {
      return rawStreamAllMatches(new Object[]{pVehicle}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Danger.Match> streamAllMatches(final DynamicEntity pVehicle) {
      return rawStreamAllMatches(new Object[]{pVehicle});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Danger.Match> getOneArbitraryMatch(final DynamicEntity pVehicle) {
      return rawGetOneArbitraryMatch(new Object[]{pVehicle});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DynamicEntity pVehicle) {
      return rawHasMatch(new Object[]{pVehicle});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DynamicEntity pVehicle) {
      return rawCountMatches(new Object[]{pVehicle});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DynamicEntity pVehicle, final Consumer<? super Danger.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pVehicle}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pVehicle the fixed value of pattern parameter vehicle, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Danger.Match newMatch(final DynamicEntity pVehicle) {
      return Danger.Match.newMatch(pVehicle);
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
    
    @Override
    protected Danger.Match tupleToMatch(final Tuple t) {
      try {
          return Danger.Match.newMatch((DynamicEntity) t.get(POSITION_VEHICLE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Danger.Match arrayToMatch(final Object[] match) {
      try {
          return Danger.Match.newMatch((DynamicEntity) match[POSITION_VEHICLE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Danger.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Danger.Match.newMutableMatch((DynamicEntity) match[POSITION_VEHICLE]);
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
    public static IQuerySpecification<Danger.Matcher> querySpecification() {
      return Danger.instance();
    }
  }
  
  private Danger() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Danger instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Danger.Matcher instantiate(final ViatraQueryEngine engine) {
    return Danger.Matcher.on(engine);
  }
  
  @Override
  public Danger.Matcher instantiate() {
    return Danger.Matcher.create();
  }
  
  @Override
  public Danger.Match newEmptyMatch() {
    return Danger.Match.newEmptyMatch();
  }
  
  @Override
  public Danger.Match newMatch(final Object... parameters) {
    return Danger.Match.newMatch((scenedl.DynamicEntity) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Danger} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Danger#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Danger INSTANCE = new Danger();
    
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
    private static final Danger.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_vehicle = new PParameter("vehicle", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_vehicle);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.danger";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("vehicle");
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
          PVariable var_pedestrian = body.getOrCreateVariableByName("pedestrian");
          PVariable var_pedestrianPosition = body.getOrCreateVariableByName("pedestrianPosition");
          PVariable var_pedestrianPositionX = body.getOrCreateVariableByName("pedestrianPositionX");
          PVariable var_pedestrianPositionY = body.getOrCreateVariableByName("pedestrianPositionY");
          PVariable var_vehiclePosition = body.getOrCreateVariableByName("vehiclePosition");
          PVariable var_vehiclePositionX = body.getOrCreateVariableByName("vehiclePositionX");
          PVariable var_vehiclePositionY = body.getOrCreateVariableByName("vehiclePositionY");
          PVariable var_speed = body.getOrCreateVariableByName("speed");
          PVariable var_speedY = body.getOrCreateVariableByName("speedY");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_vehicle, parameter_vehicle)
          ));
          // 	DynamicEntity.name(pedestrian,"pedestrian")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "pedestrian");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Element", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 	DynamicEntity.position(pedestrian,pedestrianPosition)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_2_, var_pedestrianPosition);
          // 	PositionAttribute.x(pedestrianPosition,pedestrianPositionX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianPosition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianPosition, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_3_, var_pedestrianPositionX);
          // 	PositionAttribute.y(pedestrianPosition,pedestrianPositionY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianPosition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianPosition, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_4_, var_pedestrianPositionY);
          // 	DynamicEntity.position(vehicle,vehiclePosition)
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_5_, var_vehiclePosition);
          // 	PositionAttribute.x(vehiclePosition,vehiclePositionX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehiclePosition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehiclePosition, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_6_, var_vehiclePositionX);
          // 	PositionAttribute.y(vehiclePosition,vehiclePositionY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehiclePosition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehiclePosition, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_7_, var_vehiclePositionY);
          // 	DynamicEntity.speed(vehicle,speed)
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "speed")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_8_, var_speed);
          // 		PositionAttribute.y(speed,speedY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_speed), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_speed, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_9_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_9_, var_speedY);
          // 	check(vehiclePositionX<pedestrianPositionX)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern danger";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("pedestrianPositionX", "vehiclePositionX");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer pedestrianPositionX = (Integer) provider.getValue("pedestrianPositionX");
                  Integer vehiclePositionX = (Integer) provider.getValue("vehiclePositionX");
                  return evaluateExpression_1_1(pedestrianPositionX, vehiclePositionX);
              }
          },  null); 
          // 	check((vehiclePositionY+speedY+1) == pedestrianPositionY)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern danger";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("pedestrianPositionY", "speedY", "vehiclePositionY");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer pedestrianPositionY = (Integer) provider.getValue("pedestrianPositionY");
                  Integer speedY = (Integer) provider.getValue("speedY");
                  Integer vehiclePositionY = (Integer) provider.getValue("vehiclePositionY");
                  return evaluateExpression_1_2(pedestrianPositionY, speedY, vehiclePositionY);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_vehicle = body.getOrCreateVariableByName("vehicle");
          PVariable var_pedestrian = body.getOrCreateVariableByName("pedestrian");
          PVariable var_pedestrianPosition = body.getOrCreateVariableByName("pedestrianPosition");
          PVariable var_pedestrianPositionX = body.getOrCreateVariableByName("pedestrianPositionX");
          PVariable var_vehiclePosition = body.getOrCreateVariableByName("vehiclePosition");
          PVariable var_vehiclePositionX = body.getOrCreateVariableByName("vehiclePositionX");
          PVariable var_speed = body.getOrCreateVariableByName("speed");
          PVariable var_speedX = body.getOrCreateVariableByName("speedX");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_vehicle, parameter_vehicle)
          ));
          // 	DynamicEntity.name(pedestrian,"pedestrian")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "pedestrian");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Element", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 	DynamicEntity.position(pedestrian,pedestrianPosition)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_2_, var_pedestrianPosition);
          // 	PositionAttribute.x(pedestrianPosition,pedestrianPositionX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianPosition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianPosition, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_3_, var_pedestrianPositionX);
          // 		DynamicEntity.position(vehicle,vehiclePosition)
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_4_, var_vehiclePosition);
          // 	PositionAttribute.x(vehiclePosition,vehiclePositionX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehiclePosition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehiclePosition, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_5_, var_vehiclePositionX);
          // 		DynamicEntity.speed(vehicle,speed)
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_vehicle, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "speed")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_6_, var_speed);
          // 	PositionAttribute.x(speed,speedX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_speed), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_speed, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_7_, var_speedX);
          // 			check((vehiclePositionX+speedX+1) == pedestrianPositionX)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern danger";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("pedestrianPositionX", "speedX", "vehiclePositionX");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer pedestrianPositionX = (Integer) provider.getValue("pedestrianPositionX");
                  Integer speedX = (Integer) provider.getValue("speedX");
                  Integer vehiclePositionX = (Integer) provider.getValue("vehiclePositionX");
                  return evaluateExpression_2_1(pedestrianPositionX, speedX, vehiclePositionX);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer pedestrianPositionX, final Integer vehiclePositionX) {
    boolean _lessThan = (vehiclePositionX.compareTo(pedestrianPositionX) < 0);
    return _lessThan;
  }
  
  private static boolean evaluateExpression_1_2(final Integer pedestrianPositionY, final Integer speedY, final Integer vehiclePositionY) {
    return ((((vehiclePositionY).intValue() + (speedY).intValue()) + 1) == (pedestrianPositionY).intValue());
  }
  
  private static boolean evaluateExpression_2_1(final Integer pedestrianPositionX, final Integer speedX, final Integer vehiclePositionX) {
    return ((((vehiclePositionX).intValue() + (speedX).intValue()) + 1) == (pedestrianPositionX).intValue());
  }
}
