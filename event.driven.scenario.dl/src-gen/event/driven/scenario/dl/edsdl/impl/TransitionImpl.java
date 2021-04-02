/**
 */
package event.driven.scenario.dl.edsdl.impl;

import event.driven.scenario.dl.edsdl.Action;
import event.driven.scenario.dl.edsdl.Condition;
import event.driven.scenario.dl.edsdl.EFeatureBasedAction;
import event.driven.scenario.dl.edsdl.EdsdlPackage;
import event.driven.scenario.dl.edsdl.State;
import event.driven.scenario.dl.edsdl.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link event.driven.scenario.dl.edsdl.impl.TransitionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.impl.TransitionImpl#getFeatureBasedActions <em>Feature Based Actions</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.impl.TransitionImpl#getRuleBasedActions <em>Rule Based Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected State targetState;

	/**
	 * The cached value of the '{@link #getFeatureBasedActions() <em>Feature Based Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureBasedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<EFeatureBasedAction> featureBasedActions;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

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
	 * The cached value of the '{@link #getRuleBasedActions() <em>Rule Based Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleBasedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> ruleBasedActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdsdlPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject) targetState;
			targetState = (State) eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdsdlPackage.TRANSITION__TARGET_STATE,
							oldTargetState, targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetState(State newTargetState) {
		State oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsdlPackage.TRANSITION__TARGET_STATE, oldTargetState,
					targetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EFeatureBasedAction> getFeatureBasedActions() {
		if (featureBasedActions == null) {
			featureBasedActions = new EObjectResolvingEList<EFeatureBasedAction>(EFeatureBasedAction.class, this,
					EdsdlPackage.TRANSITION__FEATURE_BASED_ACTIONS);
		}
		return featureBasedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject) condition;
			condition = (Condition) eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdsdlPackage.TRANSITION__CONDITION,
							oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsdlPackage.TRANSITION__CONDITION, oldCondition,
					condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdsdlPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getRuleBasedActions() {
		if (ruleBasedActions == null) {
			ruleBasedActions = new EObjectResolvingEList<Action>(Action.class, this,
					EdsdlPackage.TRANSITION__RULE_BASED_ACTIONS);
		}
		return ruleBasedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdsdlPackage.TRANSITION__TARGET_STATE:
			if (resolve)
				return getTargetState();
			return basicGetTargetState();
		case EdsdlPackage.TRANSITION__FEATURE_BASED_ACTIONS:
			return getFeatureBasedActions();
		case EdsdlPackage.TRANSITION__CONDITION:
			if (resolve)
				return getCondition();
			return basicGetCondition();
		case EdsdlPackage.TRANSITION__NAME:
			return getName();
		case EdsdlPackage.TRANSITION__RULE_BASED_ACTIONS:
			return getRuleBasedActions();
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
		case EdsdlPackage.TRANSITION__TARGET_STATE:
			setTargetState((State) newValue);
			return;
		case EdsdlPackage.TRANSITION__FEATURE_BASED_ACTIONS:
			getFeatureBasedActions().clear();
			getFeatureBasedActions().addAll((Collection<? extends EFeatureBasedAction>) newValue);
			return;
		case EdsdlPackage.TRANSITION__CONDITION:
			setCondition((Condition) newValue);
			return;
		case EdsdlPackage.TRANSITION__NAME:
			setName((String) newValue);
			return;
		case EdsdlPackage.TRANSITION__RULE_BASED_ACTIONS:
			getRuleBasedActions().clear();
			getRuleBasedActions().addAll((Collection<? extends Action>) newValue);
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
		case EdsdlPackage.TRANSITION__TARGET_STATE:
			setTargetState((State) null);
			return;
		case EdsdlPackage.TRANSITION__FEATURE_BASED_ACTIONS:
			getFeatureBasedActions().clear();
			return;
		case EdsdlPackage.TRANSITION__CONDITION:
			setCondition((Condition) null);
			return;
		case EdsdlPackage.TRANSITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EdsdlPackage.TRANSITION__RULE_BASED_ACTIONS:
			getRuleBasedActions().clear();
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
		case EdsdlPackage.TRANSITION__TARGET_STATE:
			return targetState != null;
		case EdsdlPackage.TRANSITION__FEATURE_BASED_ACTIONS:
			return featureBasedActions != null && !featureBasedActions.isEmpty();
		case EdsdlPackage.TRANSITION__CONDITION:
			return condition != null;
		case EdsdlPackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EdsdlPackage.TRANSITION__RULE_BASED_ACTIONS:
			return ruleBasedActions != null && !ruleBasedActions.isEmpty();
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

} //TransitionImpl
