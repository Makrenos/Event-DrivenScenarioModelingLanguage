/**
 */
package behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import trafficSituation.AbstractDynamicInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Behaviors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behavior.ListOfBehaviors#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link behavior.ListOfBehaviors#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see behavior.BehaviorPackage#getListOfBehaviors()
 * @model
 * @generated
 */
public interface ListOfBehaviors extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link behavior.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see behavior.BehaviorPackage#getListOfBehaviors_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviors();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(AbstractDynamicInstance)
	 * @see behavior.BehaviorPackage#getListOfBehaviors_Actor()
	 * @model required="true"
	 * @generated
	 */
	AbstractDynamicInstance getActor();

	/**
	 * Sets the value of the '{@link behavior.ListOfBehaviors#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(AbstractDynamicInstance value);

} // ListOfBehaviors
