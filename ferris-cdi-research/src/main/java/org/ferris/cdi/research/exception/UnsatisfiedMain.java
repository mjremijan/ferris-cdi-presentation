package org.ferris.cdi.research.exception;

import org.ferris.cdi.research.lifecycle.*;
import javax.enterprise.inject.spi.CDI;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class UnsatisfiedMain {

    public static void main(String[] args) {
        System.out.printf(">>> ENTER Main#main\n");
        
        System.out.printf(">>> Initialize container \n");
        CDI<Object> cdi = CDI.getCDIProvider().initialize();        
        
        try {
            UnsatisfiedExceptionExample ex 
                = cdi.select(UnsatisfiedExceptionExample.class).get();        
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
