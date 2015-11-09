package org.ferris.cdi.research.basicdi;

import javax.inject.Inject;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class PropertyInjectionExample {
    @Inject
    HelloWorldService helloWorld;
    
    public void printHello() {
        System.out.printf(">>>> PropertyInjectionExample %s\n", helloWorld.getHello());
    }
}
