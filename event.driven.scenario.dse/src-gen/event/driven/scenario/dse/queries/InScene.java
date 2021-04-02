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
import scenedl.Scene;

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
 *         	DynamicEntity.position(entity,entityPos);
 *         	PositionAttribute.x(entityPos,posX);
 *         	PositionAttribute.y(entityPos,posY);
 *         	
 *         	check(posX {@literal <}= boundryPosX && posY {@literal <}= boundryPosY);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class InScene extends BaseGeneratedEMFQuerySpecification<InScene.Matcher> {
  /**
   * Pattern-specific match representation of the event.driven.scenario.dse.queries.inScene pattern,
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
    private DynamicEntity fEntity;
    
    private Scene fScene;
    
    private static List<String> parameterNames = makeImmutableList("entity", "scene");
    
    private Match(final DynamicEntity pEntity, final Scene pScene) {
      this.fEntity = pEntity;
      this.fScene = pScene;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "entity": return this.fEntity;
          case "scene": return this.fScene;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEntity;
          case 1: return this.fScene;
          default: return null;
      }
    }
    
    public DynamicEntity getEntity() {
      return this.fEntity;
    }
    
    public Scene getScene() {
      return this.fScene;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("entity".equals(parameterName) ) {
          this.fEntity = (DynamicEntity) newValue;
          return true;
      }
      if ("scene".equals(parameterName) ) {
          this.fScene = (Scene) newValue;
          return true;
      }
      return false;
    }
    
    public void setEntity(final DynamicEntity pEntity) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEntity = pEntity;
    }
    
    public void setScene(final Scene pScene) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fScene = pScene;
    }
    
    @Override
    public String patternName() {
      return "event.driven.scenario.dse.queries.inScene";
    }
    
    @Override
    public List<String> parameterNames() {
      return InScene.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEntity, fScene};
    }
    
    @Override
    public InScene.Match toImmutable() {
      return isMutable() ? newMatch(fEntity, fScene) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"entity\"=" + prettyPrintValue(fEntity) + ", ");
      result.append("\"scene\"=" + prettyPrintValue(fScene));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEntity, fScene);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof InScene.Match)) {
          InScene.Match other = (InScene.Match) obj;
          return Objects.equals(fEntity, other.fEntity) && Objects.equals(fScene, other.fScene);
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
    public InScene specification() {
      return InScene.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static InScene.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static InScene.Match newMutableMatch(final DynamicEntity pEntity, final Scene pScene) {
      return new Mutable(pEntity, pScene);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static InScene.Match newMatch(final DynamicEntity pEntity, final Scene pScene) {
      return new Immutable(pEntity, pScene);
    }
    
    private static final class Mutable extends InScene.Match {
      Mutable(final DynamicEntity pEntity, final Scene pScene) {
        super(pEntity, pScene);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends InScene.Match {
      Immutable(final DynamicEntity pEntity, final Scene pScene) {
        super(pEntity, pScene);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the event.driven.scenario.dse.queries.inScene pattern,
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
   * 	DynamicEntity.position(entity,entityPos);
   * 	PositionAttribute.x(entityPos,posX);
   * 	PositionAttribute.y(entityPos,posY);
   * 	
   * 	check(posX {@literal <}= boundryPosX && posY {@literal <}= boundryPosY);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see InScene
   * 
   */
  public static class Matcher extends BaseMatcher<InScene.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static InScene.Matcher on(final ViatraQueryEngine engine) {
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
    public static InScene.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ENTITY = 0;
    
    private static final int POSITION_SCENE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(InScene.Matcher.class);
    
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
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<InScene.Match> getAllMatches(final DynamicEntity pEntity, final Scene pScene) {
      return rawStreamAllMatches(new Object[]{pEntity, pScene}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<InScene.Match> streamAllMatches(final DynamicEntity pEntity, final Scene pScene) {
      return rawStreamAllMatches(new Object[]{pEntity, pScene});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<InScene.Match> getOneArbitraryMatch(final DynamicEntity pEntity, final Scene pScene) {
      return rawGetOneArbitraryMatch(new Object[]{pEntity, pScene});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DynamicEntity pEntity, final Scene pScene) {
      return rawHasMatch(new Object[]{pEntity, pScene});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DynamicEntity pEntity, final Scene pScene) {
      return rawCountMatches(new Object[]{pEntity, pScene});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DynamicEntity pEntity, final Scene pScene, final Consumer<? super InScene.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEntity, pScene}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pScene the fixed value of pattern parameter scene, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public InScene.Match newMatch(final DynamicEntity pEntity, final Scene pScene) {
      return InScene.Match.newMatch(pEntity, pScene);
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DynamicEntity> rawStreamAllValuesOfentity(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ENTITY, parameters).map(DynamicEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfentity() {
      return rawStreamAllValuesOfentity(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfentity() {
      return rawStreamAllValuesOfentity(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfentity(final InScene.Match partialMatch) {
      return rawStreamAllValuesOfentity(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DynamicEntity> streamAllValuesOfentity(final Scene pScene) {
      return rawStreamAllValuesOfentity(new Object[]{null, pScene});
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfentity(final InScene.Match partialMatch) {
      return rawStreamAllValuesOfentity(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DynamicEntity> getAllValuesOfentity(final Scene pScene) {
      return rawStreamAllValuesOfentity(new Object[]{null, pScene}).collect(Collectors.toSet());
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
    public Stream<Scene> streamAllValuesOfscene(final InScene.Match partialMatch) {
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
    public Stream<Scene> streamAllValuesOfscene(final DynamicEntity pEntity) {
      return rawStreamAllValuesOfscene(new Object[]{pEntity, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Scene> getAllValuesOfscene(final InScene.Match partialMatch) {
      return rawStreamAllValuesOfscene(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for scene.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Scene> getAllValuesOfscene(final DynamicEntity pEntity) {
      return rawStreamAllValuesOfscene(new Object[]{pEntity, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected InScene.Match tupleToMatch(final Tuple t) {
      try {
          return InScene.Match.newMatch((DynamicEntity) t.get(POSITION_ENTITY), (Scene) t.get(POSITION_SCENE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected InScene.Match arrayToMatch(final Object[] match) {
      try {
          return InScene.Match.newMatch((DynamicEntity) match[POSITION_ENTITY], (Scene) match[POSITION_SCENE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected InScene.Match arrayToMatchMutable(final Object[] match) {
      try {
          return InScene.Match.newMutableMatch((DynamicEntity) match[POSITION_ENTITY], (Scene) match[POSITION_SCENE]);
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
    public static IQuerySpecification<InScene.Matcher> querySpecification() {
      return InScene.instance();
    }
  }
  
  private InScene() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static InScene instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected InScene.Matcher instantiate(final ViatraQueryEngine engine) {
    return InScene.Matcher.on(engine);
  }
  
  @Override
  public InScene.Matcher instantiate() {
    return InScene.Matcher.create();
  }
  
  @Override
  public InScene.Match newEmptyMatch() {
    return InScene.Match.newEmptyMatch();
  }
  
  @Override
  public InScene.Match newMatch(final Object... parameters) {
    return InScene.Match.newMatch((scenedl.DynamicEntity) parameters[0], (scenedl.Scene) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link InScene} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link InScene#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final InScene INSTANCE = new InScene();
    
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
    private static final InScene.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_entity = new PParameter("entity", "scenedl.DynamicEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_scene = new PParameter("scene", "scenedl.Scene", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eventDrivenScenario.org/scenedl", "Scene")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_entity, parameter_scene);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "event.driven.scenario.dse.queries.inScene";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("entity","scene");
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
          PVariable var_entity = body.getOrCreateVariableByName("entity");
          PVariable var_scene = body.getOrCreateVariableByName("scene");
          PVariable var_boundryPos = body.getOrCreateVariableByName("boundryPos");
          PVariable var_boundryPosX = body.getOrCreateVariableByName("boundryPosX");
          PVariable var_boundryPosY = body.getOrCreateVariableByName("boundryPosY");
          PVariable var_entityPos = body.getOrCreateVariableByName("entityPos");
          PVariable var_posX = body.getOrCreateVariableByName("posX");
          PVariable var_posY = body.getOrCreateVariableByName("posY");
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_entity, parameter_entity),
             new ExportedParameter(body, var_scene, parameter_scene)
          ));
          // 	Scene.elements(scene,entity)
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene", "elements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Element")));
          new Equality(body, var__virtual_0_, var_entity);
          // 		Scene.boundry(scene,boundryPos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_scene, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "Scene", "boundry")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_1_, var_boundryPos);
          // 	PositionAttribute.x(boundryPos,boundryPosX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_boundryPos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_boundryPos, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_2_, var_boundryPosX);
          // 	PositionAttribute.y(boundryPos,boundryPosY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_boundryPos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_boundryPos, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_3_, var_boundryPosY);
          // 		DynamicEntity.position(entity,entityPos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "DynamicEntity", "position")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          new Equality(body, var__virtual_4_, var_entityPos);
          // 	PositionAttribute.x(entityPos,posX)
          new TypeConstraint(body, Tuples.flatTupleOf(var_entityPos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_entityPos, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "x")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_5_, var_posX);
          // 	PositionAttribute.y(entityPos,posY)
          new TypeConstraint(body, Tuples.flatTupleOf(var_entityPos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_entityPos, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eventDrivenScenario.org/scenedl", "PositionAttribute", "y")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_6_, var_posY);
          // 		check(posX <= boundryPosX && posY <= boundryPosY)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern inScene";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("boundryPosX", "boundryPosY", "posX", "posY");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer boundryPosX = (Integer) provider.getValue("boundryPosX");
                  Integer boundryPosY = (Integer) provider.getValue("boundryPosY");
                  Integer posX = (Integer) provider.getValue("posX");
                  Integer posY = (Integer) provider.getValue("posY");
                  return evaluateExpression_1_1(boundryPosX, boundryPosY, posX, posY);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer boundryPosX, final Integer boundryPosY, final Integer posX, final Integer posY) {
    return ((posX.compareTo(boundryPosX) <= 0) && (posY.compareTo(boundryPosY) <= 0));
  }
}
