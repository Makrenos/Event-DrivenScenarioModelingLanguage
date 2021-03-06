/**
 */
package event.driven.scenario.dl.edsdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link event.driven.scenario.dl.edsdl.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.StateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.StateMachine#getActions <em>Actions</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.StateMachine#getActualState <em>Actual State</em>}</li>
 * </ul>
 *
 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link event.driven.scenario.dl.edsdl.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getStateMachine_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link event.driven.scenario.dl.edsdl.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getStateMachine_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link event.driven.scenario.dl.edsdl.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getStateMachine_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Actual State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual State</em>' reference.
	 * @see #setActualState(State)
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getStateMachine_ActualState()
	 * @model required="true"
	 * @generated
	 */
	State getActualState();

	/**
	 * Sets the value of the '{@link event.driven.scenario.dl.edsdl.StateMachine#getActualState <em>Actual State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual State</em>' reference.
	 * @see #getActualState()
	 * @generated
	 */
	void setActualState(State value);

} // StateMachine
