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
import scenedl.DynamicEntity;
import scenedl.StaticEntity;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern inScene(entity: DynamicEntity,scene : Scene){
 *         	Scene.elements(scene,entity);
 *         	
 *         	Scene.boundry(scene,boundryPos);
 *         	PositionAttribute.x(boundryPos,boundryPosX);
 *         	PositionAttribute.y(boundryPos,boundryPosY);
 *         	
 *         	DynamicEntity.speed(entity,entitySpeed);
 *         	PositionAttribute.x(entitySpeed,speedX);
 *         	PositionAttribute.y(entitySpeed,speedY);
 *         	
 *         	DynamicEntity.position(entity,entityPos);
 *         	PositionAttribute.x(entityPos,posX);
 *         	PositionAttribute.y(entityPos,posY);
 *         	
 *         	check(posX {@literal <}= boundryPosX && posY {@literal <}= boundryPosY && posX {@literal >}= 0 && posY {@literal >}= 0);
 *         }
 *         
 *         
 *         
 *         pattern egoOnRoad(de: DynamicEntity,se: StaticEntity){		
 *         	DynamicEntity.on(de,se);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EgoOnRoad extends BaseGeneratedEMFQuerySpecification<EgoOnRoad.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.egoOnRoad pattern,
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
    private DynamicEntity fDe;
    
    private StaticEntity fSe;
    
    private static List<String> parameterNames = makeImmutableList("de", "se");
    
    private Match(final DynamicEntity pDe, final StaticEntity pSe) {
      this.fDe = pDe;
      this.fSe = pSe;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "de": return this.fDe;
          case "se": return this.fSe;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fDe;
          case 1: return this.fSe;
          default: return null;
      }
    }
    
    public DynamicEntity getDe() {
      return this.fDe;
    }
    
    public StaticEntity getSe() {
      return this.fSe;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("de".equals(parameterName) ) {
          this.fDe = (DynamicEntity) newValue;
          return true;
      }
      if ("se".equals(parameterName) ) {
          this.fSe = (StaticEntity) newValue;
          return true;
      }
      return false;
    }
    
    public void setDe(final DynamicEntity pDe) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDe = pDe;
    }
    
    public void setSe(final StaticEntity pSe) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSe = pSe;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.egoOnRoad";
    }
    
    @Override
    public List<String> parameterNames() {
      return EgoOnRoad.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDe, fSe};
    }
    
    @Override
    public EgoOnRoad.Match toImmutable() {
      return isMutable() ? newMatch(fDe, fSe) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"de\"=" + prettyPrintValue(fDe) + ", ");
      result.append("\"se\"=" + prettyPrintValue(fSe));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fDe, fSe);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EgoOnRoad.Match)) {
          EgoOnRoad.Match other = (EgoOnRoad.Match) obj;
          return Objects.equals(fDe, other.fDe) && Objects.equals(fSe, other.fSe);
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
    public EgoOnRoad specification() {
      return EgoOnRoad.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EgoOnRoad.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDe the fixed value of pattern parameter de, or null if not bound.
     * @param pSe the fixed value of pattern parameter se, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EgoOnRoad.Match newMutableMatch(final DynamicEntity pDe, final StaticEntity pSe) {
      return new Mutable(pDe, pSe);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDe the fixed value of pattern parameter de, or null if not bound.
     * @param pSe the fixed value of pattern parameter se, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EgoOnRoad.Match newMatch(final DynamicEntity pDe, final StaticEntity pSe) {
      return new Immutable(pDe, pSe);
    }
    
    private static final class Mutable extends EgoOnRoad.Match {
      Mutable(final DynamicEntity pDe, final StaticEntity pSe) {
        super(pDe, pSe);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EgoOnRoad.Match {
      Immutable(final DynamicEntity pDe, final StaticEntity pSe) {
        super(pDe, pSe);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.egoOnRoad pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern inScene(entity: DynamicEntity,scene : Scene){
   * 	Scene.elements(scene,entity);
   * 	
   * 	Scene.boundry(scene,boundryPos);
   * 	PositionAttribute.x(boundryPos,boundryPosX);
   * 	PositionAttribute.y(boundryPos,boundryPosY);
   * 	
   * 	DynamicEntity.speed(entity,entitySpeed);
   * 	PositionAttribute.x(entitySpeed,speedX);
   * 	PositionAttribute.y(entitySpeed,speedY);
   * 	
   * 	DynamicEntity.position(entity,entityPos);
   * 	PositionAttribute.x(entityPos,posX);
   * 	PositionAttribute.y(entityPos,posY);
   * 	
   * 	check(posX {@literal <}= boundryPosX && posY {@literal <}= boundryPosY && posX {@literal >}= 0 && posY {@literal >}= 0);
   * }
   * 
   * 
   * 
   * pattern egoOnRoad(de: DynamicEntity,se: StaticEntity){		
   * 	DynamicEntity.on(de,se);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EgoOnRoad
   * 
   */
  public static class Matcher extends BaseMatcher<EgoOnRoad.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EgoOnRoad.Matcher on(final ViatraQueryEngine engine) {
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
    public static EgoOnRoad.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_DE = 0;
    
    private static final int POSITION_SE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EgoOnRoad.Matcher.class);
    
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
     * @param pDe the fixed value of pattern parameter de, or null if not bound.
     * @param pSe the fixed value of pattern parameter se, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EgoOnRoad.Match> getAllMatches(final DynamicEntity pDe, final StaticEntity pSe) {
      return rawStreamAllMatches(new Object[]{pDe, pSe}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pDe the fixed value of pattern parameter de, or null if not bound.
     * @param pSe the fixed value of pattern parameter se, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EgoOnRoad.Match> streamAllMatches(final DynamicEntity pDe, final StaticEntity pSe) {
      return rawStreamAllMatches(new Object[]{pDe, pSe});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDe the fixed value of pattern parameter de, or null if not bound.
     * @param pSe the fixed value of pattern parameter se, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EgoOnRoad.Match> getOneArbitraryMatch(final DynamicEntity pDe, final StaticEntity pSe) {
      return rawGetOneArbitraryMatch(new Object[]{pDe, pSe});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDe the fixed value of pattern parameter de, or null if not bound.
     * @param pSe the fixed value of pattern parameter se, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DynamicEntity pDe, final StaticEntity pSe) {
      return rawHasMatch(new Object[]{pDe, pSe});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDe the fixed value of pattern parameter de, or null if not bound.
     * @param pSe the fixed value of pattern parameter se, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DynamicEntity pDe, final StaticEntity pSe) {
      return rawCountMatches(new Object[]{pDe, pSe});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDe the fixed value of pattern parameter de, or null if not bound.
     * @param pSe the fixed value of pattern parameter se, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DynamicEntity pDe, final StaticEntity pSe, final Consumer<? super EgoOnRoad.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDe, pSe}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDe the fixed value of pattern parameter de, or null if not bound.
     * @param pSe the fixed value of pattern parameter se, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EgoOnRoad.Match newMatch(final DynamicEntity pDe, final StaticEntity pSe) {
      return EgoOnRoad.Match.newMatch(pDe, pSe);
    }
    
    /**
     * Retrieve the set of values that occur in matches for de.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DynamicEntity> rawStreamAllValuesOfde(final Object[] parameters) {
      return rawStreamAllValues(POSITION_DE, parameters).map(DynamicEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for de.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfde() {
      return rawStreamAllValuesOfde(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for de.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfde() {
      return rawStreamAllValuesOfde(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for de.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfde(final EgoOnRoad.Match partialMatch) {
      return rawStreamAllValuesOfde(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for de.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfde(final StaticEntity pSe) {
      return rawStreamAllValuesOfde(new Object[]{null, pSe});
    }
    
    /**
     * Retrieve the set of values that occur in matches for de.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfde(final EgoOnRoad.Match partialMatch) {
      return rawStreamAllValuesOfde(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for de.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfde(final StaticEntity pSe) {
      return rawStreamAllValuesOfde(new Object[]{null, pSe}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for se.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<StaticEntity> rawStreamAllValuesOfse(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SE, parameters).map(StaticEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for se.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StaticEntity> getAllValuesOfse() {
      return rawStreamAllValuesOfse(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for se.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<StaticEntity> streamAllValuesOfse() {
      return rawStreamAllValuesOfse(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for se.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<StaticEntity> streamAllValuesOfse(final EgoOnRoad.Match partialMatch) {
      return rawStreamAllValuesOfse(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for se.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<StaticEntity> streamAllValuesOfse(final DynamicEntity pDe) {
      return rawStreamAllValuesOfse(new Object[]{pDe, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for se.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StaticEntity> getAllValuesOfse(final EgoOnRoad.Match partialMatch) {
      return rawStreamAllValuesOfse(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for se.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StaticEntity> getAllValuesOfse(final DynamicEntity pDe) {
      return rawStreamAllValuesOfse(new Object[]{pDe, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected EgoOnRoad.Match tupleToMatch(final Tuple t) {
      try {
          return EgoOnRoad.Match.newMatch((DynamicEntity) t.get(POSITION_DE), (StaticEntity) t.get(POSITION_SE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EgoOnRoad.Match arrayToMatch(final Object[] match) {
      try {
          return EgoOnRoad.Match.newMatch((DynamicEntity) match[POSITION_DE], (StaticEntity) match[POSITION_SE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EgoOnRoad.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EgoOnRoad.Match.newMutableMatch((DynamicEntity) match[POSITION_DE], (StaticEntity) match[POSITION_SE]);
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
    public static IQuerySpecification<EgoOnRoad.Matcher> querySpecification() {
      return EgoOnRoad.instance();
    }
  }
  
  private EgoOnRoad() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EgoOnRoad instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EgoOnRoad.Matcher instantiate(final ViatraQueryEngine engine) {
    return EgoOnRoad.Matcher.on(engine);
  }
  
  @Override
  public EgoOnRoad.Matcher instantiate() {
    return EgoOnRoad.Matcher.create();
  }
  
  @Override
  public EgoOnRoad.Match newEmptyMatch() {
    return EgoOnRoad.Match.newEmptyMatch();
  }
  
  @Override
  public EgoOnRoad.Match newMatch(final Object... parameters) {
    return EgoOnRoad.Match.newMatch((scenedl.DynamicEntity) parameters[0], (scenedl.StaticEntity) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EgoOnRoad} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EgoOnRoad#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EgoOnRoad INSTANCE = new EgoOnRoad();
    
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
    private static final EgoOnRoad.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_de = new PParameter("de", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_se = new PParameter("se", "scenedl.StaticEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "StaticEntity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_de, parameter_se);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.egoOnRoad";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("de","se");
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
          PVariable var_de = body.getOrCreateVariableByName("de");
          PVariable var_se = body.getOrCreateVariableByName("se");
          new TypeConstraint(body, Tuples.flatTupleOf(var_de), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_se), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "StaticEntity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_de, parameter_de),
             new ExportedParameter(body, var_se, parameter_se)
          ));
          // 			DynamicEntity.on(de,se)
          new TypeConstraint(body, Tuples.flatTupleOf(var_de), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_de, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "on")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "StaticEntity")));
          new Equality(body, var__virtual_0_, var_se);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
