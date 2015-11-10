package org.ferris.cdi.research.event;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.Vetoed;
import javax.inject.Inject;
import org.apache.log4j.Logger;
import org.jboss.weld.experimental.Priority;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
//@Vetoed
public class SyncObserverC {

    @Inject
    protected Logger log;
    
    public void observes(@Observes @Priority(AnEvent.Step3) AnEvent evnt) {
        log.debug(String.format(
            "Thread: \"%s\"", Thread.currentThread().getName()));
    }
}
