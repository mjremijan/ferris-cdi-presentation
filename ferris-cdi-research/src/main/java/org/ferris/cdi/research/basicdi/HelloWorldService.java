package org.ferris.cdi.research.basicdi;

import javax.inject.Inject;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class HelloWorldService {
    
    @Inject
    WordGenerationService wordGenerationService;
    
    public String getHello() {
        return String.format("%s %s!"
        , wordGenerationService.getHello()
        , wordGenerationService.getWorld()
        );
    }
}   
