/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package xcapellascenario.xdsml.api.impl;
import org.eclipse.emf.ecore.EObject;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Method;
import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;


public class XCapellaScenarioRTDAccessor {
  public static boolean getisStarted(EObject eObject) {
		return (boolean)  getAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.SystemFunctionAspect", "isStarted");
	}
	public static boolean setisStarted(EObject eObject, boolean newValue) {
		return setAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.SystemFunctionAspect", "isStarted", newValue);
	}
  public static boolean getisReady(EObject eObject) {
		return (boolean)  getAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.SystemFunctionAspect", "isReady");
	}
	public static boolean setisReady(EObject eObject, boolean newValue) {
		return setAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.SystemFunctionAspect", "isReady", newValue);
	}
  public static boolean getisSuspended(EObject eObject) {
		return (boolean)  getAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.SystemFunctionAspect", "isSuspended");
	}
	public static boolean setisSuspended(EObject eObject, boolean newValue) {
		return setAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.SystemFunctionAspect", "isSuspended", newValue);
	}
  public static boolean getisStopped(EObject eObject) {
		return (boolean)  getAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.SystemFunctionAspect", "isStopped");
	}
	public static boolean setisStopped(EObject eObject, boolean newValue) {
		return setAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.SystemFunctionAspect", "isStopped", newValue);
	}
  public static int getrunCycles(EObject eObject) {
		return (int)  getAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.SystemFunctionAspect", "runCycles");
	}
	public static boolean setrunCycles(EObject eObject, int newValue) {
		return setAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.SystemFunctionAspect", "runCycles", newValue);
	}
  public static int getocc(EObject eObject) {
		return (int)  getAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.AbstractEndAspect", "occ");
	}
	public static boolean setocc(EObject eObject, int newValue) {
		return setAspectProperty(eObject, "org.eclipse.gemoc.xcapella.scenario.XCapellaScenario", "org.gemoc.scenario.k3dsa.AbstractEndAspect", "occ", newValue);
	}

public static Object getAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName) {
			List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
			Class<?> aspect = null;
			for (Class<?> a : aspects) {
				try {
					if (Class.forName(aspectName).isAssignableFrom(a)) {
						aspect = a;
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			if (aspect == null) {
				return null;
			}
			Object res = null;
			 try {
				res = aspect.getDeclaredMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()).invoke(eObject, eObject);
				if (res != null) {
				return res;
				}else {
					return null;
				}
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			
			 return null;
		}
	
	
	public static boolean setAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName, Object newValue) {
		List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
		Class<?> aspect = null;
		for (Class<?> a : aspects) {
			try {
				if (Class.forName(aspectName).isAssignableFrom(a)) {
					aspect = a;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return false;
			}
		}
		if (aspect == null) {
			return false;
		}
			 try {
				 aspect.getMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className(), newValue.getClass()).invoke(eObject, eObject, newValue);
				return true;
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					Method m = null;
					for(Class<?> c : ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).getClass().getInterfaces()) {
						
						try {
							aspect.getMethod(propertyName, c, newValue.getClass()).invoke(eObject, eObject, newValue);
							return true;
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
						}
						if (m == null) {
							throw new RuntimeException("not method found for "+((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()+"::set"+propertyName);
						}
					}
				}
			return false;
	}
};