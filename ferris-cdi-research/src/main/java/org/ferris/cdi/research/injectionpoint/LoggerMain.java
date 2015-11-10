package org.ferris.cdi.research.injectionpoint;

import org.ferris.cdi.research.interfaces.*;
import javax.enterprise.inject.spi.CDI;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class LoggerMain {

    public static void main(String[] args) {
        System.out.printf(">>> ENTER Main#main\n");
        
        System.out.printf(">>> Initialize container \n");
        CDI<Object> cdi = CDI.getCDIProvider().initialize();        
        
        LoggerExample ex 
            = cdi.select(LoggerExample.class).get();   
        ex.hello();
    }
}
