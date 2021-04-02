/**
 */
package event.driven.scenario.dl.edsdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link event.driven.scenario.dl.edsdl.Transition#getTargetState <em>Target State</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.Transition#getFeatureBasedActions <em>Feature Based Actions</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.Transition#getCondition <em>Condition</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.Transition#getName <em>Name</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.Transition#getRuleBasedActions <em>Rule Based Actions</em>}</li>
 * </ul>
 *
 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(State)
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getTransition_TargetState()
	 * @model required="true"
	 * @generated
	 */
	State getTargetState();

	/**
	 * Sets the value of the '{@link event.driven.scenario.dl.edsdl.Transition#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(State value);

	/**
	 * Returns the value of the '<em><b>Feature Based Actions</b></em>' reference list.
	 * The list contents are of type {@link event.driven.scenario.dl.edsdl.EFeatureBasedAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Based Actions</em>' reference list.
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getTransition_FeatureBasedActions()
	 * @model
	 * @generated
	 */
	EList<EFeatureBasedAction> getFeatureBasedActions();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getTransition_Condition()
	 * @model
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link event.driven.scenario.dl.edsdl.Transition#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link event.driven.scenario.dl.edsdl.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rule Based Actions</b></em>' reference list.
	 * The list contents are of type {@link event.driven.scenario.dl.edsdl.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Based Actions</em>' reference list.
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getTransition_RuleBasedActions()
	 * @model
	 * @generated
	 */
	EList<Action> getRuleBasedActions();

} // Transition
