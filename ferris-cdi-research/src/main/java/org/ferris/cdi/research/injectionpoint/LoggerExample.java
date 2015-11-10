package org.ferris.cdi.research.injectionpoint;

import javax.inject.Inject;
import org.apache.log4j.Logger;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class LoggerExample {
    @Inject
    private Logger log;
    
    public void hello() {
        log.debug("Hello logger!");
    }
}
