/**
 */
package edsdl;

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
 *   <li>{@link edsdl.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link edsdl.StateMachine#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link edsdl.StateMachine#getRuntimestate <em>Runtimestate</em>}</li>
 * </ul>
 *
 * @see edsdl.EdsdlPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link edsdl.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see edsdl.EdsdlPackage#getStateMachine_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary</em>' containment reference.
	 * @see #setDictionary(Dictionary)
	 * @see edsdl.EdsdlPackage#getStateMachine_Dictionary()
	 * @model containment="true"
	 * @generated
	 */
	Dictionary getDictionary();

	/**
	 * Sets the value of the '{@link edsdl.StateMachine#getDictionary <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary</em>' containment reference.
	 * @see #getDictionary()
	 * @generated
	 */
	void setDictionary(Dictionary value);

	/**
	 * Returns the value of the '<em><b>Runtimestate</b></em>' containment reference list.
	 * The list contents are of type {@link edsdl.RuntimeState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtimestate</em>' containment reference list.
	 * @see edsdl.EdsdlPackage#getStateMachine_Runtimestate()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeState> getRuntimestate();

} // StateMachine
