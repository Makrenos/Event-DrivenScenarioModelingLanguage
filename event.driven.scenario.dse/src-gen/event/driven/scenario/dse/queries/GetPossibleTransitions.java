/**
 * Generated from platform:/resource/event.driven.scenario.dl.dse/src/event/driven/scenario/dse/queries/queries.vql
 */
package event.driven.scenario.dse.queries;

import edsdl.State;
import edsdl.StateMachine;
import edsdl.Transition;
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
 *         pattern getPossibleTransitions(stateMachine : StateMachine,actualState: State,t : Transition){
 *         	StateMachine.runtimestate(stateMachine,r);
 *         	RuntimeState.actualState(r,actualState);
 *         	State.outTransitions(actualState,t);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class GetPossibleTransitions extends BaseGeneratedEMFQuerySpecification<GetPossibleTransitions.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.getPossibleTransitions pattern,
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
    private StateMachine fStateMachine;
    
    private State fActualState;
    
    private Transition fT;
    
    private static List<String> parameterNames = makeImmutableList("stateMachine", "actualState", "t");
    
    private Match(final StateMachine pStateMachine, final State pActualState, final Transition pT) {
      this.fStateMachine = pStateMachine;
      this.fActualState = pActualState;
      this.fT = pT;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "stateMachine": return this.fStateMachine;
          case "actualState": return this.fActualState;
          case "t": return this.fT;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fStateMachine;
          case 1: return this.fActualState;
          case 2: return this.fT;
          default: return null;
      }
    }
    
    public StateMachine getStateMachine() {
      return this.fStateMachine;
    }
    
    public State getActualState() {
      return this.fActualState;
    }
    
    public Transition getT() {
      return this.fT;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("stateMachine".equals(parameterName) ) {
          this.fStateMachine = (StateMachine) newValue;
          return true;
      }
      if ("actualState".equals(parameterName) ) {
          this.fActualState = (State) newValue;
          return true;
      }
      if ("t".equals(parameterName) ) {
          this.fT = (Transition) newValue;
          return true;
      }
      return false;
    }
    
    public void setStateMachine(final StateMachine pStateMachine) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStateMachine = pStateMachine;
    }
    
    public void setActualState(final State pActualState) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fActualState = pActualState;
    }
    
    public void setT(final Transition pT) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT = pT;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.getPossibleTransitions";
    }
    
    @Override
    public List<String> parameterNames() {
      return GetPossibleTransitions.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fStateMachine, fActualState, fT};
    }
    
    @Override
    public GetPossibleTransitions.Match toImmutable() {
      return isMutable() ? newMatch(fStateMachine, fActualState, fT) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"stateMachine\"=" + prettyPrintValue(fStateMachine) + ", ");
      result.append("\"actualState\"=" + prettyPrintValue(fActualState) + ", ");
      result.append("\"t\"=" + prettyPrintValue(fT));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fStateMachine, fActualState, fT);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof GetPossibleTransitions.Match)) {
          GetPossibleTransitions.Match other = (GetPossibleTransitions.Match) obj;
          return Objects.equals(fStateMachine, other.fStateMachine) && Objects.equals(fActualState, other.fActualState) && Objects.equals(fT, other.fT);
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
    public GetPossibleTransitions specification() {
      return GetPossibleTransitions.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static GetPossibleTransitions.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static GetPossibleTransitions.Match newMutableMatch(final StateMachine pStateMachine, final State pActualState, final Transition pT) {
      return new Mutable(pStateMachine, pActualState, pT);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static GetPossibleTransitions.Match newMatch(final StateMachine pStateMachine, final State pActualState, final Transition pT) {
      return new Immutable(pStateMachine, pActualState, pT);
    }
    
    private static final class Mutable extends GetPossibleTransitions.Match {
      Mutable(final StateMachine pStateMachine, final State pActualState, final Transition pT) {
        super(pStateMachine, pActualState, pT);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends GetPossibleTransitions.Match {
      Immutable(final StateMachine pStateMachine, final State pActualState, final Transition pT) {
        super(pStateMachine, pActualState, pT);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.getPossibleTransitions pattern,
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
   * pattern getPossibleTransitions(stateMachine : StateMachine,actualState: State,t : Transition){
   * 	StateMachine.runtimestate(stateMachine,r);
   * 	RuntimeState.actualState(r,actualState);
   * 	State.outTransitions(actualState,t);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see GetPossibleTransitions
   * 
   */
  public static class Matcher extends BaseMatcher<GetPossibleTransitions.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static GetPossibleTransitions.Matcher on(final ViatraQueryEngine engine) {
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
    public static GetPossibleTransitions.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_STATEMACHINE = 0;
    
    private static final int POSITION_ACTUALSTATE = 1;
    
    private static final int POSITION_T = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(GetPossibleTransitions.Matcher.class);
    
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
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<GetPossibleTransitions.Match> getAllMatches(final StateMachine pStateMachine, final State pActualState, final Transition pT) {
      return rawStreamAllMatches(new Object[]{pStateMachine, pActualState, pT}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<GetPossibleTransitions.Match> streamAllMatches(final StateMachine pStateMachine, final State pActualState, final Transition pT) {
      return rawStreamAllMatches(new Object[]{pStateMachine, pActualState, pT});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<GetPossibleTransitions.Match> getOneArbitraryMatch(final StateMachine pStateMachine, final State pActualState, final Transition pT) {
      return rawGetOneArbitraryMatch(new Object[]{pStateMachine, pActualState, pT});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final StateMachine pStateMachine, final State pActualState, final Transition pT) {
      return rawHasMatch(new Object[]{pStateMachine, pActualState, pT});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final StateMachine pStateMachine, final State pActualState, final Transition pT) {
      return rawCountMatches(new Object[]{pStateMachine, pActualState, pT});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final StateMachine pStateMachine, final State pActualState, final Transition pT, final Consumer<? super GetPossibleTransitions.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pStateMachine, pActualState, pT}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStateMachine the fixed value of pattern parameter stateMachine, or null if not bound.
     * @param pActualState the fixed value of pattern parameter actualState, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public GetPossibleTransitions.Match newMatch(final StateMachine pStateMachine, final State pActualState, final Transition pT) {
      return GetPossibleTransitions.Match.newMatch(pStateMachine, pActualState, pT);
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
    public Stream<StateMachine> streamAllValuesOfstateMachine(final GetPossibleTransitions.Match partialMatch) {
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
    public Stream<StateMachine> streamAllValuesOfstateMachine(final State pActualState, final Transition pT) {
      return rawStreamAllValuesOfstateMachine(new Object[]{null, pActualState, pT});
    }
    
    /**
     * Retrieve the set of values that occur in matches for stateMachine.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StateMachine> getAllValuesOfstateMachine(final GetPossibleTransitions.Match partialMatch) {
      return rawStreamAllValuesOfstateMachine(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for stateMachine.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StateMachine> getAllValuesOfstateMachine(final State pActualState, final Transition pT) {
      return rawStreamAllValuesOfstateMachine(new Object[]{null, pActualState, pT}).collect(Collectors.toSet());
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
    public Stream<State> streamAllValuesOfactualState(final GetPossibleTransitions.Match partialMatch) {
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
    public Stream<State> streamAllValuesOfactualState(final StateMachine pStateMachine, final Transition pT) {
      return rawStreamAllValuesOfactualState(new Object[]{pStateMachine, null, pT});
    }
    
    /**
     * Retrieve the set of values that occur in matches for actualState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfactualState(final GetPossibleTransitions.Match partialMatch) {
      return rawStreamAllValuesOfactualState(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for actualState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfactualState(final StateMachine pStateMachine, final Transition pT) {
      return rawStreamAllValuesOfactualState(new Object[]{pStateMachine, null, pT}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Transition> rawStreamAllValuesOft(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T, parameters).map(Transition.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft() {
      return rawStreamAllValuesOft(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft() {
      return rawStreamAllValuesOft(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft(final GetPossibleTransitions.Match partialMatch) {
      return rawStreamAllValuesOft(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft(final StateMachine pStateMachine, final State pActualState) {
      return rawStreamAllValuesOft(new Object[]{pStateMachine, pActualState, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft(final GetPossibleTransitions.Match partialMatch) {
      return rawStreamAllValuesOft(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft(final StateMachine pStateMachine, final State pActualState) {
      return rawStreamAllValuesOft(new Object[]{pStateMachine, pActualState, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected GetPossibleTransitions.Match tupleToMatch(final Tuple t) {
      try {
          return GetPossibleTransitions.Match.newMatch((StateMachine) t.get(POSITION_STATEMACHINE), (State) t.get(POSITION_ACTUALSTATE), (Transition) t.get(POSITION_T));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected GetPossibleTransitions.Match arrayToMatch(final Object[] match) {
      try {
          return GetPossibleTransitions.Match.newMatch((StateMachine) match[POSITION_STATEMACHINE], (State) match[POSITION_ACTUALSTATE], (Transition) match[POSITION_T]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected GetPossibleTransitions.Match arrayToMatchMutable(final Object[] match) {
      try {
          return GetPossibleTransitions.Match.newMutableMatch((StateMachine) match[POSITION_STATEMACHINE], (State) match[POSITION_ACTUALSTATE], (Transition) match[POSITION_T]);
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
    public static IQuerySpecification<GetPossibleTransitions.Matcher> querySpecification() {
      return GetPossibleTransitions.instance();
    }
  }
  
  private GetPossibleTransitions() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static GetPossibleTransitions instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected GetPossibleTransitions.Matcher instantiate(final ViatraQueryEngine engine) {
    return GetPossibleTransitions.Matcher.on(engine);
  }
  
  @Override
  public GetPossibleTransitions.Matcher instantiate() {
    return GetPossibleTransitions.Matcher.create();
  }
  
  @Override
  public GetPossibleTransitions.Match newEmptyMatch() {
    return GetPossibleTransitions.Match.newEmptyMatch();
  }
  
  @Override
  public GetPossibleTransitions.Match newMatch(final Object... parameters) {
    return GetPossibleTransitions.Match.newMatch((edsdl.StateMachine) parameters[0], (edsdl.State) parameters[1], (edsdl.Transition) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link GetPossibleTransitions} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link GetPossibleTransitions#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final GetPossibleTransitions INSTANCE = new GetPossibleTransitions();
    
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
    private static final GetPossibleTransitions.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_stateMachine = new PParameter("stateMachine", "edsdl.StateMachine", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/edsdl", "StateMachine")), PParameterDirection.INOUT);
    
    private final PParameter parameter_actualState = new PParameter("actualState", "edsdl.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/edsdl", "State")), PParameterDirection.INOUT);
    
    private final PParameter parameter_t = new PParameter("t", "edsdl.Transition", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/edsdl", "Transition")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_stateMachine, parameter_actualState, parameter_t);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.getPossibleTransitions";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("stateMachine","actualState","t");
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
          PVariable var_stateMachine = body.getOrCreateVariableByName("stateMachine");
          PVariable var_actualState = body.getOrCreateVariableByName("actualState");
          PVariable var_t = body.getOrCreateVariableByName("t");
          PVariable var_r = body.getOrCreateVariableByName("r");
          new TypeConstraint(body, Tuples.flatTupleOf(var_stateMachine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "StateMachine")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_actualState), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "State")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "Transition")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_stateMachine, parameter_stateMachine),
             new ExportedParameter(body, var_actualState, parameter_actualState),
             new ExportedParameter(body, var_t, parameter_t)
          ));
          // 	StateMachine.runtimestate(stateMachine,r)
          new TypeConstraint(body, Tuples.flatTupleOf(var_stateMachine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "StateMachine")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_stateMachine, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/edsdl", "StateMachine", "runtimestate")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "RuntimeState")));
          new Equality(body, var__virtual_0_, var_r);
          // 	RuntimeState.actualState(r,actualState)
          new TypeConstraint(body, Tuples.flatTupleOf(var_r), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "RuntimeState")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_r, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/edsdl", "RuntimeState", "actualState")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "State")));
          new Equality(body, var__virtual_1_, var_actualState);
          // 	State.outTransitions(actualState,t)
          new TypeConstraint(body, Tuples.flatTupleOf(var_actualState), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "State")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_actualState, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/edsdl", "State", "outTransitions")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/edsdl", "Transition")));
          new Equality(body, var__virtual_2_, var_t);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
