/**
 */
package scenedl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scenedl.Lane;
import scenedl.PositionAttribute;
import scenedl.ScenedlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenedl.impl.LaneImpl#getStartingPosition <em>Starting Position</em>}</li>
 *   <li>{@link scenedl.impl.LaneImpl#getId <em>Id</em>}</li>
 *   <li>{@link scenedl.impl.LaneImpl#getEndingPosition <em>Ending Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaneImpl extends MinimalEObjectImpl.Container implements Lane {
	/**
	 * The cached value of the '{@link #getStartingPosition() <em>Starting Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionAttribute startingPosition;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndingPosition() <em>Ending Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionAttribute endingPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenedlPackage.Literals.LANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionAttribute getStartingPosition() {
		return startingPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartingPosition(PositionAttribute newStartingPosition, NotificationChain msgs) {
		PositionAttribute oldStartingPosition = startingPosition;
		startingPosition = newStartingPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScenedlPackage.LANE__STARTING_POSITION, oldStartingPosition, newStartingPosition);
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
	public void setStartingPosition(PositionAttribute newStartingPosition) {
		if (newStartingPosition != startingPosition) {
			NotificationChain msgs = null;
			if (startingPosition != null)
				msgs = ((InternalEObject) startingPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScenedlPackage.LANE__STARTING_POSITION, null, msgs);
			if (newStartingPosition != null)
				msgs = ((InternalEObject) newStartingPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScenedlPackage.LANE__STARTING_POSITION, null, msgs);
			msgs = basicSetStartingPosition(newStartingPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenedlPackage.LANE__STARTING_POSITION,
					newStartingPosition, newStartingPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenedlPackage.LANE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionAttribute getEndingPosition() {
		return endingPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndingPosition(PositionAttribute newEndingPosition, NotificationChain msgs) {
		PositionAttribute oldEndingPosition = endingPosition;
		endingPosition = newEndingPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScenedlPackage.LANE__ENDING_POSITION, oldEndingPosition, newEndingPosition);
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
	public void setEndingPosition(PositionAttribute newEndingPosition) {
		if (newEndingPosition != endingPosition) {
			NotificationChain msgs = null;
			if (endingPosition != null)
				msgs = ((InternalEObject) endingPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScenedlPackage.LANE__ENDING_POSITION, null, msgs);
			if (newEndingPosition != null)
				msgs = ((InternalEObject) newEndingPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScenedlPackage.LANE__ENDING_POSITION, null, msgs);
			msgs = basicSetEndingPosition(newEndingPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenedlPackage.LANE__ENDING_POSITION,
					newEndingPosition, newEndingPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScenedlPackage.LANE__STARTING_POSITION:
			return basicSetStartingPosition(null, msgs);
		case ScenedlPackage.LANE__ENDING_POSITION:
			return basicSetEndingPosition(null, msgs);
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
		case ScenedlPackage.LANE__STARTING_POSITION:
			return getStartingPosition();
		case ScenedlPackage.LANE__ID:
			return getId();
		case ScenedlPackage.LANE__ENDING_POSITION:
			return getEndingPosition();
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
		case ScenedlPackage.LANE__STARTING_POSITION:
			setStartingPosition((PositionAttribute) newValue);
			return;
		case ScenedlPackage.LANE__ID:
			setId((Integer) newValue);
			return;
		case ScenedlPackage.LANE__ENDING_POSITION:
			setEndingPosition((PositionAttribute) newValue);
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
		case ScenedlPackage.LANE__STARTING_POSITION:
			setStartingPosition((PositionAttribute) null);
			return;
		case ScenedlPackage.LANE__ID:
			setId(ID_EDEFAULT);
			return;
		case ScenedlPackage.LANE__ENDING_POSITION:
			setEndingPosition((PositionAttribute) null);
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
		case ScenedlPackage.LANE__STARTING_POSITION:
			return startingPosition != null;
		case ScenedlPackage.LANE__ID:
			return id != ID_EDEFAULT;
		case ScenedlPackage.LANE__ENDING_POSITION:
			return endingPosition != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //LaneImpl
