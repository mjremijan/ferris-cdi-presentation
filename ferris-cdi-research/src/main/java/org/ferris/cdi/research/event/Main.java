package org.ferris.cdi.research.event;

import javax.enterprise.inject.spi.CDI;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Main {

    public static void main(String[] args) {
        System.out.printf(">>> ENTER Main#main\n");
        
        System.out.printf(">>> Initialize container \n");
        CDI<Object> cdi = CDI.getCDIProvider().initialize();        
        
        EventExample ex 
            = cdi.select(EventExample.class).get();        
        ex.fire();
        try {
            Thread.currentThread().sleep(1000 * 30);
        } catch (Exception e) {
            
        }
    }
}
