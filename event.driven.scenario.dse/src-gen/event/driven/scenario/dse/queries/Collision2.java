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
 *         pattern collision2(e: DynamicEntity,p: DynamicEntity){
 *         	//DynamicEntity.name(p,"pedestrian");
 *         	DynamicEntity.position(p,pedestrianePos);
 *         	PositionAttribute.y(pedestrianePos,pedestrianPosY);
 *         	PositionAttribute.x(pedestrianePos,pedestrianPosX);
 *         	
 *         	//DynamicEntity.name(e,"ego");
 *         	DynamicEntity.position(e,egoPos);
 *         	PositionAttribute.x(egoPos,egoPosX);
 *         	PositionAttribute.y(egoPos,egoPosY);
 *         	egoPosX == pedestrianPosX;
 *         	pedestrianPosY == egoPosY;
 *         	//check(egoPosX == pedestrianPosX && pedestrianPosY == egoPosY);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Collision2 extends BaseGeneratedEMFQuerySpecification<Collision2.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.collision2 pattern,
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
    private DynamicEntity fE;
    
    private DynamicEntity fP;
    
    private static List<String> parameterNames = makeImmutableList("e", "p");
    
    private Match(final DynamicEntity pE, final DynamicEntity pP) {
      this.fE = pE;
      this.fP = pP;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "e": return this.fE;
          case "p": return this.fP;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fE;
          case 1: return this.fP;
          default: return null;
      }
    }
    
    public DynamicEntity getE() {
      return this.fE;
    }
    
    public DynamicEntity getP() {
      return this.fP;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("e".equals(parameterName) ) {
          this.fE = (DynamicEntity) newValue;
          return true;
      }
      if ("p".equals(parameterName) ) {
          this.fP = (DynamicEntity) newValue;
          return true;
      }
      return false;
    }
    
    public void setE(final DynamicEntity pE) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fE = pE;
    }
    
    public void setP(final DynamicEntity pP) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fP = pP;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.collision2";
    }
    
    @Override
    public List<String> parameterNames() {
      return Collision2.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fE, fP};
    }
    
    @Override
    public Collision2.Match toImmutable() {
      return isMutable() ? newMatch(fE, fP) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"e\"=" + prettyPrintValue(fE) + ", ");
      result.append("\"p\"=" + prettyPrintValue(fP));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fE, fP);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Collision2.Match)) {
          Collision2.Match other = (Collision2.Match) obj;
          return Objects.equals(fE, other.fE) && Objects.equals(fP, other.fP);
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
    public Collision2 specification() {
      return Collision2.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Collision2.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Collision2.Match newMutableMatch(final DynamicEntity pE, final DynamicEntity pP) {
      return new Mutable(pE, pP);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Collision2.Match newMatch(final DynamicEntity pE, final DynamicEntity pP) {
      return new Immutable(pE, pP);
    }
    
    private static final class Mutable extends Collision2.Match {
      Mutable(final DynamicEntity pE, final DynamicEntity pP) {
        super(pE, pP);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Collision2.Match {
      Immutable(final DynamicEntity pE, final DynamicEntity pP) {
        super(pE, pP);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.collision2 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern collision2(e: DynamicEntity,p: DynamicEntity){
   * 	//DynamicEntity.name(p,"pedestrian");
   * 	DynamicEntity.position(p,pedestrianePos);
   * 	PositionAttribute.y(pedestrianePos,pedestrianPosY);
   * 	PositionAttribute.x(pedestrianePos,pedestrianPosX);
   * 	
   * 	//DynamicEntity.name(e,"ego");
   * 	DynamicEntity.position(e,egoPos);
   * 	PositionAttribute.x(egoPos,egoPosX);
   * 	PositionAttribute.y(egoPos,egoPosY);
   * 	egoPosX == pedestrianPosX;
   * 	pedestrianPosY == egoPosY;
   * 	//check(egoPosX == pedestrianPosX && pedestrianPosY == egoPosY);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Collision2
   * 
   */
  public static class Matcher extends BaseMatcher<Collision2.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Collision2.Matcher on(final ViatraQueryEngine engine) {
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
    public static Collision2.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_E = 0;
    
    private static final int POSITION_P = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Collision2.Matcher.class);
    
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
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Collision2.Match> getAllMatches(final DynamicEntity pE, final DynamicEntity pP) {
      return rawStreamAllMatches(new Object[]{pE, pP}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Collision2.Match> streamAllMatches(final DynamicEntity pE, final DynamicEntity pP) {
      return rawStreamAllMatches(new Object[]{pE, pP});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Collision2.Match> getOneArbitraryMatch(final DynamicEntity pE, final DynamicEntity pP) {
      return rawGetOneArbitraryMatch(new Object[]{pE, pP});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DynamicEntity pE, final DynamicEntity pP) {
      return rawHasMatch(new Object[]{pE, pP});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DynamicEntity pE, final DynamicEntity pP) {
      return rawCountMatches(new Object[]{pE, pP});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DynamicEntity pE, final DynamicEntity pP, final Consumer<? super Collision2.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pE, pP}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Collision2.Match newMatch(final DynamicEntity pE, final DynamicEntity pP) {
      return Collision2.Match.newMatch(pE, pP);
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DynamicEntity> rawStreamAllValuesOfe(final Object[] parameters) {
      return rawStreamAllValues(POSITION_E, parameters).map(DynamicEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfe() {
      return rawStreamAllValuesOfe(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfe() {
      return rawStreamAllValuesOfe(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfe(final Collision2.Match partialMatch) {
      return rawStreamAllValuesOfe(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfe(final DynamicEntity pP) {
      return rawStreamAllValuesOfe(new Object[]{null, pP});
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfe(final Collision2.Match partialMatch) {
      return rawStreamAllValuesOfe(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfe(final DynamicEntity pP) {
      return rawStreamAllValuesOfe(new Object[]{null, pP}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DynamicEntity> rawStreamAllValuesOfp(final Object[] parameters) {
      return rawStreamAllValues(POSITION_P, parameters).map(DynamicEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfp() {
      return rawStreamAllValuesOfp(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfp() {
      return rawStreamAllValuesOfp(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfp(final Collision2.Match partialMatch) {
      return rawStreamAllValuesOfp(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfp(final DynamicEntity pE) {
      return rawStreamAllValuesOfp(new Object[]{pE, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfp(final Collision2.Match partialMatch) {
      return rawStreamAllValuesOfp(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfp(final DynamicEntity pE) {
      return rawStreamAllValuesOfp(new Object[]{pE, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Collision2.Match tupleToMatch(final Tuple t) {
      try {
          return Collision2.Match.newMatch((DynamicEntity) t.get(POSITION_E), (DynamicEntity) t.get(POSITION_P));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Collision2.Match arrayToMatch(final Object[] match) {
      try {
          return Collision2.Match.newMatch((DynamicEntity) match[POSITION_E], (DynamicEntity) match[POSITION_P]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Collision2.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Collision2.Match.newMutableMatch((DynamicEntity) match[POSITION_E], (DynamicEntity) match[POSITION_P]);
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
    public static IQuerySpecification<Collision2.Matcher> querySpecification() {
      return Collision2.instance();
    }
  }
  
  private Collision2() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Collision2 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Collision2.Matcher instantiate(final ViatraQueryEngine engine) {
    return Collision2.Matcher.on(engine);
  }
  
  @Override
  public Collision2.Matcher instantiate() {
    return Collision2.Matcher.create();
  }
  
  @Override
  public Collision2.Match newEmptyMatch() {
    return Collision2.Match.newEmptyMatch();
  }
  
  @Override
  public Collision2.Match newMatch(final Object... parameters) {
    return Collision2.Match.newMatch((scenedl.DynamicEntity) parameters[0], (scenedl.DynamicEntity) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Collision2} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Collision2#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Collision2 INSTANCE = new Collision2();
    
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
    private static final Collision2.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_e = new PParameter("e", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p = new PParameter("p", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_e, parameter_p);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.collision2";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("e","p");
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
          PVariable var_e = body.getOrCreateVariableByName("e");
          PVariable var_p = body.getOrCreateVariableByName("p");
          PVariable var_pedestrianePos = body.getOrCreateVariableByName("pedestrianePos");
          PVariable var_pedestrianPosY = body.getOrCreateVariableByName("pedestrianPosY");
          PVariable var_pedestrianPosX = body.getOrCreateVariableByName("pedestrianPosX");
          PVariable var_egoPos = body.getOrCreateVariableByName("egoPos");
          PVariable var_egoPosX = body.getOrCreateVariableByName("egoPosX");
          PVariable var_egoPosY = body.getOrCreateVariableByName("egoPosY");
          new TypeConstraint(body, Tuples.flatTupleOf(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_e, parameter_e),
             new ExportedParameter(body, var_p, parameter_p)
          ));
          // 	//DynamicEntity.name(p,"pedestrian");	DynamicEntity.position(p,pedestrianePos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_0_, var_pedestrianePos);
          // 	PositionAttribute.y(pedestrianePos,pedestrianPosY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianePos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianePos, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_1_, var_pedestrianPosY);
          // 	PositionAttribute.x(pedestrianePos,pedestrianPosX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianePos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianePos, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_2_, var_pedestrianPosX);
          // 		//DynamicEntity.name(e,"ego");	DynamicEntity.position(e,egoPos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_e, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_3_, var_egoPos);
          // 	PositionAttribute.x(egoPos,egoPosX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_egoPos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_egoPos, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_4_, var_egoPosX);
          // 	PositionAttribute.y(egoPos,egoPosY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_egoPos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_egoPos, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_5_, var_egoPosY);
          // 	egoPosX == pedestrianPosX
          new Equality(body, var_egoPosX, var_pedestrianPosX);
          // 	pedestrianPosY == egoPosY
          new Equality(body, var_pedestrianPosY, var_egoPosY);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
