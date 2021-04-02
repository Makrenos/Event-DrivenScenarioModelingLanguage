/**
 */
package scenedl.impl;

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

import scenedl.Element;
import scenedl.PositionAttribute;
import scenedl.Scene;
import scenedl.ScenedlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenedl.impl.SceneImpl#getName <em>Name</em>}</li>
 *   <li>{@link scenedl.impl.SceneImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link scenedl.impl.SceneImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link scenedl.impl.SceneImpl#getBoundry <em>Boundry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SceneImpl extends MinimalEObjectImpl.Container implements Scene {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getStateMachine() <em>State Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine stateMachine;

	/**
	 * The cached value of the '{@link #getBoundry() <em>Boundry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundry()
	 * @generated
	 * @ordered
	 */
	protected PositionAttribute boundry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SceneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenedlPackage.Literals.SCENE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenedlPackage.SCENE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, ScenedlPackage.SCENE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs) {
		StateMachine oldStateMachine = stateMachine;
		stateMachine = newStateMachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScenedlPackage.SCENE__STATE_MACHINE, oldStateMachine, newStateMachine);
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
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != stateMachine) {
			NotificationChain msgs = null;
			if (stateMachine != null)
				msgs = ((InternalEObject) stateMachine).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScenedlPackage.SCENE__STATE_MACHINE, null, msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject) newStateMachine).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScenedlPackage.SCENE__STATE_MACHINE, null, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenedlPackage.SCENE__STATE_MACHINE, newStateMachine,
					newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionAttribute getBoundry() {
		return boundry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundry(PositionAttribute newBoundry, NotificationChain msgs) {
		PositionAttribute oldBoundry = boundry;
		boundry = newBoundry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScenedlPackage.SCENE__BOUNDRY, oldBoundry, newBoundry);
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
	public void setBoundry(PositionAttribute newBoundry) {
		if (newBoundry != boundry) {
			NotificationChain msgs = null;
			if (boundry != null)
				msgs = ((InternalEObject) boundry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScenedlPackage.SCENE__BOUNDRY, null, msgs);
			if (newBoundry != null)
				msgs = ((InternalEObject) newBoundry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScenedlPackage.SCENE__BOUNDRY, null, msgs);
			msgs = basicSetBoundry(newBoundry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenedlPackage.SCENE__BOUNDRY, newBoundry,
					newBoundry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScenedlPackage.SCENE__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case ScenedlPackage.SCENE__STATE_MACHINE:
			return basicSetStateMachine(null, msgs);
		case ScenedlPackage.SCENE__BOUNDRY:
			return basicSetBoundry(null, msgs);
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
		case ScenedlPackage.SCENE__NAME:
			return getName();
		case ScenedlPackage.SCENE__ELEMENTS:
			return getElements();
		case ScenedlPackage.SCENE__STATE_MACHINE:
			return getStateMachine();
		case ScenedlPackage.SCENE__BOUNDRY:
			return getBoundry();
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
		case ScenedlPackage.SCENE__NAME:
			setName((String) newValue);
			return;
		case ScenedlPackage.SCENE__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends Element>) newValue);
			return;
		case ScenedlPackage.SCENE__STATE_MACHINE:
			setStateMachine((StateMachine) newValue);
			return;
		case ScenedlPackage.SCENE__BOUNDRY:
			setBoundry((PositionAttribute) newValue);
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
		case ScenedlPackage.SCENE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ScenedlPackage.SCENE__ELEMENTS:
			getElements().clear();
			return;
		case ScenedlPackage.SCENE__STATE_MACHINE:
			setStateMachine((StateMachine) null);
			return;
		case ScenedlPackage.SCENE__BOUNDRY:
			setBoundry((PositionAttribute) null);
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
		case ScenedlPackage.SCENE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ScenedlPackage.SCENE__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case ScenedlPackage.SCENE__STATE_MACHINE:
			return stateMachine != null;
		case ScenedlPackage.SCENE__BOUNDRY:
			return boundry != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SceneImpl
