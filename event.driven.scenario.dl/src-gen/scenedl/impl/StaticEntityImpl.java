/**
 */
package scenedl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scenedl.DynamicEntity;
import scenedl.Lane;
import scenedl.ScenedlPackage;
import scenedl.StaticEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenedl.impl.StaticEntityImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link scenedl.impl.StaticEntityImpl#getLanes <em>Lanes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticEntityImpl extends ElementImpl implements StaticEntity {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicEntity> uses;

	/**
	 * The cached value of the '{@link #getLanes() <em>Lanes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanes()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> lanes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenedlPackage.Literals.STATIC_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicEntity> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<DynamicEntity>(DynamicEntity.class, this,
					ScenedlPackage.STATIC_ENTITY__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lane> getLanes() {
		if (lanes == null) {
			lanes = new EObjectContainmentEList<Lane>(Lane.class, this, ScenedlPackage.STATIC_ENTITY__LANES);
		}
		return lanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScenedlPackage.STATIC_ENTITY__LANES:
			return ((InternalEList<?>) getLanes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScenedlPackage.STATIC_ENTITY__USES:
			return getUses();
		case ScenedlPackage.STATIC_ENTITY__LANES:
			return getLanes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ScenedlPackage.STATIC_ENTITY__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends DynamicEntity>) newValue);
			return;
		case ScenedlPackage.STATIC_ENTITY__LANES:
			getLanes().clear();
			getLanes().addAll((Collection<? extends Lane>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ScenedlPackage.STATIC_ENTITY__USES:
			getUses().clear();
			return;
		case ScenedlPackage.STATIC_ENTITY__LANES:
			getLanes().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ScenedlPackage.STATIC_ENTITY__USES:
			return uses != null && !uses.isEmpty();
		case ScenedlPackage.STATIC_ENTITY__LANES:
			return lanes != null && !lanes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StaticEntityImpl
