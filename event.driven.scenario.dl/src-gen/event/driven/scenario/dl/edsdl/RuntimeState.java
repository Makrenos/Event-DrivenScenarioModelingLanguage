/**
 */
package event.driven.scenario.dl.edsdl;

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
 *   <li>{@link event.driven.scenario.dl.edsdl.RuntimeState#getActualState <em>Actual State</em>}</li>
 * </ul>
 *
 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getRuntimeState()
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
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getRuntimeState_ActualState()
	 * @model required="true"
	 * @generated
	 */
	State getActualState();

	/**
	 * Sets the value of the '{@link event.driven.scenario.dl.edsdl.RuntimeState#getActualState <em>Actual State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual State</em>' reference.
	 * @see #getActualState()
	 * @generated
	 */
	void setActualState(State value);

} // RuntimeState
