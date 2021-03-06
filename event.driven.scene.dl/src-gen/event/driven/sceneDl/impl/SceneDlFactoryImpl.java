/**
 * generated by Xtext 2.25.0
 */
package event.driven.sceneDl.impl;

import event.driven.sceneDl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SceneDlFactoryImpl extends EFactoryImpl implements SceneDlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SceneDlFactory init()
  {
    try
    {
      SceneDlFactory theSceneDlFactory = (SceneDlFactory)EPackage.Registry.INSTANCE.getEFactory(SceneDlPackage.eNS_URI);
      if (theSceneDlFactory != null)
      {
        return theSceneDlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SceneDlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SceneDlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SceneDlPackage.SCENE: return createScene();
      case SceneDlPackage.ELEMENT: return createElement();
      case SceneDlPackage.STATIC_ENTITY: return createStaticEntity();
      case SceneDlPackage.DYNAMIC_ENTITY: return createDynamicEntity();
      case SceneDlPackage.ATTRIBUTE: return createAttribute();
      case SceneDlPackage.REGULAR_ATTRIBUTE: return createRegularAttribute();
      case SceneDlPackage.POSITION_ATTRIBUTE: return createPositionAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SceneDlPackage.ATTRIBUTE_TYPE:
        return createAttributeTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SceneDlPackage.ATTRIBUTE_TYPE:
        return convertAttributeTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Scene createScene()
  {
    SceneImpl scene = new SceneImpl();
    return scene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StaticEntity createStaticEntity()
  {
    StaticEntityImpl staticEntity = new StaticEntityImpl();
    return staticEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DynamicEntity createDynamicEntity()
  {
    DynamicEntityImpl dynamicEntity = new DynamicEntityImpl();
    return dynamicEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RegularAttribute createRegularAttribute()
  {
    RegularAttributeImpl regularAttribute = new RegularAttributeImpl();
    return regularAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PositionAttribute createPositionAttribute()
  {
    PositionAttributeImpl positionAttribute = new PositionAttributeImpl();
    return positionAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue)
  {
    AttributeType result = AttributeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SceneDlPackage getSceneDlPackage()
  {
    return (SceneDlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SceneDlPackage getPackage()
  {
    return SceneDlPackage.eINSTANCE;
  }

} //SceneDlFactoryImpl
