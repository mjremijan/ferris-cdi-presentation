package org.ferris.cdi.research.event;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import org.apache.log4j.Logger;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class EventExample {
    @Inject
    private Logger log;
    
    @Inject
    private Event<AnEvent> event;
    
    public void fire() {
        log.debug("Create AnEvent");        
        AnEvent evnt = new AnEvent();
        
//        log.debug("Before fire()");
//        event.fire(evnt);
//        log.debug("After fire()");
        
        log.debug("Before fireAsync()");
        event.fireAsync(evnt);
        log.debug("After fireAsync()");
    }
}
