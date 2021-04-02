/**
 */
package event.driven.scenario.dl.edsdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link event.driven.scenario.dl.edsdl.Dictionary#getFeatureBasedActions <em>Feature Based Actions</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.Dictionary#getConditions <em>Conditions</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.Dictionary#getRuleBasedActions <em>Rule Based Actions</em>}</li>
 * </ul>
 *
 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Based Actions</b></em>' containment reference list.
	 * The list contents are of type {@link event.driven.scenario.dl.edsdl.EFeatureBasedAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Based Actions</em>' containment reference list.
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getDictionary_FeatureBasedActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EFeatureBasedAction> getFeatureBasedActions();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link event.driven.scenario.dl.edsdl.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getDictionary_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Rule Based Actions</b></em>' containment reference list.
	 * The list contents are of type {@link event.driven.scenario.dl.edsdl.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Based Actions</em>' containment reference list.
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getDictionary_RuleBasedActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getRuleBasedActions();

} // Dictionary
