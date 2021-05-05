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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
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
 *         pattern collision(d1: DynamicEntity,d2: DynamicEntity){
 *         	d1 != d2;
 *         	//DynamicEntity.name(p,"pedestrian");
 *         	DynamicEntity.position(d2,d2Pos);
 *         	PositionAttribute.y(d2Pos,d2PosY);
 *         	PositionAttribute.x(d2Pos,d2PosX);
 *         	
 *         	//DynamicEntity.name(e,"ego");
 *         	DynamicEntity.position(d1,d1Pos);
 *         	PositionAttribute.x(d1Pos,d1PosX);
 *         	PositionAttribute.y(d1Pos,d1PosY);
 *         	d1PosX == d2PosX;
 *         	d1PosY == d2PosY;
 *         	//check(egoPosX == pedestrianPosX && pedestrianPosY == egoPosY);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Collision extends BaseGeneratedEMFQuerySpecification<Collision.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.collision pattern,
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
    private DynamicEntity fD1;
    
    private DynamicEntity fD2;
    
    private static List<String> parameterNames = makeImmutableList("d1", "d2");
    
    private Match(final DynamicEntity pD1, final DynamicEntity pD2) {
      this.fD1 = pD1;
      this.fD2 = pD2;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "d1": return this.fD1;
          case "d2": return this.fD2;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fD1;
          case 1: return this.fD2;
          default: return null;
      }
    }
    
    public DynamicEntity getD1() {
      return this.fD1;
    }
    
    public DynamicEntity getD2() {
      return this.fD2;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("d1".equals(parameterName) ) {
          this.fD1 = (DynamicEntity) newValue;
          return true;
      }
      if ("d2".equals(parameterName) ) {
          this.fD2 = (DynamicEntity) newValue;
          return true;
      }
      return false;
    }
    
    public void setD1(final DynamicEntity pD1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fD1 = pD1;
    }
    
    public void setD2(final DynamicEntity pD2) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fD2 = pD2;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.collision";
    }
    
    @Override
    public List<String> parameterNames() {
      return Collision.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fD1, fD2};
    }
    
    @Override
    public Collision.Match toImmutable() {
      return isMutable() ? newMatch(fD1, fD2) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"d1\"=" + prettyPrintValue(fD1) + ", ");
      result.append("\"d2\"=" + prettyPrintValue(fD2));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fD1, fD2);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Collision.Match)) {
          Collision.Match other = (Collision.Match) obj;
          return Objects.equals(fD1, other.fD1) && Objects.equals(fD2, other.fD2);
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
    public Collision specification() {
      return Collision.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Collision.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pD1 the fixed value of pattern parameter d1, or null if not bound.
     * @param pD2 the fixed value of pattern parameter d2, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Collision.Match newMutableMatch(final DynamicEntity pD1, final DynamicEntity pD2) {
      return new Mutable(pD1, pD2);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pD1 the fixed value of pattern parameter d1, or null if not bound.
     * @param pD2 the fixed value of pattern parameter d2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Collision.Match newMatch(final DynamicEntity pD1, final DynamicEntity pD2) {
      return new Immutable(pD1, pD2);
    }
    
    private static final class Mutable extends Collision.Match {
      Mutable(final DynamicEntity pD1, final DynamicEntity pD2) {
        super(pD1, pD2);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Collision.Match {
      Immutable(final DynamicEntity pD1, final DynamicEntity pD2) {
        super(pD1, pD2);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.collision pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern collision(d1: DynamicEntity,d2: DynamicEntity){
   * 	d1 != d2;
   * 	//DynamicEntity.name(p,"pedestrian");
   * 	DynamicEntity.position(d2,d2Pos);
   * 	PositionAttribute.y(d2Pos,d2PosY);
   * 	PositionAttribute.x(d2Pos,d2PosX);
   * 	
   * 	//DynamicEntity.name(e,"ego");
   * 	DynamicEntity.position(d1,d1Pos);
   * 	PositionAttribute.x(d1Pos,d1PosX);
   * 	PositionAttribute.y(d1Pos,d1PosY);
   * 	d1PosX == d2PosX;
   * 	d1PosY == d2PosY;
   * 	//check(egoPosX == pedestrianPosX && pedestrianPosY == egoPosY);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Collision
   * 
   */
  public static class Matcher extends BaseMatcher<Collision.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Collision.Matcher on(final ViatraQueryEngine engine) {
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
    public static Collision.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_D1 = 0;
    
    private static final int POSITION_D2 = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Collision.Matcher.class);
    
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
     * @param pD1 the fixed value of pattern parameter d1, or null if not bound.
     * @param pD2 the fixed value of pattern parameter d2, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Collision.Match> getAllMatches(final DynamicEntity pD1, final DynamicEntity pD2) {
      return rawStreamAllMatches(new Object[]{pD1, pD2}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pD1 the fixed value of pattern parameter d1, or null if not bound.
     * @param pD2 the fixed value of pattern parameter d2, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Collision.Match> streamAllMatches(final DynamicEntity pD1, final DynamicEntity pD2) {
      return rawStreamAllMatches(new Object[]{pD1, pD2});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pD1 the fixed value of pattern parameter d1, or null if not bound.
     * @param pD2 the fixed value of pattern parameter d2, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Collision.Match> getOneArbitraryMatch(final DynamicEntity pD1, final DynamicEntity pD2) {
      return rawGetOneArbitraryMatch(new Object[]{pD1, pD2});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pD1 the fixed value of pattern parameter d1, or null if not bound.
     * @param pD2 the fixed value of pattern parameter d2, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DynamicEntity pD1, final DynamicEntity pD2) {
      return rawHasMatch(new Object[]{pD1, pD2});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pD1 the fixed value of pattern parameter d1, or null if not bound.
     * @param pD2 the fixed value of pattern parameter d2, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DynamicEntity pD1, final DynamicEntity pD2) {
      return rawCountMatches(new Object[]{pD1, pD2});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pD1 the fixed value of pattern parameter d1, or null if not bound.
     * @param pD2 the fixed value of pattern parameter d2, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DynamicEntity pD1, final DynamicEntity pD2, final Consumer<? super Collision.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pD1, pD2}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pD1 the fixed value of pattern parameter d1, or null if not bound.
     * @param pD2 the fixed value of pattern parameter d2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Collision.Match newMatch(final DynamicEntity pD1, final DynamicEntity pD2) {
      return Collision.Match.newMatch(pD1, pD2);
    }
    
    /**
     * Retrieve the set of values that occur in matches for d1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DynamicEntity> rawStreamAllValuesOfd1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_D1, parameters).map(DynamicEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for d1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfd1() {
      return rawStreamAllValuesOfd1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for d1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfd1() {
      return rawStreamAllValuesOfd1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for d1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfd1(final Collision.Match partialMatch) {
      return rawStreamAllValuesOfd1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for d1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfd1(final DynamicEntity pD2) {
      return rawStreamAllValuesOfd1(new Object[]{null, pD2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for d1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfd1(final Collision.Match partialMatch) {
      return rawStreamAllValuesOfd1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for d1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfd1(final DynamicEntity pD2) {
      return rawStreamAllValuesOfd1(new Object[]{null, pD2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for d2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DynamicEntity> rawStreamAllValuesOfd2(final Object[] parameters) {
      return rawStreamAllValues(POSITION_D2, parameters).map(DynamicEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for d2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfd2() {
      return rawStreamAllValuesOfd2(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for d2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfd2() {
      return rawStreamAllValuesOfd2(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for d2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfd2(final Collision.Match partialMatch) {
      return rawStreamAllValuesOfd2(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for d2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfd2(final DynamicEntity pD1) {
      return rawStreamAllValuesOfd2(new Object[]{pD1, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for d2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfd2(final Collision.Match partialMatch) {
      return rawStreamAllValuesOfd2(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for d2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfd2(final DynamicEntity pD1) {
      return rawStreamAllValuesOfd2(new Object[]{pD1, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Collision.Match tupleToMatch(final Tuple t) {
      try {
          return Collision.Match.newMatch((DynamicEntity) t.get(POSITION_D1), (DynamicEntity) t.get(POSITION_D2));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Collision.Match arrayToMatch(final Object[] match) {
      try {
          return Collision.Match.newMatch((DynamicEntity) match[POSITION_D1], (DynamicEntity) match[POSITION_D2]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Collision.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Collision.Match.newMutableMatch((DynamicEntity) match[POSITION_D1], (DynamicEntity) match[POSITION_D2]);
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
    public static IQuerySpecification<Collision.Matcher> querySpecification() {
      return Collision.instance();
    }
  }
  
  private Collision() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Collision instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Collision.Matcher instantiate(final ViatraQueryEngine engine) {
    return Collision.Matcher.on(engine);
  }
  
  @Override
  public Collision.Matcher instantiate() {
    return Collision.Matcher.create();
  }
  
  @Override
  public Collision.Match newEmptyMatch() {
    return Collision.Match.newEmptyMatch();
  }
  
  @Override
  public Collision.Match newMatch(final Object... parameters) {
    return Collision.Match.newMatch((scenedl.DynamicEntity) parameters[0], (scenedl.DynamicEntity) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Collision} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Collision#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Collision INSTANCE = new Collision();
    
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
    private static final Collision.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_d1 = new PParameter("d1", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_d2 = new PParameter("d2", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_d1, parameter_d2);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.collision";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("d1","d2");
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
          PVariable var_d1 = body.getOrCreateVariableByName("d1");
          PVariable var_d2 = body.getOrCreateVariableByName("d2");
          PVariable var_d2Pos = body.getOrCreateVariableByName("d2Pos");
          PVariable var_d2PosY = body.getOrCreateVariableByName("d2PosY");
          PVariable var_d2PosX = body.getOrCreateVariableByName("d2PosX");
          PVariable var_d1Pos = body.getOrCreateVariableByName("d1Pos");
          PVariable var_d1PosX = body.getOrCreateVariableByName("d1PosX");
          PVariable var_d1PosY = body.getOrCreateVariableByName("d1PosY");
          new TypeConstraint(body, Tuples.flatTupleOf(var_d1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_d2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_d1, parameter_d1),
             new ExportedParameter(body, var_d2, parameter_d2)
          ));
          // 	d1 != d2
          new Inequality(body, var_d1, var_d2);
          // 	//DynamicEntity.name(p,"pedestrian");	DynamicEntity.position(d2,d2Pos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_d2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_d2, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_0_, var_d2Pos);
          // 	PositionAttribute.y(d2Pos,d2PosY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_d2Pos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_d2Pos, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_1_, var_d2PosY);
          // 	PositionAttribute.x(d2Pos,d2PosX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_d2Pos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_d2Pos, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_2_, var_d2PosX);
          // 		//DynamicEntity.name(e,"ego");	DynamicEntity.position(d1,d1Pos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_d1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_d1, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_3_, var_d1Pos);
          // 	PositionAttribute.x(d1Pos,d1PosX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_d1Pos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_d1Pos, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_4_, var_d1PosX);
          // 	PositionAttribute.y(d1Pos,d1PosY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_d1Pos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_d1Pos, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_5_, var_d1PosY);
          // 	d1PosX == d2PosX
          new Equality(body, var_d1PosX, var_d2PosX);
          // 	d1PosY == d2PosY
          new Equality(body, var_d1PosY, var_d2PosY);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
