package org.ferris.cdi.research;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.apache.log4j.Logger;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class StartupEventObserver {

    @Inject
    public Logger log;
    
    public void startup(@Observes StartupEvent evnt) {
        log.debug("StartupEventObserver got StartupEvent!");
    }
}
