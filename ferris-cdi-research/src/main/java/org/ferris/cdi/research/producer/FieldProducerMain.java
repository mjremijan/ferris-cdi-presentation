package org.ferris.cdi.research.producer;

import javax.enterprise.inject.spi.CDI;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class FieldProducerMain {

    public static void main(String[] args) {
        System.out.printf(">>> ENTER Main#main\n");
        
        System.out.printf(">>> Initialize container \n");
        CDI<Object> cdi = CDI.getCDIProvider().initialize();        
        
        FieldProducerExample ex 
            = cdi.select(FieldProducerExample.class).get();   
        ex.print();
    }
}
