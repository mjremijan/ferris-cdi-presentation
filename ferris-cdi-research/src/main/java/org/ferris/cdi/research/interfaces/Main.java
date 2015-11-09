package org.ferris.cdi.research.interfaces;

import javax.enterprise.inject.spi.CDI;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class Main {

    public static void main(String[] args) {
        System.out.printf(">>> ENTER Main#main\n");
        
        System.out.printf(">>> Initialize container \n");
        CDI<Object> cdi = CDI.getCDIProvider().initialize();        
        
        HelloWorldService ex 
            = cdi.select(HelloWorldService.class).get();   
        System.out.printf("%s, %s\n", ex.getHello(), ex.getClass().getName());
    }
}
