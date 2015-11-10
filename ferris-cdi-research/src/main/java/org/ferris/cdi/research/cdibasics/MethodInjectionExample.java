package org.ferris.cdi.research.cdibasics;

import javax.inject.Inject;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class MethodInjectionExample {
    
    private HelloWorldService helloWorld;
    
    @Inject
    public void setHelloWorldService(HelloWorldService helloWorld) {
        this.helloWorld = helloWorld;
    }
    
    public void printHello() {
        System.out.printf(">>>> InitializerMethodInjectionExample %s\n", helloWorld.getHello());
    }
}
