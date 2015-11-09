package org.ferris.cdi.research.basicdi;

import javax.inject.Inject;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
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
