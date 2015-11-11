package org.ferris.cdi.research.interfaces;

import javax.inject.Inject;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class HelloWorldExample {
    @Inject
    HelloWorldService hwService;
    
    public void sayHello() {
        System.out.printf(">>>> %s\n", hwService.getHello());
    }
}
