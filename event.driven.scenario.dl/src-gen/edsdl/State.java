/**
 */
package edsdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edsdl.State#isAccepting <em>Accepting</em>}</li>
 *   <li>{@link edsdl.State#getName <em>Name</em>}</li>
 *   <li>{@link edsdl.State#getOutTransitions <em>Out Transitions</em>}</li>
 * </ul>
 *
 * @see edsdl.EdsdlPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Accepting</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepting</em>' attribute.
	 * @see #setAccepting(boolean)
	 * @see edsdl.EdsdlPackage#getState_Accepting()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isAccepting();

	/**
	 * Sets the value of the '{@link edsdl.State#isAccepting <em>Accepting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepting</em>' attribute.
	 * @see #isAccepting()
	 * @generated
	 */
	void setAccepting(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edsdl.EdsdlPackage#getState_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edsdl.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Out Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link edsdl.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Transitions</em>' containment reference list.
	 * @see edsdl.EdsdlPackage#getState_OutTransitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getOutTransitions();

} // State
