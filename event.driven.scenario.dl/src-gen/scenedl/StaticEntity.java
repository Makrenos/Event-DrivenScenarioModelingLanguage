/**
 */
package scenedl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenedl.StaticEntity#getUses <em>Uses</em>}</li>
 *   <li>{@link scenedl.StaticEntity#getLanes <em>Lanes</em>}</li>
 * </ul>
 *
 * @see scenedl.ScenedlPackage#getStaticEntity()
 * @model
 * @generated
 */
public interface StaticEntity extends Element {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link scenedl.DynamicEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see scenedl.ScenedlPackage#getStaticEntity_Uses()
	 * @model
	 * @generated
	 */
	EList<DynamicEntity> getUses();

	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' containment reference list.
	 * The list contents are of type {@link scenedl.Lane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes</em>' containment reference list.
	 * @see scenedl.ScenedlPackage#getStaticEntity_Lanes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lane> getLanes();

} // StaticEntity
