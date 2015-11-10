package org.ferris.cdi.research.basics;

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
        
        PropertyInjectionExample pie 
            = cdi.select(PropertyInjectionExample.class).get();
        pie.printHello();
        
        ConstructionInjectionExample cie 
            = cdi.select(ConstructionInjectionExample.class).get();
        cie.printHello();
        
        MethodInjectionExample imie 
            = cdi.select(MethodInjectionExample.class).get();
        imie.printHello();
        
        AllInjectionExample aie 
            = cdi.select(AllInjectionExample.class).get();
        aie.printAll();
    }
}
