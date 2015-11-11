package org.ferris.cdi.research.decorator;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import javax.interceptor.Interceptor;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public abstract class TalkingServiceDecorator implements TalkingService {
    @Inject @Delegate
    TalkingService talkingService;
 
    @Override
    public String sayThree() {
        return String.format("DECORATOR!!! %s", talkingService.sayThree());
    }
}
