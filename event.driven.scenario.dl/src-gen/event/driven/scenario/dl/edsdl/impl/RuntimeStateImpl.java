/**
 */
package event.driven.scenario.dl.edsdl.impl;

import event.driven.scenario.dl.edsdl.EdsdlPackage;
import event.driven.scenario.dl.edsdl.RuntimeState;
import event.driven.scenario.dl.edsdl.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link event.driven.scenario.dl.edsdl.impl.RuntimeStateImpl#getActualState <em>Actual State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeStateImpl extends MinimalEObjectImpl.Container implements RuntimeState {
	/**
	 * The cached value of the '{@link #getActualState() <em>Actual State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualState()
	 * @generated
	 * @ordered
	 */
	protected State actualState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdsdlPackage.Literals.RUNTIME_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getActualState() {
		if (actualState != null && actualState.eIsProxy()) {
			InternalEObject oldActualState = (InternalEObject) actualState;
			actualState = (State) eResolveProxy(oldActualState);
			if (actualState != oldActualState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdsdlPackage.RUNTIME_STATE__ACTUAL_STATE,
							oldActualState, actualState));
			}
		}
		return actualState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetActualState() {
		return actualState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualState(State newActualState) {
		State oldActualState = actualState;
		actualState = newActualState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsdlPackage.RUNTIME_STATE__ACTUAL_STATE,
					oldActualState, actualState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdsdlPackage.RUNTIME_STATE__ACTUAL_STATE:
			if (resolve)
				return getActualState();
			return basicGetActualState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EdsdlPackage.RUNTIME_STATE__ACTUAL_STATE:
			setActualState((State) newValue);
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
		case EdsdlPackage.RUNTIME_STATE__ACTUAL_STATE:
			setActualState((State) null);
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
		case EdsdlPackage.RUNTIME_STATE__ACTUAL_STATE:
			return actualState != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeStateImpl
