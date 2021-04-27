/**
 * generated by Xtext 2.25.0
 */
package event.driven.sceneDl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link event.driven.sceneDl.Scene#getName <em>Name</em>}</li>
 *   <li>{@link event.driven.sceneDl.Scene#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see event.driven.sceneDl.SceneDlPackage#getScene()
 * @model
 * @generated
 */
public interface Scene extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see event.driven.sceneDl.SceneDlPackage#getScene_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link event.driven.sceneDl.Scene#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link event.driven.sceneDl.Element}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see event.driven.sceneDl.SceneDlPackage#getScene_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Scene