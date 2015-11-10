package org.ferris.cdi.research.decorator;

import javax.inject.Inject;
import org.apache.log4j.Logger;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class TalkingServiceExample {

    @Inject
    protected Logger log;
    
    @Inject
    protected TalkingService talkingService;
    
    public void talk() {
        log.debug(talkingService.sayOne());
        log.debug(talkingService.sayTwo());
        log.debug(talkingService.sayThree());
    }
    
}
