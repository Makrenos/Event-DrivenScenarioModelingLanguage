/**
 */
package scenedl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import scenedl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenedlFactoryImpl extends EFactoryImpl implements ScenedlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScenedlFactory init() {
		try {
			ScenedlFactory theScenedlFactory = (ScenedlFactory) EPackage.Registry.INSTANCE
					.getEFactory(ScenedlPackage.eNS_URI);
			if (theScenedlFactory != null) {
				return theScenedlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScenedlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenedlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ScenedlPackage.SCENE:
			return createScene();
		case ScenedlPackage.ELEMENT:
			return createElement();
		case ScenedlPackage.STATIC_ENTITY:
			return createStaticEntity();
		case ScenedlPackage.DYNAMIC_ENTITY:
			return createDynamicEntity();
		case ScenedlPackage.REGULAR_ATTRIBUTE:
			return createRegularAttribute();
		case ScenedlPackage.POSITION_ATTRIBUTE:
			return createPositionAttribute();
		case ScenedlPackage.LANE:
			return createLane();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene createScene() {
		SceneImpl scene = new SceneImpl();
		return scene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticEntity createStaticEntity() {
		StaticEntityImpl staticEntity = new StaticEntityImpl();
		return staticEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicEntity createDynamicEntity() {
		DynamicEntityImpl dynamicEntity = new DynamicEntityImpl();
		return dynamicEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularAttribute createRegularAttribute() {
		RegularAttributeImpl regularAttribute = new RegularAttributeImpl();
		return regularAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionAttribute createPositionAttribute() {
		PositionAttributeImpl positionAttribute = new PositionAttributeImpl();
		return positionAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenedlPackage getScenedlPackage() {
		return (ScenedlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScenedlPackage getPackage() {
		return ScenedlPackage.eINSTANCE;
	}

} //ScenedlFactoryImpl
