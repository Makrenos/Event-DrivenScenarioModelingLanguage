/**
 */
package scenedl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenedl.DynamicEntity#getOn <em>On</em>}</li>
 *   <li>{@link scenedl.DynamicEntity#getPosition <em>Position</em>}</li>
 *   <li>{@link scenedl.DynamicEntity#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see scenedl.ScenedlPackage#getDynamicEntity()
 * @model
 * @generated
 */
public interface DynamicEntity extends Element {

	/**
	 * Returns the value of the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' reference.
	 * @see #setOn(StaticEntity)
	 * @see scenedl.ScenedlPackage#getDynamicEntity_On()
	 * @model required="true"
	 * @generated
	 */
	StaticEntity getOn();

	/**
	 * Sets the value of the '{@link scenedl.DynamicEntity#getOn <em>On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(StaticEntity value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(PositionAttribute)
	 * @see scenedl.ScenedlPackage#getDynamicEntity_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositionAttribute getPosition();

	/**
	 * Sets the value of the '{@link scenedl.DynamicEntity#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionAttribute value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' containment reference.
	 * @see #setSpeed(PositionAttribute)
	 * @see scenedl.ScenedlPackage#getDynamicEntity_Speed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositionAttribute getSpeed();

	/**
	 * Sets the value of the '{@link scenedl.DynamicEntity#getSpeed <em>Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' containment reference.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(PositionAttribute value);
} // DynamicEntity
