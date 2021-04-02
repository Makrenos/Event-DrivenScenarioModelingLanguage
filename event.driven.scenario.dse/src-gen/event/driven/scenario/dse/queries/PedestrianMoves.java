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
 *         pattern pedestrianMoves(scene: Scene, pedestrian: DynamicEntity, pedestrianPos: PositionAttribute){
 *         	Scene.elements(scene,pedestrian);
 *         	DynamicEntity.name(pedestrian,"pedestrian");
 *         	find inScene(pedestrian,scene);
 *         	DynamicEntity.position(pedestrian,pedestrianPos);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PedestrianMoves extends BaseGeneratedEMFQuerySpecification<PedestrianMoves.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.pedestrianMoves pattern,
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
    
    private DynamicEntity fPedestrian;
    
    private PositionAttribute fPedestrianPos;
    
    private static List<String> parameterNames = makeImmutableList("scene", "pedestrian", "pedestrianPos");
    
    private Match(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
      this.fScene = pScene;
      this.fPedestrian = pPedestrian;
      this.fPedestrianPos = pPedestrianPos;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "scene": return this.fScene;
          case "pedestrian": return this.fPedestrian;
          case "pedestrianPos": return this.fPedestrianPos;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fScene;
          case 1: return this.fPedestrian;
          case 2: return this.fPedestrianPos;
          default: return null;
      }
    }
    
    public Scene getScene() {
      return this.fScene;
    }
    
    public DynamicEntity getPedestrian() {
      return this.fPedestrian;
    }
    
    public PositionAttribute getPedestrianPos() {
      return this.fPedestrianPos;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("scene".equals(parameterName) ) {
          this.fScene = (Scene) newValue;
          return true;
      }
      if ("pedestrian".equals(parameterName) ) {
          this.fPedestrian = (DynamicEntity) newValue;
          return true;
      }
      if ("pedestrianPos".equals(parameterName) ) {
          this.fPedestrianPos = (PositionAttribute) newValue;
          return true;
      }
      return false;
    }
    
    public void setScene(final Scene pScene) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fScene = pScene;
    }
    
    public void setPedestrian(final DynamicEntity pPedestrian) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPedestrian = pPedestrian;
    }
    
    public void setPedestrianPos(final PositionAttribute pPedestrianPos) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPedestrianPos = pPedestrianPos;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.pedestrianMoves";
    }
    
    @Override
    public List<String> parameterNames() {
      return PedestrianMoves.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fScene, fPedestrian, fPedestrianPos};
    }
    
    @Override
    public PedestrianMoves.Match toImmutable() {
      return isMutable() ? newMatch(fScene, fPedestrian, fPedestrianPos) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"scene\"=" + prettyPrintValue(fScene) + ", ");
      result.append("\"pedestrian\"=" + prettyPrintValue(fPedestrian) + ", ");
      result.append("\"pedestrianPos\"=" + prettyPrintValue(fPedestrianPos));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fScene, fPedestrian, fPedestrianPos);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PedestrianMoves.Match)) {
          PedestrianMoves.Match other = (PedestrianMoves.Match) obj;
          return Objects.equals(fScene, other.fScene) && Objects.equals(fPedestrian, other.fPedestrian) && Objects.equals(fPedestrianPos, other.fPedestrianPos);
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
    public PedestrianMoves specification() {
      return PedestrianMoves.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PedestrianMoves.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pPedestrianPos the fixed value of pattern parameter pedestrianPos, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PedestrianMoves.Match newMutableMatch(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
      return new Mutable(pScene, pPedestrian, pPedestrianPos);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pPedestrianPos the fixed value of pattern parameter pedestrianPos, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PedestrianMoves.Match newMatch(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
      return new Immutable(pScene, pPedestrian, pPedestrianPos);
    }
    
    private static final class Mutable extends PedestrianMoves.Match {
      Mutable(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
        super(pScene, pPedestrian, pPedestrianPos);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PedestrianMoves.Match {
      Immutable(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
        super(pScene, pPedestrian, pPedestrianPos);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.pedestrianMoves pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern pedestrianMoves(scene: Scene, pedestrian: DynamicEntity, pedestrianPos: PositionAttribute){
   * 	Scene.elements(scene,pedestrian);
   * 	DynamicEntity.name(pedestrian,"pedestrian");
   * 	find inScene(pedestrian,scene);
   * 	DynamicEntity.position(pedestrian,pedestrianPos);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PedestrianMoves
   * 
   */
  public static class Matcher extends BaseMatcher<PedestrianMoves.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PedestrianMoves.Matcher on(final ViatraQueryEngine engine) {
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
    public static PedestrianMoves.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_SCENE = 0;
    
    private static final int POSITION_PEDESTRIAN = 1;
    
    private static final int POSITION_PEDESTRIANPOS = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PedestrianMoves.Matcher.class);
    
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
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pPedestrianPos the fixed value of pattern parameter pedestrianPos, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PedestrianMoves.Match> getAllMatches(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
      return rawStreamAllMatches(new Object[]{pScene, pPedestrian, pPedestrianPos}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pPedestrianPos the fixed value of pattern parameter pedestrianPos, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PedestrianMoves.Match> streamAllMatches(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
      return rawStreamAllMatches(new Object[]{pScene, pPedestrian, pPedestrianPos});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pPedestrianPos the fixed value of pattern parameter pedestrianPos, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PedestrianMoves.Match> getOneArbitraryMatch(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
      return rawGetOneArbitraryMatch(new Object[]{pScene, pPedestrian, pPedestrianPos});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pPedestrianPos the fixed value of pattern parameter pedestrianPos, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
      return rawHasMatch(new Object[]{pScene, pPedestrian, pPedestrianPos});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pPedestrianPos the fixed value of pattern parameter pedestrianPos, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
      return rawCountMatches(new Object[]{pScene, pPedestrian, pPedestrianPos});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pPedestrianPos the fixed value of pattern parameter pedestrianPos, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos, final Consumer<? super PedestrianMoves.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pScene, pPedestrian, pPedestrianPos}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param pPedestrian the fixed value of pattern parameter pedestrian, or null if not bound.
     * @param pPedestrianPos the fixed value of pattern parameter pedestrianPos, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PedestrianMoves.Match newMatch(final Scene pScene, final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
      return PedestrianMoves.Match.newMatch(pScene, pPedestrian, pPedestrianPos);
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
    public Stream<Scene> streamAllValuesOfscene(final PedestrianMoves.Match partialMatch) {
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
    public Stream<Scene> streamAllValuesOfscene(final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
      return rawStreamAllValuesOfscene(new Object[]{null, pPedestrian, pPedestrianPos});
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Scene> getAllValuesOfscene(final PedestrianMoves.Match partialMatch) {
      return rawStreamAllValuesOfscene(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Scene> getAllValuesOfscene(final DynamicEntity pPedestrian, final PositionAttribute pPedestrianPos) {
      return rawStreamAllValuesOfscene(new Object[]{null, pPedestrian, pPedestrianPos}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DynamicEntity> rawStreamAllValuesOfpedestrian(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PEDESTRIAN, parameters).map(DynamicEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfpedestrian() {
      return rawStreamAllValuesOfpedestrian(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfpedestrian() {
      return rawStreamAllValuesOfpedestrian(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfpedestrian(final PedestrianMoves.Match partialMatch) {
      return rawStreamAllValuesOfpedestrian(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfpedestrian(final Scene pScene, final PositionAttribute pPedestrianPos) {
      return rawStreamAllValuesOfpedestrian(new Object[]{pScene, null, pPedestrianPos});
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfpedestrian(final PedestrianMoves.Match partialMatch) {
      return rawStreamAllValuesOfpedestrian(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrian.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfpedestrian(final Scene pScene, final PositionAttribute pPedestrianPos) {
      return rawStreamAllValuesOfpedestrian(new Object[]{pScene, null, pPedestrianPos}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrianPos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<PositionAttribute> rawStreamAllValuesOfpedestrianPos(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PEDESTRIANPOS, parameters).map(PositionAttribute.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrianPos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PositionAttribute> getAllValuesOfpedestrianPos() {
      return rawStreamAllValuesOfpedestrianPos(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrianPos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<PositionAttribute> streamAllValuesOfpedestrianPos() {
      return rawStreamAllValuesOfpedestrianPos(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrianPos.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<PositionAttribute> streamAllValuesOfpedestrianPos(final PedestrianMoves.Match partialMatch) {
      return rawStreamAllValuesOfpedestrianPos(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrianPos.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<PositionAttribute> streamAllValuesOfpedestrianPos(final Scene pScene, final DynamicEntity pPedestrian) {
      return rawStreamAllValuesOfpedestrianPos(new Object[]{pScene, pPedestrian, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrianPos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PositionAttribute> getAllValuesOfpedestrianPos(final PedestrianMoves.Match partialMatch) {
      return rawStreamAllValuesOfpedestrianPos(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pedestrianPos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PositionAttribute> getAllValuesOfpedestrianPos(final Scene pScene, final DynamicEntity pPedestrian) {
      return rawStreamAllValuesOfpedestrianPos(new Object[]{pScene, pPedestrian, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected PedestrianMoves.Match tupleToMatch(final Tuple t) {
      try {
          return PedestrianMoves.Match.newMatch((Scene) t.get(POSITION_SCENE), (DynamicEntity) t.get(POSITION_PEDESTRIAN), (PositionAttribute) t.get(POSITION_PEDESTRIANPOS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PedestrianMoves.Match arrayToMatch(final Object[] match) {
      try {
          return PedestrianMoves.Match.newMatch((Scene) match[POSITION_SCENE], (DynamicEntity) match[POSITION_PEDESTRIAN], (PositionAttribute) match[POSITION_PEDESTRIANPOS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PedestrianMoves.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PedestrianMoves.Match.newMutableMatch((Scene) match[POSITION_SCENE], (DynamicEntity) match[POSITION_PEDESTRIAN], (PositionAttribute) match[POSITION_PEDESTRIANPOS]);
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
    public static IQuerySpecification<PedestrianMoves.Matcher> querySpecification() {
      return PedestrianMoves.instance();
    }
  }
  
  private PedestrianMoves() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PedestrianMoves instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PedestrianMoves.Matcher instantiate(final ViatraQueryEngine engine) {
    return PedestrianMoves.Matcher.on(engine);
  }
  
  @Override
  public PedestrianMoves.Matcher instantiate() {
    return PedestrianMoves.Matcher.create();
  }
  
  @Override
  public PedestrianMoves.Match newEmptyMatch() {
    return PedestrianMoves.Match.newEmptyMatch();
  }
  
  @Override
  public PedestrianMoves.Match newMatch(final Object... parameters) {
    return PedestrianMoves.Match.newMatch((scenedl.Scene) parameters[0], (scenedl.DynamicEntity) parameters[1], (scenedl.PositionAttribute) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link PedestrianMoves} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link PedestrianMoves#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final PedestrianMoves INSTANCE = new PedestrianMoves();
    
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
    private static final PedestrianMoves.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_scene = new PParameter("scene", "scenedl.Scene", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "Scene")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pedestrian = new PParameter("pedestrian", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pedestrianPos = new PParameter("pedestrianPos", "scenedl.PositionAttribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_scene, parameter_pedestrian, parameter_pedestrianPos);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.pedestrianMoves";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("scene","pedestrian","pedestrianPos");
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
          PVariable var_pedestrian = body.getOrCreateVariableByName("pedestrian");
          PVariable var_pedestrianPos = body.getOrCreateVariableByName("pedestrianPos");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrianPos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_scene, parameter_scene),
             new ExportedParameter(body, var_pedestrian, parameter_pedestrian),
             new ExportedParameter(body, var_pedestrianPos, parameter_pedestrianPos)
          ));
          // 	Scene.elements(scene,pedestrian)
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene", "elements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Element")));
          new Equality(body, var__virtual_0_, var_pedestrian);
          // 	DynamicEntity.name(pedestrian,"pedestrian")
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, "pedestrian");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Element", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var__virtual_1_);
          // 	find inScene(pedestrian,scene)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_pedestrian, var_scene), InScene.instance().getInternalQueryRepresentation());
          // 	DynamicEntity.position(pedestrian,pedestrianPos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pedestrian, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_3_, var_pedestrianPos);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
