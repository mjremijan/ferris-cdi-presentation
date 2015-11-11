package org.ferris.cdi.bootstrapped;

import javax.enterprise.inject.spi.CDI;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf(">>> ENTER Main#main\n");
        try (CDI<Object> cdi = CDI.getCDIProvider().initialize()) {
            // start the container, retrieve a bean and do work with it
            System.out.printf(">>> CDI bootstrap complete. \n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
