/**
 */
package edsdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edsdl.RuntimeState#getActualState <em>Actual State</em>}</li>
 *   <li>{@link edsdl.RuntimeState#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see edsdl.EdsdlPackage#getRuntimeState()
 * @model
 * @generated
 */
public interface RuntimeState extends EObject {
	/**
	 * Returns the value of the '<em><b>Actual State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual State</em>' reference.
	 * @see #setActualState(State)
	 * @see edsdl.EdsdlPackage#getRuntimeState_ActualState()
	 * @model required="true"
	 * @generated
	 */
	State getActualState();

	/**
	 * Sets the value of the '{@link edsdl.RuntimeState#getActualState <em>Actual State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual State</em>' reference.
	 * @see #getActualState()
	 * @generated
	 */
	void setActualState(State value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' attribute.
	 * @see #setActor(String)
	 * @see edsdl.EdsdlPackage#getRuntimeState_Actor()
	 * @model required="true"
	 * @generated
	 */
	String getActor();

	/**
	 * Sets the value of the '{@link edsdl.RuntimeState#getActor <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' attribute.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(String value);

} // RuntimeState
