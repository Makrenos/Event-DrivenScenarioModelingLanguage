/**
 */
package event.driven.scenario.dl.edsdl.impl;

import event.driven.scenario.dl.edsdl.EdsdlPackage;
import event.driven.scenario.dl.edsdl.State;
import event.driven.scenario.dl.edsdl.Transition;

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
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link event.driven.scenario.dl.edsdl.impl.StateImpl#isAccepting <em>Accepting</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.impl.StateImpl#getOutTransitions <em>Out Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #isAccepting() <em>Accepting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccepting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCEPTING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAccepting() <em>Accepting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccepting()
	 * @generated
	 * @ordered
	 */
	protected boolean accepting = ACCEPTING_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutTransitions() <em>Out Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outTransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdsdlPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccepting() {
		return accepting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccepting(boolean newAccepting) {
		boolean oldAccepting = accepting;
		accepting = newAccepting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsdlPackage.STATE__ACCEPTING, oldAccepting,
					accepting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsdlPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutTransitions() {
		if (outTransitions == null) {
			outTransitions = new EObjectContainmentEList<Transition>(Transition.class, this,
					EdsdlPackage.STATE__OUT_TRANSITIONS);
		}
		return outTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdsdlPackage.STATE__OUT_TRANSITIONS:
			return ((InternalEList<?>) getOutTransitions()).basicRemove(otherEnd, msgs);
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
		case EdsdlPackage.STATE__ACCEPTING:
			return isAccepting();
		case EdsdlPackage.STATE__NAME:
			return getName();
		case EdsdlPackage.STATE__OUT_TRANSITIONS:
			return getOutTransitions();
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
		case EdsdlPackage.STATE__ACCEPTING:
			setAccepting((Boolean) newValue);
			return;
		case EdsdlPackage.STATE__NAME:
			setName((String) newValue);
			return;
		case EdsdlPackage.STATE__OUT_TRANSITIONS:
			getOutTransitions().clear();
			getOutTransitions().addAll((Collection<? extends Transition>) newValue);
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
		case EdsdlPackage.STATE__ACCEPTING:
			setAccepting(ACCEPTING_EDEFAULT);
			return;
		case EdsdlPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EdsdlPackage.STATE__OUT_TRANSITIONS:
			getOutTransitions().clear();
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
		case EdsdlPackage.STATE__ACCEPTING:
			return accepting != ACCEPTING_EDEFAULT;
		case EdsdlPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EdsdlPackage.STATE__OUT_TRANSITIONS:
			return outTransitions != null && !outTransitions.isEmpty();
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
		result.append(" (accepting: ");
		result.append(accepting);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
