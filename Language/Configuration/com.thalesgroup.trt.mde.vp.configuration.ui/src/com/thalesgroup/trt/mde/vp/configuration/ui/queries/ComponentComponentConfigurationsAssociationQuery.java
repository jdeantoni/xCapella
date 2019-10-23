
// Generated on 23.10.2019 at 02:32:25 CEST by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.configuration.ui.queries;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.model.helpers.query.CapellaQueries;
import org.polarsys.capella.core.model.utils.ListExt;

import org.polarsys.capella.core.model.handler.helpers.CapellaProjectHelper;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;
import org.polarsys.capella.core.data.capellamodeller.Project;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;

/**
* <!-- begin-user-doc -->
* The '<em><b>[ComponentComponentConfigurationsAssociationQuery]</b></em>' BusinessQuery defined for 
* '<em><b>[ConfigurationPackage.eINSTANCE.getComponentConfiguration_ComponentConfigurations()]</b></em>'.
* <!-- end-user-doc -->
* <p>
* </p>
*
* @generated
*/
public class ComponentComponentConfigurationsAssociationQuery implements IBusinessQuery {

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param elementP
	* @generated
	*/
	public List<EObject> getAvailableElements(EObject elementP) {
		List<EObject> availableElements = new ArrayList<EObject>();

		Project project = CapellaProjectHelper.getProject(elementP);
		SystemEngineering systemEngineering = project != null ? SystemEngineeringExt.getSystemEngineering(project)
				: null;

		if (null != systemEngineering) {
			Set<EObject> all = EObjectExt.getAll(systemEngineering,
					ConfigurationPackage.Literals.COMPONENT_CONFIGURATION);
			availableElements.addAll(all);
		}
		availableElements = ListExt.removeDuplicates(availableElements);
		availableElements.remove(elementP);
		return availableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param elementP
	 * @param onlyGeneratedP
	 * @generated
	 */
	public List<EObject> getCurrentElements(EObject elementP, boolean onlyGeneratedP) {
		List<EObject> currentsElements = new ArrayList<EObject>();
		if (elementP instanceof ComponentConfiguration)
			currentsElements.addAll(((ComponentConfiguration) elementP).getComponentConfigurations());
		return currentsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return ConfigurationPackage.Literals.COMPONENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EReference> getEStructuralFeatures() {
		List<EReference> eReferences = new ArrayList<EReference>();
		eReferences.add(ConfigurationPackage.eINSTANCE.getComponentConfiguration_ComponentConfigurations());
		return eReferences;
	}
}
// create the extension