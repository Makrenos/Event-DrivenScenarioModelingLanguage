/**
 * generated by Xtext 2.25.0
 */
package event.driven.sceneDl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link event.driven.sceneDl.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link event.driven.sceneDl.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link event.driven.sceneDl.Attribute#isIsTransient <em>Is Transient</em>}</li>
 * </ul>
 *
 * @see event.driven.sceneDl.SceneDlPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see event.driven.sceneDl.SceneDlPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link event.driven.sceneDl.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link event.driven.sceneDl.AttributeType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see event.driven.sceneDl.AttributeType
   * @see #setType(AttributeType)
   * @see event.driven.sceneDl.SceneDlPackage#getAttribute_Type()
   * @model
   * @generated
   */
  AttributeType getType();

  /**
   * Sets the value of the '{@link event.driven.sceneDl.Attribute#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see event.driven.sceneDl.AttributeType
   * @see #getType()
   * @generated
   */
  void setType(AttributeType value);

  /**
   * Returns the value of the '<em><b>Is Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Transient</em>' attribute.
   * @see #setIsTransient(boolean)
   * @see event.driven.sceneDl.SceneDlPackage#getAttribute_IsTransient()
   * @model
   * @generated
   */
  boolean isIsTransient();

  /**
   * Sets the value of the '{@link event.driven.sceneDl.Attribute#isIsTransient <em>Is Transient</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Transient</em>' attribute.
   * @see #isIsTransient()
   * @generated
   */
  void setIsTransient(boolean value);

} // Attribute
