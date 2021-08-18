/**
 */
package behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lists Of Behaviors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behavior.ListsOfBehaviors#getListsOfBehaviors <em>Lists Of Behaviors</em>}</li>
 * </ul>
 *
 * @see behavior.BehaviorPackage#getListsOfBehaviors()
 * @model
 * @generated
 */
public interface ListsOfBehaviors extends EObject {
	/**
	 * Returns the value of the '<em><b>Lists Of Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link behavior.BehaviorList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lists Of Behaviors</em>' containment reference list.
	 * @see behavior.BehaviorPackage#getListsOfBehaviors_ListsOfBehaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviorList> getListsOfBehaviors();

} // ListsOfBehaviors
