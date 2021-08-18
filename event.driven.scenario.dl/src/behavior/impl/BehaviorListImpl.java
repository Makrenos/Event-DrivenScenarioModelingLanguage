/**
 */
package behavior.impl;

import behavior.Behavior;
import behavior.BehaviorList;
import behavior.BehaviorPackage;

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
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behavior.impl.BehaviorListImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link behavior.impl.BehaviorListImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link behavior.impl.BehaviorListImpl#getNumberOfBehaviors <em>Number Of Behaviors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorListImpl extends MinimalEObjectImpl.Container implements BehaviorList {
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
	 * The default value of the '{@link #getNumberOfBehaviors() <em>Number Of Behaviors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBehaviors()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_BEHAVIORS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfBehaviors() <em>Number Of Behaviors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBehaviors()
	 * @generated
	 * @ordered
	 */
	protected int numberOfBehaviors = NUMBER_OF_BEHAVIORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.BEHAVIOR_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectContainmentEList<Behavior>(Behavior.class, this, BehaviorPackage.BEHAVIOR_LIST__BEHAVIORS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.BEHAVIOR_LIST__ACTOR, oldActor, actor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_LIST__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfBehaviors() {
		return numberOfBehaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfBehaviors(int newNumberOfBehaviors) {
		int oldNumberOfBehaviors = numberOfBehaviors;
		numberOfBehaviors = newNumberOfBehaviors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.BEHAVIOR_LIST__NUMBER_OF_BEHAVIORS, oldNumberOfBehaviors, numberOfBehaviors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.BEHAVIOR_LIST__BEHAVIORS:
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
			case BehaviorPackage.BEHAVIOR_LIST__BEHAVIORS:
				return getBehaviors();
			case BehaviorPackage.BEHAVIOR_LIST__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
			case BehaviorPackage.BEHAVIOR_LIST__NUMBER_OF_BEHAVIORS:
				return getNumberOfBehaviors();
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
			case BehaviorPackage.BEHAVIOR_LIST__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection<? extends Behavior>)newValue);
				return;
			case BehaviorPackage.BEHAVIOR_LIST__ACTOR:
				setActor((AbstractDynamicInstance)newValue);
				return;
			case BehaviorPackage.BEHAVIOR_LIST__NUMBER_OF_BEHAVIORS:
				setNumberOfBehaviors((Integer)newValue);
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
			case BehaviorPackage.BEHAVIOR_LIST__BEHAVIORS:
				getBehaviors().clear();
				return;
			case BehaviorPackage.BEHAVIOR_LIST__ACTOR:
				setActor((AbstractDynamicInstance)null);
				return;
			case BehaviorPackage.BEHAVIOR_LIST__NUMBER_OF_BEHAVIORS:
				setNumberOfBehaviors(NUMBER_OF_BEHAVIORS_EDEFAULT);
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
			case BehaviorPackage.BEHAVIOR_LIST__BEHAVIORS:
				return behaviors != null && !behaviors.isEmpty();
			case BehaviorPackage.BEHAVIOR_LIST__ACTOR:
				return actor != null;
			case BehaviorPackage.BEHAVIOR_LIST__NUMBER_OF_BEHAVIORS:
				return numberOfBehaviors != NUMBER_OF_BEHAVIORS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (numberOfBehaviors: ");
		result.append(numberOfBehaviors);
		result.append(')');
		return result.toString();
	}

} //BehaviorListImpl
