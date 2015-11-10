package org.ferris.cdi.research.cdibasics;

import javax.inject.Inject;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class PropertyInjectionExample {
    @Inject
    HelloWorldService helloWorld;
    
    public void printHello() {
        System.out.printf(">>>> PropertyInjectionExample %s\n", helloWorld.getHello());
    }
}
