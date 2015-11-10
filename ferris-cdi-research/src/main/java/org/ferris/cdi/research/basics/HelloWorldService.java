package org.ferris.cdi.research.basics;

import javax.inject.Inject;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
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
