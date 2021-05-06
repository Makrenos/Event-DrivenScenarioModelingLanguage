/**
 */
package edsdl.impl;

import edsdl.EdsdlPackage;
import edsdl.RuntimeState;
import edsdl.State;

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
 *   <li>{@link edsdl.impl.RuntimeStateImpl#getActualState <em>Actual State</em>}</li>
 *   <li>{@link edsdl.impl.RuntimeStateImpl#getActor <em>Actor</em>}</li>
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
	 * The default value of the '{@link #getActor() <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected String actor = ACTOR_EDEFAULT;

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
	public String getActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(String newActor) {
		String oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsdlPackage.RUNTIME_STATE__ACTOR, oldActor, actor));
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
		case EdsdlPackage.RUNTIME_STATE__ACTOR:
			return getActor();
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
		case EdsdlPackage.RUNTIME_STATE__ACTOR:
			setActor((String) newValue);
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
		case EdsdlPackage.RUNTIME_STATE__ACTOR:
			setActor(ACTOR_EDEFAULT);
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
		case EdsdlPackage.RUNTIME_STATE__ACTOR:
			return ACTOR_EDEFAULT == null ? actor != null : !ACTOR_EDEFAULT.equals(actor);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (actor: ");
		result.append(actor);
		result.append(')');
		return result.toString();
	}

} //RuntimeStateImpl
