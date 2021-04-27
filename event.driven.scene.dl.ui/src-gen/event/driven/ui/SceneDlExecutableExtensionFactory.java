/*
 * generated by Xtext 2.25.0
 */
package event.driven.ui;

import com.google.inject.Injector;
import event.driven.scene.dl.ui.internal.DlActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SceneDlExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(DlActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		DlActivator activator = DlActivator.getInstance();
		return activator != null ? activator.getInjector(DlActivator.EVENT_DRIVEN_SCENEDL) : null;
	}

}