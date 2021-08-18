/**
 */
package behavior;

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
 * @see behavior.BehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eventDrivenScenario.org/behavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorPackage eINSTANCE = behavior.impl.BehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link behavior.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behavior.impl.BehaviorImpl
	 * @see behavior.impl.BehaviorPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behavior.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behavior.impl.ParameterImpl
	 * @see behavior.impl.BehaviorPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behavior.impl.BehaviorListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behavior.impl.BehaviorListImpl
	 * @see behavior.impl.BehaviorPackageImpl#getBehaviorList()
	 * @generated
	 */
	int BEHAVIOR_LIST = 2;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_LIST__BEHAVIORS = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_LIST__ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Number Of Behaviors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_LIST__NUMBER_OF_BEHAVIORS = 2;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_LIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behavior.impl.ListsOfBehaviorsImpl <em>Lists Of Behaviors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behavior.impl.ListsOfBehaviorsImpl
	 * @see behavior.impl.BehaviorPackageImpl#getListsOfBehaviors()
	 * @generated
	 */
	int LISTS_OF_BEHAVIORS = 3;

	/**
	 * The feature id for the '<em><b>Lists Of Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS_OF_BEHAVIORS__LISTS_OF_BEHAVIORS = 0;

	/**
	 * The number of structural features of the '<em>Lists Of Behaviors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS_OF_BEHAVIORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lists Of Behaviors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTS_OF_BEHAVIORS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link behavior.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see behavior.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link behavior.Behavior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behavior.Behavior#getName()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link behavior.Behavior#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see behavior.Behavior#getParameters()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Parameters();

	/**
	 * Returns the meta object for class '{@link behavior.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see behavior.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link behavior.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see behavior.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link behavior.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see behavior.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link behavior.BehaviorList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see behavior.BehaviorList
	 * @generated
	 */
	EClass getBehaviorList();

	/**
	 * Returns the meta object for the containment reference list '{@link behavior.BehaviorList#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see behavior.BehaviorList#getBehaviors()
	 * @see #getBehaviorList()
	 * @generated
	 */
	EReference getBehaviorList_Behaviors();

	/**
	 * Returns the meta object for the reference '{@link behavior.BehaviorList#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see behavior.BehaviorList#getActor()
	 * @see #getBehaviorList()
	 * @generated
	 */
	EReference getBehaviorList_Actor();

	/**
	 * Returns the meta object for the attribute '{@link behavior.BehaviorList#getNumberOfBehaviors <em>Number Of Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Behaviors</em>'.
	 * @see behavior.BehaviorList#getNumberOfBehaviors()
	 * @see #getBehaviorList()
	 * @generated
	 */
	EAttribute getBehaviorList_NumberOfBehaviors();

	/**
	 * Returns the meta object for class '{@link behavior.ListsOfBehaviors <em>Lists Of Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lists Of Behaviors</em>'.
	 * @see behavior.ListsOfBehaviors
	 * @generated
	 */
	EClass getListsOfBehaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link behavior.ListsOfBehaviors#getListsOfBehaviors <em>Lists Of Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lists Of Behaviors</em>'.
	 * @see behavior.ListsOfBehaviors#getListsOfBehaviors()
	 * @see #getListsOfBehaviors()
	 * @generated
	 */
	EReference getListsOfBehaviors_ListsOfBehaviors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorFactory getBehaviorFactory();

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
		 * The meta object literal for the '{@link behavior.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behavior.impl.BehaviorImpl
		 * @see behavior.impl.BehaviorPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__NAME = eINSTANCE.getBehavior_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__PARAMETERS = eINSTANCE.getBehavior_Parameters();

		/**
		 * The meta object literal for the '{@link behavior.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behavior.impl.ParameterImpl
		 * @see behavior.impl.BehaviorPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link behavior.impl.BehaviorListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behavior.impl.BehaviorListImpl
		 * @see behavior.impl.BehaviorPackageImpl#getBehaviorList()
		 * @generated
		 */
		EClass BEHAVIOR_LIST = eINSTANCE.getBehaviorList();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_LIST__BEHAVIORS = eINSTANCE.getBehaviorList_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_LIST__ACTOR = eINSTANCE.getBehaviorList_Actor();

		/**
		 * The meta object literal for the '<em><b>Number Of Behaviors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_LIST__NUMBER_OF_BEHAVIORS = eINSTANCE.getBehaviorList_NumberOfBehaviors();

		/**
		 * The meta object literal for the '{@link behavior.impl.ListsOfBehaviorsImpl <em>Lists Of Behaviors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behavior.impl.ListsOfBehaviorsImpl
		 * @see behavior.impl.BehaviorPackageImpl#getListsOfBehaviors()
		 * @generated
		 */
		EClass LISTS_OF_BEHAVIORS = eINSTANCE.getListsOfBehaviors();

		/**
		 * The meta object literal for the '<em><b>Lists Of Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTS_OF_BEHAVIORS__LISTS_OF_BEHAVIORS = eINSTANCE.getListsOfBehaviors_ListsOfBehaviors();

	}

} //BehaviorPackage
