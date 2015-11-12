package org.ferris.cdi.bootstrapped;

import javax.enterprise.inject.spi.CDI;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf(">>> ENTER Main#main\n");
        System.out.printf(">>> CDI bootstrap start. \n");
        CDI<Object> cdi = CDI.getCDIProvider().initialize();
        
        System.out.printf(">>> CDI bootstrap complete. \n");
    }
}
