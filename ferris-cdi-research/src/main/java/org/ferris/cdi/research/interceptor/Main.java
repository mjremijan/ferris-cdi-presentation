package org.ferris.cdi.research.interceptor;

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
        
        ExceptionRetryExample ex 
            = cdi.select(ExceptionRetryExample.class).get();   
        ex.superImportant();
        ex.lessImportant();
    }
}
