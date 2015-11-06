package org.ferris.cdi.research;

import javax.enterprise.inject.spi.CDI;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class Main {

    public static void main(String[] args) {
        System.out.printf(">>> ENTER Main#main\n");
        try (CDI<Object> cdi = CDI.getCDIProvider().initialize()) {
            // start the container, retrieve a bean and do work with it
            System.out.printf(">>> CDI bootstrap complete. \n");
            
            // get my first bean
            MyBean myBean = cdi.select(MyBean.class).get();
            System.out.printf(">>> MyBean name=\"%s\"\n", myBean.getName());
            System.out.printf(">>> MyBean accountId=\"%s\"\n", myBean.getAccountId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
