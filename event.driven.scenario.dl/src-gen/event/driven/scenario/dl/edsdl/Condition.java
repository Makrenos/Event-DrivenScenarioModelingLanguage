/**
 */
package event.driven.scenario.dl.edsdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link event.driven.scenario.dl.edsdl.Condition#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see event.driven.scenario.dl.edsdl.EdsdlPackage#getCondition_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link event.driven.scenario.dl.edsdl.Condition#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

} // Condition
