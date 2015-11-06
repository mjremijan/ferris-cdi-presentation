package org.ferris.cdi.initialized;

import java.util.List;
import javax.enterprise.event.Observes;
import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class ContainerInitializedObserver {
    public void bootstrapped(@Observes ContainerInitialized event, @Parameters List<String> parameters) {
        System.out.printf(">>> ENTER ContainerInitializedObserver#bootstrapped\n");
    }
}
