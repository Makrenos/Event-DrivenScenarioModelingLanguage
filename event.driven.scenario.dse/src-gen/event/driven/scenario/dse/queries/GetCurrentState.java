/**
 * Generated from platform:/resource/event.driven.scenario.dl.dse/src/event/driven/scenario/dse/queries/queries.vql
 */
package event.driven.scenario.dse.queries;

import event.driven.scenario.dl.edsdl.State;
import event.driven.scenario.dl.edsdl.StateMachine;
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
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         //Rules
 *         pattern getCurrentState(actualState: State,stateMachine: StateMachine){
 *         	StateMachine.actualState(stateMachine,actualState);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class GetCurrentState extends BaseGeneratedEMFQuerySpecification<GetCurrentState.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.getCurrentState pattern,
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
    private State fActualState;
    
    private StateMachine fStateMachine;
    
    private static List<String> parameterNames = makeImmutableList("actualState", "stateMachine");
    
    private Match(final State pActualState, final StateMachine pStateMachine) {
      this.fActualState = pActualState;
      this.fStateMachine = pStateMachine;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "actualState": return this.fActualState;
          case "stateMachine": return this.fStateMachine;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fActualState;
          case 1: return this.fStateMachine;
          default: return null;
      }
    }
    
    public State getActualState() {
      return this.fActualState;
    }
    
    public StateMachine getStateMachine() {
      return this.fStateMachine;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("actualState".equals(parameterName) ) {
          this.fActualState = (State) newValue;
          return true;
      }
      if ("stateMachine".equals(parameterName) ) {
          this.fStateMachine = (StateMachine) newValue;
          return true;
      }
      return false;
    }
    
    public void setActualState(final State pActualState) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fActualState = pActualState;
    }
    
    public void setStateMachine(final StateMachine pStateMachine) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStateMachine = pStateMachine;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.getCurrentState";
    }
    
    @Override
    public List<String> parameterNames() {
      return GetCurrentState.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fActualState, fStateMachine};
    }
    
    @Override
    public GetCurrentState.Match toImmutable() {
      return isMutable() ? newMatch(fActualState, fStateMachine) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"actualState\"=" + prettyPrintValue(fActualState) + ", ");
      result.append("\"stateMachine\"=" + prettyPrintValue(fStateMachine));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fActualState, fStateMachine);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof GetCurrentState.Match)) {
          GetCurrentState.Match other = (GetCurrentState.Match) obj;
          return Objects.equals(fActualState, other.fActualState) && Objects.equals(fStateMachine, other.fStateMachine);
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
    public GetCurrentState specification() {
      return GetCurrentState.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static GetCurrentState.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static GetCurrentState.Match newMutableMatch(final State pActualState, final StateMachine pStateMachine) {
      return new Mutable(pActualState, pStateMachine);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static GetCurrentState.Match newMatch(final State pActualState, final StateMachine pStateMachine) {
      return new Immutable(pActualState, pStateMachine);
    }
    
    private static final class Mutable extends GetCurrentState.Match {
      Mutable(final State pActualState, final StateMachine pStateMachine) {
        super(pActualState, pStateMachine);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends GetCurrentState.Match {
      Immutable(final State pActualState, final StateMachine pStateMachine) {
        super(pActualState, pStateMachine);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.getCurrentState pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //Rules
   * pattern getCurrentState(actualState: State,stateMachine: StateMachine){
   * 	StateMachine.actualState(stateMachine,actualState);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see GetCurrentState
   * 
   */
  public static class Matcher extends BaseMatcher<GetCurrentState.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static GetCurrentState.Matcher on(final ViatraQueryEngine engine) {
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
    public static GetCurrentState.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ACTUALSTATE = 0;
    
    private static final int POSITION_STATEMACHINE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(GetCurrentState.Matcher.class);
    
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
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<GetCurrentState.Match> getAllMatches(final State pActualState, final StateMachine pStateMachine) {
      return rawStreamAllMatches(new Object[]{pActualState, pStateMachine}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<GetCurrentState.Match> streamAllMatches(final State pActualState, final StateMachine pStateMachine) {
      return rawStreamAllMatches(new Object[]{pActualState, pStateMachine});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<GetCurrentState.Match> getOneArbitraryMatch(final State pActualState, final StateMachine pStateMachine) {
      return rawGetOneArbitraryMatch(new Object[]{pActualState, pStateMachine});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final State pActualState, final StateMachine pStateMachine) {
      return rawHasMatch(new Object[]{pActualState, pStateMachine});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final State pActualState, final StateMachine pStateMachine) {
      return rawCountMatches(new Object[]{pActualState, pStateMachine});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final State pActualState, final StateMachine pStateMachine, final Consumer<? super GetCurrentState.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pActualState, pStateMachine}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public GetCurrentState.Match newMatch(final State pActualState, final StateMachine pStateMachine) {
      return GetCurrentState.Match.newMatch(pActualState, pStateMachine);
    }
    
    /**
     * Retrieve the set of values that occur in matches for actualState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<State> rawStreamAllValuesOfactualState(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ACTUALSTATE, parameters).map(State.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for actualState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfactualState() {
      return rawStreamAllValuesOfactualState(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for actualState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfactualState() {
      return rawStreamAllValuesOfactualState(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for actualState.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfactualState(final GetCurrentState.Match partialMatch) {
      return rawStreamAllValuesOfactualState(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for actualState.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfactualState(final StateMachine pStateMachine) {
      return rawStreamAllValuesOfactualState(new Object[]{null, pStateMachine});
    }
    
    /**
     * Retrieve the set of values that occur in matches for actualState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfactualState(final GetCurrentState.Match partialMatch) {
      return rawStreamAllValuesOfactualState(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for actualState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfactualState(final StateMachine pStateMachine) {
      return rawStreamAllValuesOfactualState(new Object[]{null, pStateMachine}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for stateMachine.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<StateMachine> rawStreamAllValuesOfstateMachine(final Object[] parameters) {
      return rawStreamAllValues(POSITION_STATEMACHINE, parameters).map(StateMachine.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for stateMachine.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StateMachine> getAllValuesOfstateMachine() {
      return rawStreamAllValuesOfstateMachine(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for stateMachine.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<StateMachine> streamAllValuesOfstateMachine() {
      return rawStreamAllValuesOfstateMachine(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for stateMachine.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<StateMachine> streamAllValuesOfstateMachine(final GetCurrentState.Match partialMatch) {
      return rawStreamAllValuesOfstateMachine(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for stateMachine.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<StateMachine> streamAllValuesOfstateMachine(final State pActualState) {
      return rawStreamAllValuesOfstateMachine(new Object[]{pActualState, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for stateMachine.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StateMachine> getAllValuesOfstateMachine(final GetCurrentState.Match partialMatch) {
      return rawStreamAllValuesOfstateMachine(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for stateMachine.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StateMachine> getAllValuesOfstateMachine(final State pActualState) {
      return rawStreamAllValuesOfstateMachine(new Object[]{pActualState, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected GetCurrentState.Match tupleToMatch(final Tuple t) {
      try {
          return GetCurrentState.Match.newMatch((State) t.get(POSITION_ACTUALSTATE), (StateMachine) t.get(POSITION_STATEMACHINE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected GetCurrentState.Match arrayToMatch(final Object[] match) {
      try {
          return GetCurrentState.Match.newMatch((State) match[POSITION_ACTUALSTATE], (StateMachine) match[POSITION_STATEMACHINE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected GetCurrentState.Match arrayToMatchMutable(final Object[] match) {
      try {
          return GetCurrentState.Match.newMutableMatch((State) match[POSITION_ACTUALSTATE], (StateMachine) match[POSITION_STATEMACHINE]);
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
    public static IQuerySpecification<GetCurrentState.Matcher> querySpecification() {
      return GetCurrentState.instance();
    }
  }
  
  private GetCurrentState() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static GetCurrentState instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected GetCurrentState.Matcher instantiate(final ViatraQueryEngine engine) {
    return GetCurrentState.Matcher.on(engine);
  }
  
  @Override
  public GetCurrentState.Matcher instantiate() {
    return GetCurrentState.Matcher.create();
  }
  
  @Override
  public GetCurrentState.Match newEmptyMatch() {
    return GetCurrentState.Match.newEmptyMatch();
  }
  
  @Override
  public GetCurrentState.Match newMatch(final Object... parameters) {
    return GetCurrentState.Match.newMatch((event.driven.scenario.dl.edsdl.State) parameters[0], (event.driven.scenario.dl.edsdl.StateMachine) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link GetCurrentState} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link GetCurrentState#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final GetCurrentState INSTANCE = new GetCurrentState();
    
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
    private static final GetCurrentState.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_actualState = new PParameter("actualState", "event.driven.scenario.dl.edsdl.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/edsdl", "State")), PParameterDirection.INOUT);
    
    private final PParameter parameter_stateMachine = new PParameter("stateMachine", "event.driven.scenario.dl.edsdl.StateMachine", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/edsdl", "StateMachine")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_actualState, parameter_stateMachine);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.getCurrentState";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("actualState","stateMachine");
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
          PVariable var_actualState = body.getOrCreateVariableByName("actualState");
          PVariable var_stateMachine = body.getOrCreateVariableByName("stateMachine");
          new TypeConstraint(body, Tuples.flatTupleOf(var_actualState), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "State")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_stateMachine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "StateMachine")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_actualState, parameter_actualState),
             new ExportedParameter(body, var_stateMachine, parameter_stateMachine)
          ));
          // 	StateMachine.actualState(stateMachine,actualState)
          new TypeConstraint(body, Tuples.flatTupleOf(var_stateMachine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "StateMachine")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_stateMachine, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/edsdl", "StateMachine", "actualState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "State")));
          new Equality(body, var__virtual_0_, var_actualState);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
