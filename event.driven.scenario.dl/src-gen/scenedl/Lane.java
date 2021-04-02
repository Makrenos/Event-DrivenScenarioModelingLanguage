/**
 */
package scenedl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenedl.Lane#getStartingPosition <em>Starting Position</em>}</li>
 *   <li>{@link scenedl.Lane#getId <em>Id</em>}</li>
 *   <li>{@link scenedl.Lane#getEndingPosition <em>Ending Position</em>}</li>
 * </ul>
 *
 * @see scenedl.ScenedlPackage#getLane()
 * @model
 * @generated
 */
public interface Lane extends EObject {
	/**
	 * Returns the value of the '<em><b>Starting Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Position</em>' containment reference.
	 * @see #setStartingPosition(PositionAttribute)
	 * @see scenedl.ScenedlPackage#getLane_StartingPosition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositionAttribute getStartingPosition();

	/**
	 * Sets the value of the '{@link scenedl.Lane#getStartingPosition <em>Starting Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Position</em>' containment reference.
	 * @see #getStartingPosition()
	 * @generated
	 */
	void setStartingPosition(PositionAttribute value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see scenedl.ScenedlPackage#getLane_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link scenedl.Lane#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Ending Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending Position</em>' containment reference.
	 * @see #setEndingPosition(PositionAttribute)
	 * @see scenedl.ScenedlPackage#getLane_EndingPosition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositionAttribute getEndingPosition();

	/**
	 * Sets the value of the '{@link scenedl.Lane#getEndingPosition <em>Ending Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Position</em>' containment reference.
	 * @see #getEndingPosition()
	 * @generated
	 */
	void setEndingPosition(PositionAttribute value);

} // Lane
