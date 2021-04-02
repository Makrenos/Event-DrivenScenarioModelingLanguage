/**
 */
package scenedl;

import edsdl.StateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenedl.Scene#getName <em>Name</em>}</li>
 *   <li>{@link scenedl.Scene#getElements <em>Elements</em>}</li>
 *   <li>{@link scenedl.Scene#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link scenedl.Scene#getBoundry <em>Boundry</em>}</li>
 * </ul>
 *
 * @see scenedl.ScenedlPackage#getScene()
 * @model
 * @generated
 */
public interface Scene extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see scenedl.ScenedlPackage#getScene_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link scenedl.Scene#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link scenedl.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see scenedl.ScenedlPackage#getScene_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' containment reference.
	 * @see #setStateMachine(StateMachine)
	 * @see scenedl.ScenedlPackage#getScene_StateMachine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link scenedl.Scene#getStateMachine <em>State Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' containment reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Boundry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundry</em>' containment reference.
	 * @see #setBoundry(PositionAttribute)
	 * @see scenedl.ScenedlPackage#getScene_Boundry()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositionAttribute getBoundry();

	/**
	 * Sets the value of the '{@link scenedl.Scene#getBoundry <em>Boundry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundry</em>' containment reference.
	 * @see #getBoundry()
	 * @generated
	 */
	void setBoundry(PositionAttribute value);

} // Scene
