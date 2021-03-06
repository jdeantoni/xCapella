/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package xcapellaphysicalarchitecture.xdsml.api.impl;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.ElementState;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3ModelState;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3ModelStateFactory;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.dsa.helper.IK3ModelStateHelper;import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;


public class XcapellaPhysicalArchitectureModelStateHelper implements IK3ModelStateHelper{
	private static class AttributeNameToValue implements Serializable{

		private static final long serialVersionUID = 0;		String name;
		Object value;
		public AttributeNameToValue(String n, Object v) {
			name = n;
			value = v;
		}


		@Override
		public boolean equals(Object obj) {
			if (! (obj instanceof AttributeNameToValue)) {
				return false;
			}
			AttributeNameToValue a2n = (AttributeNameToValue)obj;
			if (this.name.compareTo(a2n.name) != 0) {
				return false;
			}
			if (this.value == null) {
				return a2n.value == null;
			}
			if (!this.value.equals(a2n.value)) {
				return false;
			}
			return true;
		}	}
		K3ModelStateFactory theFactory = K3ModelStateFactory.eINSTANCE; 
	public K3ModelState getK3ModelState(EObject model) {
		K3ModelState res = theFactory.createK3ModelState();

		TreeIterator<EObject> allContentIt = model.eAllContents();
		while (allContentIt.hasNext()) {
			EObject elem = allContentIt.next();

			Class<?> clazz =null;
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("occurrenceNumber", XcapellaPhysicalArchitectureRTDAccessor.getoccurrenceNumber(elem));
				elemState.getSavedRTDs().add(n2v0);
				AttributeNameToValue n2v1 = new AttributeNameToValue("occurred", XcapellaPhysicalArchitectureRTDAccessor.getoccurred(elem));
				elemState.getSavedRTDs().add(n2v1);
			}
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("javaFMI_FMU", XcapellaPhysicalArchitectureRTDAccessor.getjavaFMI_FMU(elem));
				elemState.getSavedRTDs().add(n2v0);
				AttributeNameToValue n2v1 = new AttributeNameToValue("fmuAccess", XcapellaPhysicalArchitectureRTDAccessor.getfmuAccess(elem));
				elemState.getSavedRTDs().add(n2v1);
			}
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("currentMode", XcapellaPhysicalArchitectureRTDAccessor.getcurrentMode(elem));
				elemState.getSavedRTDs().add(n2v0);
			}
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("isExecuting", XcapellaPhysicalArchitectureRTDAccessor.getisExecuting(elem));
				elemState.getSavedRTDs().add(n2v0);
			}
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("isStarted", XcapellaPhysicalArchitectureRTDAccessor.getisStarted(elem));
				elemState.getSavedRTDs().add(n2v0);
				AttributeNameToValue n2v1 = new AttributeNameToValue("isEnacted", XcapellaPhysicalArchitectureRTDAccessor.getisEnacted(elem));
				elemState.getSavedRTDs().add(n2v1);
				AttributeNameToValue n2v2 = new AttributeNameToValue("runCycles", XcapellaPhysicalArchitectureRTDAccessor.getrunCycles(elem));
				elemState.getSavedRTDs().add(n2v2);
			}
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("currentTime", XcapellaPhysicalArchitectureRTDAccessor.getcurrentTime(elem));
				elemState.getSavedRTDs().add(n2v0);
			}
		}
		return res;
		}

	public void restoreModelState(K3ModelState state) {
		for(ElementState elemState : state.getOwnedElementstates()) {
			for(Object o : elemState.getSavedRTDs()) {
				AttributeNameToValue n2v = (AttributeNameToValue)o;
				try {
					if (n2v.value != null) {
						Method m = XcapellaPhysicalArchitectureRTDAccessor.class.getMethod("set"+n2v.name, EObject.class, n2v.value.getClass());
						m.invoke(null, elemState.getModelElement(), n2v.value);
					}
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					Method m = null;
					for(Class<?> c : n2v.value.getClass().getInterfaces()) {
						
						try {
							m = XcapellaPhysicalArchitectureRTDAccessor.class.getMethod("set"+n2v.name, EObject.class, n2v.value.getClass().getInterfaces()[0]);
							m.invoke(null, elemState.getModelElement(), n2v.value);
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
						}
						if (m == null) {
							throw new RuntimeException("not method found for "+n2v.value.getClass().getName()+"::set"+n2v.name);
						}
					}
				}
			}
		}
	}

};