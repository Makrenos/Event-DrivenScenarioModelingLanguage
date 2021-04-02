/**
 */
package edsdl.impl;

import edsdl.Action;
import edsdl.Condition;
import edsdl.Dictionary;
import edsdl.EFeatureBasedAction;
import edsdl.EdsdlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edsdl.impl.DictionaryImpl#getFeatureBasedActions <em>Feature Based Actions</em>}</li>
 *   <li>{@link edsdl.impl.DictionaryImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link edsdl.impl.DictionaryImpl#getRuleBasedActions <em>Rule Based Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DictionaryImpl extends MinimalEObjectImpl.Container implements Dictionary {
	/**
	 * The cached value of the '{@link #getFeatureBasedActions() <em>Feature Based Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureBasedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<EFeatureBasedAction> featureBasedActions;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getRuleBasedActions() <em>Rule Based Actions</em>}' containment reference list.
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
	protected DictionaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdsdlPackage.Literals.DICTIONARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EFeatureBasedAction> getFeatureBasedActions() {
		if (featureBasedActions == null) {
			featureBasedActions = new EObjectContainmentEList<EFeatureBasedAction>(EFeatureBasedAction.class, this,
					EdsdlPackage.DICTIONARY__FEATURE_BASED_ACTIONS);
		}
		return featureBasedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this,
					EdsdlPackage.DICTIONARY__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getRuleBasedActions() {
		if (ruleBasedActions == null) {
			ruleBasedActions = new EObjectContainmentEList<Action>(Action.class, this,
					EdsdlPackage.DICTIONARY__RULE_BASED_ACTIONS);
		}
		return ruleBasedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdsdlPackage.DICTIONARY__FEATURE_BASED_ACTIONS:
			return ((InternalEList<?>) getFeatureBasedActions()).basicRemove(otherEnd, msgs);
		case EdsdlPackage.DICTIONARY__CONDITIONS:
			return ((InternalEList<?>) getConditions()).basicRemove(otherEnd, msgs);
		case EdsdlPackage.DICTIONARY__RULE_BASED_ACTIONS:
			return ((InternalEList<?>) getRuleBasedActions()).basicRemove(otherEnd, msgs);
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
		case EdsdlPackage.DICTIONARY__FEATURE_BASED_ACTIONS:
			return getFeatureBasedActions();
		case EdsdlPackage.DICTIONARY__CONDITIONS:
			return getConditions();
		case EdsdlPackage.DICTIONARY__RULE_BASED_ACTIONS:
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
		case EdsdlPackage.DICTIONARY__FEATURE_BASED_ACTIONS:
			getFeatureBasedActions().clear();
			getFeatureBasedActions().addAll((Collection<? extends EFeatureBasedAction>) newValue);
			return;
		case EdsdlPackage.DICTIONARY__CONDITIONS:
			getConditions().clear();
			getConditions().addAll((Collection<? extends Condition>) newValue);
			return;
		case EdsdlPackage.DICTIONARY__RULE_BASED_ACTIONS:
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
		case EdsdlPackage.DICTIONARY__FEATURE_BASED_ACTIONS:
			getFeatureBasedActions().clear();
			return;
		case EdsdlPackage.DICTIONARY__CONDITIONS:
			getConditions().clear();
			return;
		case EdsdlPackage.DICTIONARY__RULE_BASED_ACTIONS:
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
		case EdsdlPackage.DICTIONARY__FEATURE_BASED_ACTIONS:
			return featureBasedActions != null && !featureBasedActions.isEmpty();
		case EdsdlPackage.DICTIONARY__CONDITIONS:
			return conditions != null && !conditions.isEmpty();
		case EdsdlPackage.DICTIONARY__RULE_BASED_ACTIONS:
			return ruleBasedActions != null && !ruleBasedActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DictionaryImpl
