/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Reference Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReferencePkg#getOwnedMessageReferences <em>Owned Message References</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage#getMessageReferencePkg()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='MessageReferencePkg'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a container for message references elements\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface MessageReferencePkg extends Structure {
	/**
	 * Returns the value of the '<em><b>Owned Message References</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Message References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Message References</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage#getMessageReferencePkg_OwnedMessageReferences()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedMessageReferences'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of MessageReference elements contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which MessageReference stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<MessageReference> getOwnedMessageReferences();

} // MessageReferencePkg
