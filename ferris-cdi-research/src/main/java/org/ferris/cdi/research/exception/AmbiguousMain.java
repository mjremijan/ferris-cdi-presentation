package org.ferris.cdi.research.exception;

import org.ferris.cdi.research.lifecycle.*;
import javax.enterprise.inject.spi.CDI;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class AmbiguousMain {

    public static void main(String[] args) {
        System.out.printf(">>> ENTER Main#main\n");
        
        System.out.printf(">>> Initialize container \n");
        CDI<Object> cdi = CDI.getCDIProvider().initialize();        
        
        try {
            AmbiguousExample ex 
                = cdi.select(AmbiguousExample.class).get();        
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
