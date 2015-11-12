package org.ferris.cdi.examples.basics;

import javax.enterprise.inject.spi.CDI;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Main {

    public static void main(String[] args) {
        System.out.printf(">>> ENTER Main#main\n");
        CDI<Object> cdi = CDI.getCDIProvider().initialize();

        {
//            FieldInjectionExample ex
//                = cdi.select(FieldInjectionExample.class).get();
//            ex.print();
        }

    }
}
