/**
 */
package scenedl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import scenedl.DynamicEntity;
import scenedl.PositionAttribute;
import scenedl.ScenedlPackage;
import scenedl.StaticEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenedl.impl.DynamicEntityImpl#getOn <em>On</em>}</li>
 *   <li>{@link scenedl.impl.DynamicEntityImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicEntityImpl extends ElementImpl implements DynamicEntity {
	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected StaticEntity on;
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionAttribute position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenedlPackage.Literals.DYNAMIC_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticEntity getOn() {
		if (on != null && on.eIsProxy()) {
			InternalEObject oldOn = (InternalEObject) on;
			on = (StaticEntity) eResolveProxy(oldOn);
			if (on != oldOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenedlPackage.DYNAMIC_ENTITY__ON, oldOn,
							on));
			}
		}
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticEntity basicGetOn() {
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn(StaticEntity newOn) {
		StaticEntity oldOn = on;
		on = newOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenedlPackage.DYNAMIC_ENTITY__ON, oldOn, on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionAttribute getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(PositionAttribute newPosition, NotificationChain msgs) {
		PositionAttribute oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScenedlPackage.DYNAMIC_ENTITY__POSITION, oldPosition, newPosition);
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
	public void setPosition(PositionAttribute newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject) position).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScenedlPackage.DYNAMIC_ENTITY__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScenedlPackage.DYNAMIC_ENTITY__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenedlPackage.DYNAMIC_ENTITY__POSITION, newPosition,
					newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScenedlPackage.DYNAMIC_ENTITY__POSITION:
			return basicSetPosition(null, msgs);
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
		case ScenedlPackage.DYNAMIC_ENTITY__ON:
			if (resolve)
				return getOn();
			return basicGetOn();
		case ScenedlPackage.DYNAMIC_ENTITY__POSITION:
			return getPosition();
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
		case ScenedlPackage.DYNAMIC_ENTITY__ON:
			setOn((StaticEntity) newValue);
			return;
		case ScenedlPackage.DYNAMIC_ENTITY__POSITION:
			setPosition((PositionAttribute) newValue);
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
		case ScenedlPackage.DYNAMIC_ENTITY__ON:
			setOn((StaticEntity) null);
			return;
		case ScenedlPackage.DYNAMIC_ENTITY__POSITION:
			setPosition((PositionAttribute) null);
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
		case ScenedlPackage.DYNAMIC_ENTITY__ON:
			return on != null;
		case ScenedlPackage.DYNAMIC_ENTITY__POSITION:
			return position != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicEntityImpl
