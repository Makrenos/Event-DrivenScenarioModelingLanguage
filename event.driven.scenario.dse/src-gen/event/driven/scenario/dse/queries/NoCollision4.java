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
 *         pattern noCollision4(e: DynamicEntity,p: DynamicEntity,c1: DynamicEntity,c2: DynamicEntity){
 *         	//DynamicEntity.name(p,"pedestrian");
 *         	DynamicEntity.position(p,pedestrianePos);
 *         	PositionAttribute.y(pedestrianePos,pedestrianPosY);
 *         	PositionAttribute.x(pedestrianePos,pedestrianPosX);
 *         	
 *         	//DynamicEntity.name(c,"ego");
 *         	DynamicEntity.position(e,egoPos);
 *         	PositionAttribute.x(egoPos,egoPosX);
 *         	PositionAttribute.y(egoPos,egoPosY);
 *         	
 *         	DynamicEntity.position(c1,car1Pos);
 *         	PositionAttribute.x(car1Pos,car1PosX);
 *         	PositionAttribute.y(car1Pos,car1PosY);
 *         	
 *         	DynamicEntity.position(c2,car2Pos);
 *         	PositionAttribute.x(car2Pos,car2PosX);
 *         	PositionAttribute.y(car2Pos,car2PosY);
 *         	
 *         	check(egoPosX != pedestrianPosX && pedestrianPosY != egoPosY);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NoCollision4 extends BaseGeneratedEMFQuerySpecification<NoCollision4.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.noCollision4 pattern,
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
    
    private DynamicEntity fC1;
    
    private DynamicEntity fC2;
    
    private static List<String> parameterNames = makeImmutableList("e", "p", "c1", "c2");
    
    private Match(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
      this.fE = pE;
      this.fP = pP;
      this.fC1 = pC1;
      this.fC2 = pC2;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "e": return this.fE;
          case "p": return this.fP;
          case "c1": return this.fC1;
          case "c2": return this.fC2;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fE;
          case 1: return this.fP;
          case 2: return this.fC1;
          case 3: return this.fC2;
          default: return null;
      }
    }
    
    public DynamicEntity getE() {
      return this.fE;
    }
    
    public DynamicEntity getP() {
      return this.fP;
    }
    
    public DynamicEntity getC1() {
      return this.fC1;
    }
    
    public DynamicEntity getC2() {
      return this.fC2;
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
      if ("c1".equals(parameterName) ) {
          this.fC1 = (DynamicEntity) newValue;
          return true;
      }
      if ("c2".equals(parameterName) ) {
          this.fC2 = (DynamicEntity) newValue;
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
    
    public void setC1(final DynamicEntity pC1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fC1 = pC1;
    }
    
    public void setC2(final DynamicEntity pC2) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fC2 = pC2;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.noCollision4";
    }
    
    @Override
    public List<String> parameterNames() {
      return NoCollision4.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fE, fP, fC1, fC2};
    }
    
    @Override
    public NoCollision4.Match toImmutable() {
      return isMutable() ? newMatch(fE, fP, fC1, fC2) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"e\"=" + prettyPrintValue(fE) + ", ");
      result.append("\"p\"=" + prettyPrintValue(fP) + ", ");
      result.append("\"c1\"=" + prettyPrintValue(fC1) + ", ");
      result.append("\"c2\"=" + prettyPrintValue(fC2));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fE, fP, fC1, fC2);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NoCollision4.Match)) {
          NoCollision4.Match other = (NoCollision4.Match) obj;
          return Objects.equals(fE, other.fE) && Objects.equals(fP, other.fP) && Objects.equals(fC1, other.fC1) && Objects.equals(fC2, other.fC2);
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
    public NoCollision4 specification() {
      return NoCollision4.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NoCollision4.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NoCollision4.Match newMutableMatch(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
      return new Mutable(pE, pP, pC1, pC2);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NoCollision4.Match newMatch(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
      return new Immutable(pE, pP, pC1, pC2);
    }
    
    private static final class Mutable extends NoCollision4.Match {
      Mutable(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
        super(pE, pP, pC1, pC2);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends NoCollision4.Match {
      Immutable(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
        super(pE, pP, pC1, pC2);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.noCollision4 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern noCollision4(e: DynamicEntity,p: DynamicEntity,c1: DynamicEntity,c2: DynamicEntity){
   * 	//DynamicEntity.name(p,"pedestrian");
   * 	DynamicEntity.position(p,pedestrianePos);
   * 	PositionAttribute.y(pedestrianePos,pedestrianPosY);
   * 	PositionAttribute.x(pedestrianePos,pedestrianPosX);
   * 	
   * 	//DynamicEntity.name(c,"ego");
   * 	DynamicEntity.position(e,egoPos);
   * 	PositionAttribute.x(egoPos,egoPosX);
   * 	PositionAttribute.y(egoPos,egoPosY);
   * 	
   * 	DynamicEntity.position(c1,car1Pos);
   * 	PositionAttribute.x(car1Pos,car1PosX);
   * 	PositionAttribute.y(car1Pos,car1PosY);
   * 	
   * 	DynamicEntity.position(c2,car2Pos);
   * 	PositionAttribute.x(car2Pos,car2PosX);
   * 	PositionAttribute.y(car2Pos,car2PosY);
   * 	
   * 	check(egoPosX != pedestrianPosX && pedestrianPosY != egoPosY);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NoCollision4
   * 
   */
  public static class Matcher extends BaseMatcher<NoCollision4.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NoCollision4.Matcher on(final ViatraQueryEngine engine) {
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
    public static NoCollision4.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_E = 0;
    
    private static final int POSITION_P = 1;
    
    private static final int POSITION_C1 = 2;
    
    private static final int POSITION_C2 = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NoCollision4.Matcher.class);
    
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
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NoCollision4.Match> getAllMatches(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
      return rawStreamAllMatches(new Object[]{pE, pP, pC1, pC2}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NoCollision4.Match> streamAllMatches(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
      return rawStreamAllMatches(new Object[]{pE, pP, pC1, pC2});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NoCollision4.Match> getOneArbitraryMatch(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
      return rawGetOneArbitraryMatch(new Object[]{pE, pP, pC1, pC2});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
      return rawHasMatch(new Object[]{pE, pP, pC1, pC2});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
      return rawCountMatches(new Object[]{pE, pP, pC1, pC2});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2, final Consumer<? super NoCollision4.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pE, pP, pC1, pC2}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NoCollision4.Match newMatch(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
      return NoCollision4.Match.newMatch(pE, pP, pC1, pC2);
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
    public Stream<DynamicEntity> streamAllValuesOfe(final NoCollision4.Match partialMatch) {
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
    public Stream<DynamicEntity> streamAllValuesOfe(final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
      return rawStreamAllValuesOfe(new Object[]{null, pP, pC1, pC2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfe(final NoCollision4.Match partialMatch) {
      return rawStreamAllValuesOfe(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfe(final DynamicEntity pP, final DynamicEntity pC1, final DynamicEntity pC2) {
      return rawStreamAllValuesOfe(new Object[]{null, pP, pC1, pC2}).collect(Collectors.toSet());
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
    public Stream<DynamicEntity> streamAllValuesOfp(final NoCollision4.Match partialMatch) {
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
    public Stream<DynamicEntity> streamAllValuesOfp(final DynamicEntity pE, final DynamicEntity pC1, final DynamicEntity pC2) {
      return rawStreamAllValuesOfp(new Object[]{pE, null, pC1, pC2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfp(final NoCollision4.Match partialMatch) {
      return rawStreamAllValuesOfp(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfp(final DynamicEntity pE, final DynamicEntity pC1, final DynamicEntity pC2) {
      return rawStreamAllValuesOfp(new Object[]{pE, null, pC1, pC2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DynamicEntity> rawStreamAllValuesOfc1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_C1, parameters).map(DynamicEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfc1() {
      return rawStreamAllValuesOfc1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfc1() {
      return rawStreamAllValuesOfc1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfc1(final NoCollision4.Match partialMatch) {
      return rawStreamAllValuesOfc1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfc1(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC2) {
      return rawStreamAllValuesOfc1(new Object[]{pE, pP, null, pC2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfc1(final NoCollision4.Match partialMatch) {
      return rawStreamAllValuesOfc1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfc1(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC2) {
      return rawStreamAllValuesOfc1(new Object[]{pE, pP, null, pC2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DynamicEntity> rawStreamAllValuesOfc2(final Object[] parameters) {
      return rawStreamAllValues(POSITION_C2, parameters).map(DynamicEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfc2() {
      return rawStreamAllValuesOfc2(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfc2() {
      return rawStreamAllValuesOfc2(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfc2(final NoCollision4.Match partialMatch) {
      return rawStreamAllValuesOfc2(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfc2(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1) {
      return rawStreamAllValuesOfc2(new Object[]{pE, pP, pC1, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfc2(final NoCollision4.Match partialMatch) {
      return rawStreamAllValuesOfc2(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfc2(final DynamicEntity pE, final DynamicEntity pP, final DynamicEntity pC1) {
      return rawStreamAllValuesOfc2(new Object[]{pE, pP, pC1, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected NoCollision4.Match tupleToMatch(final Tuple t) {
      try {
          return NoCollision4.Match.newMatch((DynamicEntity) t.get(POSITION_E), (DynamicEntity) t.get(POSITION_P), (DynamicEntity) t.get(POSITION_C1), (DynamicEntity) t.get(POSITION_C2));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NoCollision4.Match arrayToMatch(final Object[] match) {
      try {
          return NoCollision4.Match.newMatch((DynamicEntity) match[POSITION_E], (DynamicEntity) match[POSITION_P], (DynamicEntity) match[POSITION_C1], (DynamicEntity) match[POSITION_C2]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NoCollision4.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NoCollision4.Match.newMutableMatch((DynamicEntity) match[POSITION_E], (DynamicEntity) match[POSITION_P], (DynamicEntity) match[POSITION_C1], (DynamicEntity) match[POSITION_C2]);
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
    public static IQuerySpecification<NoCollision4.Matcher> querySpecification() {
      return NoCollision4.instance();
    }
  }
  
  private NoCollision4() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NoCollision4 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected NoCollision4.Matcher instantiate(final ViatraQueryEngine engine) {
    return NoCollision4.Matcher.on(engine);
  }
  
  @Override
  public NoCollision4.Matcher instantiate() {
    return NoCollision4.Matcher.create();
  }
  
  @Override
  public NoCollision4.Match newEmptyMatch() {
    return NoCollision4.Match.newEmptyMatch();
  }
  
  @Override
  public NoCollision4.Match newMatch(final Object... parameters) {
    return NoCollision4.Match.newMatch((scenedl.DynamicEntity) parameters[0], (scenedl.DynamicEntity) parameters[1], (scenedl.DynamicEntity) parameters[2], (scenedl.DynamicEntity) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NoCollision4} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link NoCollision4#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NoCollision4 INSTANCE = new NoCollision4();
    
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
    private static final NoCollision4.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_e = new PParameter("e", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p = new PParameter("p", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_c1 = new PParameter("c1", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_c2 = new PParameter("c2", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_e, parameter_p, parameter_c1, parameter_c2);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.noCollision4";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("e","p","c1","c2");
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
          PVariable var_c1 = body.getOrCreateVariableByName("c1");
          PVariable var_c2 = body.getOrCreateVariableByName("c2");
          PVariable var_pedestrianePos = body.getOrCreateVariableByName("pedestrianePos");
          PVariable var_pedestrianPosY = body.getOrCreateVariableByName("pedestrianPosY");
          PVariable var_pedestrianPosX = body.getOrCreateVariableByName("pedestrianPosX");
          PVariable var_egoPos = body.getOrCreateVariableByName("egoPos");
          PVariable var_egoPosX = body.getOrCreateVariableByName("egoPosX");
          PVariable var_egoPosY = body.getOrCreateVariableByName("egoPosY");
          PVariable var_car1Pos = body.getOrCreateVariableByName("car1Pos");
          PVariable var_car1PosX = body.getOrCreateVariableByName("car1PosX");
          PVariable var_car1PosY = body.getOrCreateVariableByName("car1PosY");
          PVariable var_car2Pos = body.getOrCreateVariableByName("car2Pos");
          PVariable var_car2PosX = body.getOrCreateVariableByName("car2PosX");
          PVariable var_car2PosY = body.getOrCreateVariableByName("car2PosY");
          new TypeConstraint(body, Tuples.flatTupleOf(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_c1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_c2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_e, parameter_e),
             new ExportedParameter(body, var_p, parameter_p),
             new ExportedParameter(body, var_c1, parameter_c1),
             new ExportedParameter(body, var_c2, parameter_c2)
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
          // 		//DynamicEntity.name(c,"ego");	DynamicEntity.position(e,egoPos)
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
          // 		DynamicEntity.position(c1,car1Pos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_c1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_c1, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_6_, var_car1Pos);
          // 	PositionAttribute.x(car1Pos,car1PosX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_car1Pos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_car1Pos, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_7_, var_car1PosX);
          // 	PositionAttribute.y(car1Pos,car1PosY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_car1Pos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_car1Pos, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_8_, var_car1PosY);
          // 		DynamicEntity.position(c2,car2Pos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_c2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_c2, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_9_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_9_, var_car2Pos);
          // 	PositionAttribute.x(car2Pos,car2PosX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_car2Pos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_car2Pos, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_10_, var_car2PosX);
          // 	PositionAttribute.y(car2Pos,car2PosY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_car2Pos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_car2Pos, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_11_, var_car2PosY);
          // 		check(egoPosX != pedestrianPosX && pedestrianPosY != egoPosY)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern noCollision4";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("egoPosX", "egoPosY", "pedestrianPosX", "pedestrianPosY");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer egoPosX = (Integer) provider.getValue("egoPosX");
                  Integer egoPosY = (Integer) provider.getValue("egoPosY");
                  Integer pedestrianPosX = (Integer) provider.getValue("pedestrianPosX");
                  Integer pedestrianPosY = (Integer) provider.getValue("pedestrianPosY");
                  return evaluateExpression_1_1(egoPosX, egoPosY, pedestrianPosX, pedestrianPosY);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer egoPosX, final Integer egoPosY, final Integer pedestrianPosX, final Integer pedestrianPosY) {
    return ((!com.google.common.base.Objects.equal(egoPosX, pedestrianPosX)) && (!com.google.common.base.Objects.equal(pedestrianPosY, egoPosY)));
  }
}
