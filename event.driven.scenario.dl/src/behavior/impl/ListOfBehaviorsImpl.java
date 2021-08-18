/**
 */
package behavior.impl;

import behavior.Behavior;
import behavior.BehaviorPackage;
import behavior.ListOfBehaviors;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trafficSituation.AbstractDynamicInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Behaviors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behavior.impl.ListOfBehaviorsImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link behavior.impl.ListOfBehaviorsImpl#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfBehaviorsImpl extends MinimalEObjectImpl.Container implements ListOfBehaviors {
	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviors;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected AbstractDynamicInstance actor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfBehaviorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.LIST_OF_BEHAVIORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectContainmentEList<Behavior>(Behavior.class, this, BehaviorPackage.LIST_OF_BEHAVIORS__BEHAVIORS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDynamicInstance getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject)actor;
			actor = (AbstractDynamicInstance)eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.LIST_OF_BEHAVIORS__ACTOR, oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDynamicInstance basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(AbstractDynamicInstance newActor) {
		AbstractDynamicInstance oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.LIST_OF_BEHAVIORS__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.LIST_OF_BEHAVIORS__BEHAVIORS:
				return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.LIST_OF_BEHAVIORS__BEHAVIORS:
				return getBehaviors();
			case BehaviorPackage.LIST_OF_BEHAVIORS__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
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
			case BehaviorPackage.LIST_OF_BEHAVIORS__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection<? extends Behavior>)newValue);
				return;
			case BehaviorPackage.LIST_OF_BEHAVIORS__ACTOR:
				setActor((AbstractDynamicInstance)newValue);
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
			case BehaviorPackage.LIST_OF_BEHAVIORS__BEHAVIORS:
				getBehaviors().clear();
				return;
			case BehaviorPackage.LIST_OF_BEHAVIORS__ACTOR:
				setActor((AbstractDynamicInstance)null);
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
			case BehaviorPackage.LIST_OF_BEHAVIORS__BEHAVIORS:
				return behaviors != null && !behaviors.isEmpty();
			case BehaviorPackage.LIST_OF_BEHAVIORS__ACTOR:
				return actor != null;
		}
		return super.eIsSet(featureID);
	}

} //ListOfBehaviorsImpl
