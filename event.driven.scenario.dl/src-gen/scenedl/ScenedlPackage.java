/**
 */
package scenedl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see scenedl.ScenedlFactory
 * @model kind="package"
 * @generated
 */
public interface ScenedlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scenedl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eventDrivenScenario.org/scenedl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scenedl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenedlPackage eINSTANCE = scenedl.impl.ScenedlPackageImpl.init();

	/**
	 * The meta object id for the '{@link scenedl.impl.SceneImpl <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenedl.impl.SceneImpl
	 * @see scenedl.impl.ScenedlPackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__STATE_MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Boundry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__BOUNDRY = 3;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenedl.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenedl.impl.ElementImpl
	 * @see scenedl.impl.ScenedlPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONTAINED_IN = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenedl.impl.StaticEntityImpl <em>Static Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenedl.impl.StaticEntityImpl
	 * @see scenedl.impl.ScenedlPackageImpl#getStaticEntity()
	 * @generated
	 */
	int STATIC_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENTITY__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENTITY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENTITY__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENTITY__CONTAINED_IN = ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENTITY__USES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENTITY__LANES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Static Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENTITY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenedl.impl.DynamicEntityImpl <em>Dynamic Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenedl.impl.DynamicEntityImpl
	 * @see scenedl.impl.ScenedlPackageImpl#getDynamicEntity()
	 * @generated
	 */
	int DYNAMIC_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ENTITY__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ENTITY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ENTITY__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ENTITY__CONTAINED_IN = ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ENTITY__ON = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ENTITY__POSITION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ENTITY__SPEED = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dynamic Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dynamic Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ENTITY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenedl.impl.RegularAttributeImpl <em>Regular Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenedl.impl.RegularAttributeImpl
	 * @see scenedl.impl.ScenedlPackageImpl#getRegularAttribute()
	 * @generated
	 */
	int REGULAR_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ATTRIBUTE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ATTRIBUTE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Regular Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Regular Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenedl.impl.PositionAttributeImpl <em>Position Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenedl.impl.PositionAttributeImpl
	 * @see scenedl.impl.ScenedlPackageImpl#getPositionAttribute()
	 * @generated
	 */
	int POSITION_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ATTRIBUTE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ATTRIBUTE__Y = 1;

	/**
	 * The number of structural features of the '<em>Position Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Position Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenedl.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenedl.impl.LaneImpl
	 * @see scenedl.impl.ScenedlPackageImpl#getLane()
	 * @generated
	 */
	int LANE = 6;

	/**
	 * The feature id for the '<em><b>Starting Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__STARTING_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ID = 1;

	/**
	 * The feature id for the '<em><b>Ending Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ENDING_POSITION = 2;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link scenedl.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see scenedl.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the attribute '{@link scenedl.Scene#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenedl.Scene#getName()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link scenedl.Scene#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see scenedl.Scene#getElements()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link scenedl.Scene#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Machine</em>'.
	 * @see scenedl.Scene#getStateMachine()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_StateMachine();

	/**
	 * Returns the meta object for the containment reference '{@link scenedl.Scene#getBoundry <em>Boundry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundry</em>'.
	 * @see scenedl.Scene#getBoundry()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Boundry();

	/**
	 * Returns the meta object for class '{@link scenedl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see scenedl.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link scenedl.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see scenedl.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link scenedl.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenedl.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link scenedl.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see scenedl.Element#getAttributes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attributes();

	/**
	 * Returns the meta object for the reference '{@link scenedl.Element#getContainedIn <em>Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contained In</em>'.
	 * @see scenedl.Element#getContainedIn()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ContainedIn();

	/**
	 * Returns the meta object for class '{@link scenedl.StaticEntity <em>Static Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Entity</em>'.
	 * @see scenedl.StaticEntity
	 * @generated
	 */
	EClass getStaticEntity();

	/**
	 * Returns the meta object for the reference list '{@link scenedl.StaticEntity#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see scenedl.StaticEntity#getUses()
	 * @see #getStaticEntity()
	 * @generated
	 */
	EReference getStaticEntity_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link scenedl.StaticEntity#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lanes</em>'.
	 * @see scenedl.StaticEntity#getLanes()
	 * @see #getStaticEntity()
	 * @generated
	 */
	EReference getStaticEntity_Lanes();

	/**
	 * Returns the meta object for class '{@link scenedl.DynamicEntity <em>Dynamic Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Entity</em>'.
	 * @see scenedl.DynamicEntity
	 * @generated
	 */
	EClass getDynamicEntity();

	/**
	 * Returns the meta object for the reference '{@link scenedl.DynamicEntity#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On</em>'.
	 * @see scenedl.DynamicEntity#getOn()
	 * @see #getDynamicEntity()
	 * @generated
	 */
	EReference getDynamicEntity_On();

	/**
	 * Returns the meta object for the containment reference '{@link scenedl.DynamicEntity#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see scenedl.DynamicEntity#getPosition()
	 * @see #getDynamicEntity()
	 * @generated
	 */
	EReference getDynamicEntity_Position();

	/**
	 * Returns the meta object for the containment reference '{@link scenedl.DynamicEntity#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speed</em>'.
	 * @see scenedl.DynamicEntity#getSpeed()
	 * @see #getDynamicEntity()
	 * @generated
	 */
	EReference getDynamicEntity_Speed();

	/**
	 * Returns the meta object for class '{@link scenedl.RegularAttribute <em>Regular Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Attribute</em>'.
	 * @see scenedl.RegularAttribute
	 * @generated
	 */
	EClass getRegularAttribute();

	/**
	 * Returns the meta object for the attribute '{@link scenedl.RegularAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scenedl.RegularAttribute#getValue()
	 * @see #getRegularAttribute()
	 * @generated
	 */
	EAttribute getRegularAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link scenedl.RegularAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenedl.RegularAttribute#getName()
	 * @see #getRegularAttribute()
	 * @generated
	 */
	EAttribute getRegularAttribute_Name();

	/**
	 * Returns the meta object for class '{@link scenedl.PositionAttribute <em>Position Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Attribute</em>'.
	 * @see scenedl.PositionAttribute
	 * @generated
	 */
	EClass getPositionAttribute();

	/**
	 * Returns the meta object for the attribute '{@link scenedl.PositionAttribute#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see scenedl.PositionAttribute#getX()
	 * @see #getPositionAttribute()
	 * @generated
	 */
	EAttribute getPositionAttribute_X();

	/**
	 * Returns the meta object for the attribute '{@link scenedl.PositionAttribute#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see scenedl.PositionAttribute#getY()
	 * @see #getPositionAttribute()
	 * @generated
	 */
	EAttribute getPositionAttribute_Y();

	/**
	 * Returns the meta object for class '{@link scenedl.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see scenedl.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the containment reference '{@link scenedl.Lane#getStartingPosition <em>Starting Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starting Position</em>'.
	 * @see scenedl.Lane#getStartingPosition()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_StartingPosition();

	/**
	 * Returns the meta object for the attribute '{@link scenedl.Lane#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see scenedl.Lane#getId()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Id();

	/**
	 * Returns the meta object for the containment reference '{@link scenedl.Lane#getEndingPosition <em>Ending Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ending Position</em>'.
	 * @see scenedl.Lane#getEndingPosition()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_EndingPosition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScenedlFactory getScenedlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link scenedl.impl.SceneImpl <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenedl.impl.SceneImpl
		 * @see scenedl.impl.ScenedlPackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__NAME = eINSTANCE.getScene_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__ELEMENTS = eINSTANCE.getScene_Elements();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__STATE_MACHINE = eINSTANCE.getScene_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Boundry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__BOUNDRY = eINSTANCE.getScene_Boundry();

		/**
		 * The meta object literal for the '{@link scenedl.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenedl.impl.ElementImpl
		 * @see scenedl.impl.ScenedlPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Contained In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONTAINED_IN = eINSTANCE.getElement_ContainedIn();

		/**
		 * The meta object literal for the '{@link scenedl.impl.StaticEntityImpl <em>Static Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenedl.impl.StaticEntityImpl
		 * @see scenedl.impl.ScenedlPackageImpl#getStaticEntity()
		 * @generated
		 */
		EClass STATIC_ENTITY = eINSTANCE.getStaticEntity();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_ENTITY__USES = eINSTANCE.getStaticEntity_Uses();

		/**
		 * The meta object literal for the '<em><b>Lanes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_ENTITY__LANES = eINSTANCE.getStaticEntity_Lanes();

		/**
		 * The meta object literal for the '{@link scenedl.impl.DynamicEntityImpl <em>Dynamic Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenedl.impl.DynamicEntityImpl
		 * @see scenedl.impl.ScenedlPackageImpl#getDynamicEntity()
		 * @generated
		 */
		EClass DYNAMIC_ENTITY = eINSTANCE.getDynamicEntity();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_ENTITY__ON = eINSTANCE.getDynamicEntity_On();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_ENTITY__POSITION = eINSTANCE.getDynamicEntity_Position();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_ENTITY__SPEED = eINSTANCE.getDynamicEntity_Speed();

		/**
		 * The meta object literal for the '{@link scenedl.impl.RegularAttributeImpl <em>Regular Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenedl.impl.RegularAttributeImpl
		 * @see scenedl.impl.ScenedlPackageImpl#getRegularAttribute()
		 * @generated
		 */
		EClass REGULAR_ATTRIBUTE = eINSTANCE.getRegularAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_ATTRIBUTE__VALUE = eINSTANCE.getRegularAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_ATTRIBUTE__NAME = eINSTANCE.getRegularAttribute_Name();

		/**
		 * The meta object literal for the '{@link scenedl.impl.PositionAttributeImpl <em>Position Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenedl.impl.PositionAttributeImpl
		 * @see scenedl.impl.ScenedlPackageImpl#getPositionAttribute()
		 * @generated
		 */
		EClass POSITION_ATTRIBUTE = eINSTANCE.getPositionAttribute();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_ATTRIBUTE__X = eINSTANCE.getPositionAttribute_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_ATTRIBUTE__Y = eINSTANCE.getPositionAttribute_Y();

		/**
		 * The meta object literal for the '{@link scenedl.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenedl.impl.LaneImpl
		 * @see scenedl.impl.ScenedlPackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '<em><b>Starting Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__STARTING_POSITION = eINSTANCE.getLane_StartingPosition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__ID = eINSTANCE.getLane_Id();

		/**
		 * The meta object literal for the '<em><b>Ending Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__ENDING_POSITION = eINSTANCE.getLane_EndingPosition();

	}

} //ScenedlPackage
