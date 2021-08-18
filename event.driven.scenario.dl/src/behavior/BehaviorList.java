/**
 */
package behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import trafficSituation.AbstractDynamicInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behavior.BehaviorList#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link behavior.BehaviorList#getActor <em>Actor</em>}</li>
 *   <li>{@link behavior.BehaviorList#getNumberOfBehaviors <em>Number Of Behaviors</em>}</li>
 * </ul>
 *
 * @see behavior.BehaviorPackage#getBehaviorList()
 * @model
 * @generated
 */
public interface BehaviorList extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link behavior.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see behavior.BehaviorPackage#getBehaviorList_Behaviors()
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
	 * @see behavior.BehaviorPackage#getBehaviorList_Actor()
	 * @model required="true"
	 * @generated
	 */
	AbstractDynamicInstance getActor();

	/**
	 * Sets the value of the '{@link behavior.BehaviorList#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(AbstractDynamicInstance value);

	/**
	 * Returns the value of the '<em><b>Number Of Behaviors</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Behaviors</em>' attribute.
	 * @see #setNumberOfBehaviors(int)
	 * @see behavior.BehaviorPackage#getBehaviorList_NumberOfBehaviors()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getNumberOfBehaviors();

	/**
	 * Sets the value of the '{@link behavior.BehaviorList#getNumberOfBehaviors <em>Number Of Behaviors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Behaviors</em>' attribute.
	 * @see #getNumberOfBehaviors()
	 * @generated
	 */
	void setNumberOfBehaviors(int value);

} // BehaviorList
