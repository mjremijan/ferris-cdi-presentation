package org.ferris.cdi.research;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.apache.log4j.Logger;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class StartupEventObserver {

    @Inject
    public Logger log;
    
    public void startup(@Observes StartupEvent evnt) {
        log.debug("StartupEventObserver got StartupEvent!");
    }
}
