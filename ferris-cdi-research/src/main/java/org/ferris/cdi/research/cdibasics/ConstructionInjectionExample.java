package org.ferris.cdi.research.cdibasics;

import javax.inject.Inject;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class ConstructionInjectionExample {
    
    private HelloWorldService helloWorld;
    
    @Inject
    public ConstructionInjectionExample(HelloWorldService helloWorld) {
        this.helloWorld = helloWorld;
    }
    
    public void printHello() {
        System.out.printf(">>>> ConstructionInjectionExample %s\n", helloWorld.getHello());
    }
}
