/**
 */
package event.driven.scenario.dl.edsdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFeature Based Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link event.driven.scenario.dl.edsdl.EFeatureBasedAction#getChange <em>Change</em>}</li>
 *   <li>{@link event.driven.scenario.dl.edsdl.EFeatureBasedAction#getBy <em>By</em>}</li>
 * </ul>
 *
 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getEFeatureBasedAction()
 * @model
 * @generated
 */
public interface EFeatureBasedAction extends Action {
	/**
	 * Returns the value of the '<em><b>Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' attribute.
	 * @see #setChange(String)
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getEFeatureBasedAction_Change()
	 * @model required="true"
	 * @generated
	 */
	String getChange();

	/**
	 * Sets the value of the '{@link event.driven.scenario.dl.edsdl.EFeatureBasedAction#getChange <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' attribute.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(String value);

	/**
	 * Returns the value of the '<em><b>By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By</em>' attribute.
	 * @see #setBy(int)
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getEFeatureBasedAction_By()
	 * @model required="true"
	 * @generated
	 */
	int getBy();

	/**
	 * Sets the value of the '{@link event.driven.scenario.dl.edsdl.EFeatureBasedAction#getBy <em>By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By</em>' attribute.
	 * @see #getBy()
	 * @generated
	 */
	void setBy(int value);

} // EFeatureBasedAction
