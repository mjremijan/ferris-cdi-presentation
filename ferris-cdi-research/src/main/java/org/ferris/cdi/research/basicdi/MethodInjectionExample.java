package org.ferris.cdi.research.basicdi;

import javax.inject.Inject;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
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
