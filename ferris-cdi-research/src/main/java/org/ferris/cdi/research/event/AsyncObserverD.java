package org.ferris.cdi.research.event;

import javax.enterprise.event.ObservesAsync;
import javax.inject.Inject;
import org.apache.log4j.Logger;
import org.jboss.weld.experimental.Priority;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class AsyncObserverD {

    @Inject
    protected Logger log;
    
    public void observes(@ObservesAsync @Priority(AnEvent.Step2) AnEvent evnt) {
        try {
            Thread.currentThread().sleep(1000 * 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug(String.format(
            "Thread: \"%s\"", Thread.currentThread().getName()));
    }
}
