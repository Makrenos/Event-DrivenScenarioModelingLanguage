/**
 */
package edsdl.impl;

import edsdl.Dictionary;
import edsdl.EdsdlPackage;
import edsdl.RuntimeState;
import edsdl.State;
import edsdl.StateMachine;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edsdl.impl.StateMachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link edsdl.impl.StateMachineImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link edsdl.impl.StateMachineImpl#getRuntimestate <em>Runtimestate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getDictionary() <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionary()
	 * @generated
	 * @ordered
	 */
	protected Dictionary dictionary;

	/**
	 * The cached value of the '{@link #getRuntimestate() <em>Runtimestate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimestate()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeState> runtimestate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdsdlPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, EdsdlPackage.STATE_MACHINE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary getDictionary() {
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionary(Dictionary newDictionary, NotificationChain msgs) {
		Dictionary oldDictionary = dictionary;
		dictionary = newDictionary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EdsdlPackage.STATE_MACHINE__DICTIONARY, oldDictionary, newDictionary);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionary(Dictionary newDictionary) {
		if (newDictionary != dictionary) {
			NotificationChain msgs = null;
			if (dictionary != null)
				msgs = ((InternalEObject) dictionary).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EdsdlPackage.STATE_MACHINE__DICTIONARY, null, msgs);
			if (newDictionary != null)
				msgs = ((InternalEObject) newDictionary).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EdsdlPackage.STATE_MACHINE__DICTIONARY, null, msgs);
			msgs = basicSetDictionary(newDictionary, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsdlPackage.STATE_MACHINE__DICTIONARY, newDictionary,
					newDictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeState> getRuntimestate() {
		if (runtimestate == null) {
			runtimestate = new EObjectContainmentEList<RuntimeState>(RuntimeState.class, this,
					EdsdlPackage.STATE_MACHINE__RUNTIMESTATE);
		}
		return runtimestate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdsdlPackage.STATE_MACHINE__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		case EdsdlPackage.STATE_MACHINE__DICTIONARY:
			return basicSetDictionary(null, msgs);
		case EdsdlPackage.STATE_MACHINE__RUNTIMESTATE:
			return ((InternalEList<?>) getRuntimestate()).basicRemove(otherEnd, msgs);
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
		case EdsdlPackage.STATE_MACHINE__STATES:
			return getStates();
		case EdsdlPackage.STATE_MACHINE__DICTIONARY:
			return getDictionary();
		case EdsdlPackage.STATE_MACHINE__RUNTIMESTATE:
			return getRuntimestate();
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
		case EdsdlPackage.STATE_MACHINE__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends State>) newValue);
			return;
		case EdsdlPackage.STATE_MACHINE__DICTIONARY:
			setDictionary((Dictionary) newValue);
			return;
		case EdsdlPackage.STATE_MACHINE__RUNTIMESTATE:
			getRuntimestate().clear();
			getRuntimestate().addAll((Collection<? extends RuntimeState>) newValue);
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
		case EdsdlPackage.STATE_MACHINE__STATES:
			getStates().clear();
			return;
		case EdsdlPackage.STATE_MACHINE__DICTIONARY:
			setDictionary((Dictionary) null);
			return;
		case EdsdlPackage.STATE_MACHINE__RUNTIMESTATE:
			getRuntimestate().clear();
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
		case EdsdlPackage.STATE_MACHINE__STATES:
			return states != null && !states.isEmpty();
		case EdsdlPackage.STATE_MACHINE__DICTIONARY:
			return dictionary != null;
		case EdsdlPackage.STATE_MACHINE__RUNTIMESTATE:
			return runtimestate != null && !runtimestate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl
