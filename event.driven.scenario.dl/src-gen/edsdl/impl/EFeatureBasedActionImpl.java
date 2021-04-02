/**
 */
package edsdl.impl;

import edsdl.EFeatureBasedAction;
import edsdl.EdsdlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFeature Based Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edsdl.impl.EFeatureBasedActionImpl#getChange <em>Change</em>}</li>
 *   <li>{@link edsdl.impl.EFeatureBasedActionImpl#getBy <em>By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EFeatureBasedActionImpl extends ActionImpl implements EFeatureBasedAction {
	/**
	 * The default value of the '{@link #getChange() <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChange() <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected String change = CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBy() <em>By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBy()
	 * @generated
	 * @ordered
	 */
	protected static final int BY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBy() <em>By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBy()
	 * @generated
	 * @ordered
	 */
	protected int by = BY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFeatureBasedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdsdlPackage.Literals.EFEATURE_BASED_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChange() {
		return change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChange(String newChange) {
		String oldChange = change;
		change = newChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsdlPackage.EFEATURE_BASED_ACTION__CHANGE, oldChange,
					change));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBy() {
		return by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBy(int newBy) {
		int oldBy = by;
		by = newBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsdlPackage.EFEATURE_BASED_ACTION__BY, oldBy, by));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdsdlPackage.EFEATURE_BASED_ACTION__CHANGE:
			return getChange();
		case EdsdlPackage.EFEATURE_BASED_ACTION__BY:
			return getBy();
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
		case EdsdlPackage.EFEATURE_BASED_ACTION__CHANGE:
			setChange((String) newValue);
			return;
		case EdsdlPackage.EFEATURE_BASED_ACTION__BY:
			setBy((Integer) newValue);
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
		case EdsdlPackage.EFEATURE_BASED_ACTION__CHANGE:
			setChange(CHANGE_EDEFAULT);
			return;
		case EdsdlPackage.EFEATURE_BASED_ACTION__BY:
			setBy(BY_EDEFAULT);
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
		case EdsdlPackage.EFEATURE_BASED_ACTION__CHANGE:
			return CHANGE_EDEFAULT == null ? change != null : !CHANGE_EDEFAULT.equals(change);
		case EdsdlPackage.EFEATURE_BASED_ACTION__BY:
			return by != BY_EDEFAULT;
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
		result.append(" (change: ");
		result.append(change);
		result.append(", by: ");
		result.append(by);
		result.append(')');
		return result.toString();
	}

} //EFeatureBasedActionImpl
