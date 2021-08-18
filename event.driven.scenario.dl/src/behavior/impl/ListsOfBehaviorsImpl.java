/**
 */
package behavior.impl;

import behavior.BehaviorList;
import behavior.BehaviorPackage;
import behavior.ListsOfBehaviors;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lists Of Behaviors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behavior.impl.ListsOfBehaviorsImpl#getListsOfBehaviors <em>Lists Of Behaviors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListsOfBehaviorsImpl extends MinimalEObjectImpl.Container implements ListsOfBehaviors {
	/**
	 * The cached value of the '{@link #getListsOfBehaviors() <em>Lists Of Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListsOfBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorList> listsOfBehaviors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListsOfBehaviorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.LISTS_OF_BEHAVIORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorList> getListsOfBehaviors() {
		if (listsOfBehaviors == null) {
			listsOfBehaviors = new EObjectContainmentEList<BehaviorList>(BehaviorList.class, this, BehaviorPackage.LISTS_OF_BEHAVIORS__LISTS_OF_BEHAVIORS);
		}
		return listsOfBehaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.LISTS_OF_BEHAVIORS__LISTS_OF_BEHAVIORS:
				return ((InternalEList<?>)getListsOfBehaviors()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.LISTS_OF_BEHAVIORS__LISTS_OF_BEHAVIORS:
				return getListsOfBehaviors();
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
			case BehaviorPackage.LISTS_OF_BEHAVIORS__LISTS_OF_BEHAVIORS:
				getListsOfBehaviors().clear();
				getListsOfBehaviors().addAll((Collection<? extends BehaviorList>)newValue);
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
			case BehaviorPackage.LISTS_OF_BEHAVIORS__LISTS_OF_BEHAVIORS:
				getListsOfBehaviors().clear();
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
			case BehaviorPackage.LISTS_OF_BEHAVIORS__LISTS_OF_BEHAVIORS:
				return listsOfBehaviors != null && !listsOfBehaviors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListsOfBehaviorsImpl
