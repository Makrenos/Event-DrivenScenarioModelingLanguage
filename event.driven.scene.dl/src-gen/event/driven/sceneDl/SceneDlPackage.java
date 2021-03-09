/**
 * generated by Xtext 2.25.0
 */
package event.driven.sceneDl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see event.driven.sceneDl.SceneDlFactory
 * @model kind="package"
 * @generated
 */
public interface SceneDlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sceneDl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.driven.event/SceneDl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sceneDl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SceneDlPackage eINSTANCE = event.driven.sceneDl.impl.SceneDlPackageImpl.init();

  /**
   * The meta object id for the '{@link event.driven.sceneDl.impl.SceneImpl <em>Scene</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see event.driven.sceneDl.impl.SceneImpl
   * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getScene()
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
   * The number of structural features of the '<em>Scene</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link event.driven.sceneDl.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see event.driven.sceneDl.impl.ElementImpl
   * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getElement()
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
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__KEY = 2;

  /**
   * The feature id for the '<em><b>Is A</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__IS_A = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ATTRIBUTES = 4;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link event.driven.sceneDl.impl.StaticEntityImpl <em>Static Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see event.driven.sceneDl.impl.StaticEntityImpl
   * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getStaticEntity()
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
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ENTITY__KEY = ELEMENT__KEY;

  /**
   * The feature id for the '<em><b>Is A</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ENTITY__IS_A = ELEMENT__IS_A;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ENTITY__ATTRIBUTES = ELEMENT__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ENTITY__FEATURES = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Static Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link event.driven.sceneDl.impl.DynamicEntityImpl <em>Dynamic Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see event.driven.sceneDl.impl.DynamicEntityImpl
   * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getDynamicEntity()
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
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_ENTITY__KEY = ELEMENT__KEY;

  /**
   * The feature id for the '<em><b>Is A</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_ENTITY__IS_A = ELEMENT__IS_A;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_ENTITY__ATTRIBUTES = ELEMENT__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Contains</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_ENTITY__CONTAINS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dynamic Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link event.driven.sceneDl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see event.driven.sceneDl.impl.FeatureImpl
   * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 4;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link event.driven.sceneDl.impl.ContainImpl <em>Contain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see event.driven.sceneDl.impl.ContainImpl
   * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getContain()
   * @generated
   */
  int CONTAIN = 5;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAIN__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAIN__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAIN__TYPE = 2;

  /**
   * The number of structural features of the '<em>Contain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link event.driven.sceneDl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see event.driven.sceneDl.impl.AttributeImpl
   * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Is Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__IS_TRANSIENT = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link event.driven.sceneDl.impl.RegularAttributeImpl <em>Regular Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see event.driven.sceneDl.impl.RegularAttributeImpl
   * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getRegularAttribute()
   * @generated
   */
  int REGULAR_ATTRIBUTE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

  /**
   * The feature id for the '<em><b>Is Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_ATTRIBUTE__IS_TRANSIENT = ATTRIBUTE__IS_TRANSIENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Regular Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link event.driven.sceneDl.impl.PositionAttributeImpl <em>Position Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see event.driven.sceneDl.impl.PositionAttributeImpl
   * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getPositionAttribute()
   * @generated
   */
  int POSITION_ATTRIBUTE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

  /**
   * The feature id for the '<em><b>Is Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_ATTRIBUTE__IS_TRANSIENT = ATTRIBUTE__IS_TRANSIENT;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_ATTRIBUTE__X = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_ATTRIBUTE__Y = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Position Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link event.driven.sceneDl.AttributeType <em>Attribute Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see event.driven.sceneDl.AttributeType
   * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getAttributeType()
   * @generated
   */
  int ATTRIBUTE_TYPE = 9;


  /**
   * Returns the meta object for class '{@link event.driven.sceneDl.Scene <em>Scene</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scene</em>'.
   * @see event.driven.sceneDl.Scene
   * @generated
   */
  EClass getScene();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.Scene#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see event.driven.sceneDl.Scene#getName()
   * @see #getScene()
   * @generated
   */
  EAttribute getScene_Name();

  /**
   * Returns the meta object for the containment reference list '{@link event.driven.sceneDl.Scene#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see event.driven.sceneDl.Scene#getElements()
   * @see #getScene()
   * @generated
   */
  EReference getScene_Elements();

  /**
   * Returns the meta object for class '{@link event.driven.sceneDl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see event.driven.sceneDl.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.Element#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see event.driven.sceneDl.Element#getType()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Type();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see event.driven.sceneDl.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the reference '{@link event.driven.sceneDl.Element#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key</em>'.
   * @see event.driven.sceneDl.Element#getKey()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Key();

  /**
   * Returns the meta object for the reference list '{@link event.driven.sceneDl.Element#getIsA <em>Is A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Is A</em>'.
   * @see event.driven.sceneDl.Element#getIsA()
   * @see #getElement()
   * @generated
   */
  EReference getElement_IsA();

  /**
   * Returns the meta object for the containment reference list '{@link event.driven.sceneDl.Element#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see event.driven.sceneDl.Element#getAttributes()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Attributes();

  /**
   * Returns the meta object for class '{@link event.driven.sceneDl.StaticEntity <em>Static Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Entity</em>'.
   * @see event.driven.sceneDl.StaticEntity
   * @generated
   */
  EClass getStaticEntity();

  /**
   * Returns the meta object for the containment reference list '{@link event.driven.sceneDl.StaticEntity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see event.driven.sceneDl.StaticEntity#getFeatures()
   * @see #getStaticEntity()
   * @generated
   */
  EReference getStaticEntity_Features();

  /**
   * Returns the meta object for class '{@link event.driven.sceneDl.DynamicEntity <em>Dynamic Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Entity</em>'.
   * @see event.driven.sceneDl.DynamicEntity
   * @generated
   */
  EClass getDynamicEntity();

  /**
   * Returns the meta object for the containment reference list '{@link event.driven.sceneDl.DynamicEntity#getContains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contains</em>'.
   * @see event.driven.sceneDl.DynamicEntity#getContains()
   * @see #getDynamicEntity()
   * @generated
   */
  EReference getDynamicEntity_Contains();

  /**
   * Returns the meta object for class '{@link event.driven.sceneDl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see event.driven.sceneDl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.Feature#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see event.driven.sceneDl.Feature#isMany()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see event.driven.sceneDl.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the reference '{@link event.driven.sceneDl.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see event.driven.sceneDl.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();

  /**
   * Returns the meta object for class '{@link event.driven.sceneDl.Contain <em>Contain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contain</em>'.
   * @see event.driven.sceneDl.Contain
   * @generated
   */
  EClass getContain();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.Contain#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see event.driven.sceneDl.Contain#isMany()
   * @see #getContain()
   * @generated
   */
  EAttribute getContain_Many();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.Contain#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see event.driven.sceneDl.Contain#getName()
   * @see #getContain()
   * @generated
   */
  EAttribute getContain_Name();

  /**
   * Returns the meta object for the reference '{@link event.driven.sceneDl.Contain#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see event.driven.sceneDl.Contain#getType()
   * @see #getContain()
   * @generated
   */
  EReference getContain_Type();

  /**
   * Returns the meta object for class '{@link event.driven.sceneDl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see event.driven.sceneDl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see event.driven.sceneDl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see event.driven.sceneDl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.Attribute#isIsTransient <em>Is Transient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Transient</em>'.
   * @see event.driven.sceneDl.Attribute#isIsTransient()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_IsTransient();

  /**
   * Returns the meta object for class '{@link event.driven.sceneDl.RegularAttribute <em>Regular Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regular Attribute</em>'.
   * @see event.driven.sceneDl.RegularAttribute
   * @generated
   */
  EClass getRegularAttribute();

  /**
   * Returns the meta object for the attribute list '{@link event.driven.sceneDl.RegularAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value</em>'.
   * @see event.driven.sceneDl.RegularAttribute#getValue()
   * @see #getRegularAttribute()
   * @generated
   */
  EAttribute getRegularAttribute_Value();

  /**
   * Returns the meta object for class '{@link event.driven.sceneDl.PositionAttribute <em>Position Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Position Attribute</em>'.
   * @see event.driven.sceneDl.PositionAttribute
   * @generated
   */
  EClass getPositionAttribute();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.PositionAttribute#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see event.driven.sceneDl.PositionAttribute#getX()
   * @see #getPositionAttribute()
   * @generated
   */
  EAttribute getPositionAttribute_X();

  /**
   * Returns the meta object for the attribute '{@link event.driven.sceneDl.PositionAttribute#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see event.driven.sceneDl.PositionAttribute#getY()
   * @see #getPositionAttribute()
   * @generated
   */
  EAttribute getPositionAttribute_Y();

  /**
   * Returns the meta object for enum '{@link event.driven.sceneDl.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Type</em>'.
   * @see event.driven.sceneDl.AttributeType
   * @generated
   */
  EEnum getAttributeType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SceneDlFactory getSceneDlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link event.driven.sceneDl.impl.SceneImpl <em>Scene</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see event.driven.sceneDl.impl.SceneImpl
     * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getScene()
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
     * The meta object literal for the '{@link event.driven.sceneDl.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see event.driven.sceneDl.impl.ElementImpl
     * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getElement()
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
     * The meta object literal for the '<em><b>Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__KEY = eINSTANCE.getElement_Key();

    /**
     * The meta object literal for the '<em><b>Is A</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__IS_A = eINSTANCE.getElement_IsA();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

    /**
     * The meta object literal for the '{@link event.driven.sceneDl.impl.StaticEntityImpl <em>Static Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see event.driven.sceneDl.impl.StaticEntityImpl
     * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getStaticEntity()
     * @generated
     */
    EClass STATIC_ENTITY = eINSTANCE.getStaticEntity();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_ENTITY__FEATURES = eINSTANCE.getStaticEntity_Features();

    /**
     * The meta object literal for the '{@link event.driven.sceneDl.impl.DynamicEntityImpl <em>Dynamic Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see event.driven.sceneDl.impl.DynamicEntityImpl
     * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getDynamicEntity()
     * @generated
     */
    EClass DYNAMIC_ENTITY = eINSTANCE.getDynamicEntity();

    /**
     * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_ENTITY__CONTAINS = eINSTANCE.getDynamicEntity_Contains();

    /**
     * The meta object literal for the '{@link event.driven.sceneDl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see event.driven.sceneDl.impl.FeatureImpl
     * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__MANY = eINSTANCE.getFeature_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '{@link event.driven.sceneDl.impl.ContainImpl <em>Contain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see event.driven.sceneDl.impl.ContainImpl
     * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getContain()
     * @generated
     */
    EClass CONTAIN = eINSTANCE.getContain();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAIN__MANY = eINSTANCE.getContain_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAIN__NAME = eINSTANCE.getContain_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAIN__TYPE = eINSTANCE.getContain_Type();

    /**
     * The meta object literal for the '{@link event.driven.sceneDl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see event.driven.sceneDl.impl.AttributeImpl
     * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Is Transient</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__IS_TRANSIENT = eINSTANCE.getAttribute_IsTransient();

    /**
     * The meta object literal for the '{@link event.driven.sceneDl.impl.RegularAttributeImpl <em>Regular Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see event.driven.sceneDl.impl.RegularAttributeImpl
     * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getRegularAttribute()
     * @generated
     */
    EClass REGULAR_ATTRIBUTE = eINSTANCE.getRegularAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_ATTRIBUTE__VALUE = eINSTANCE.getRegularAttribute_Value();

    /**
     * The meta object literal for the '{@link event.driven.sceneDl.impl.PositionAttributeImpl <em>Position Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see event.driven.sceneDl.impl.PositionAttributeImpl
     * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getPositionAttribute()
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
     * The meta object literal for the '{@link event.driven.sceneDl.AttributeType <em>Attribute Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see event.driven.sceneDl.AttributeType
     * @see event.driven.sceneDl.impl.SceneDlPackageImpl#getAttributeType()
     * @generated
     */
    EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

  }

} //SceneDlPackage
