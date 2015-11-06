package org.ferris.cdi.research;

import javax.enterprise.inject.spi.CDI;
import org.apache.log4j.Logger;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class Main {

    public static final Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        log.debug(">>> ENTER Main#main\n");
        try (CDI<Object> cdi = CDI.getCDIProvider().initialize()) {
            // start the container, retrieve a bean and do work with it
            log.debug(">>> CDI bootstrap complete. \n");
            
            // get my first bean
            MyBean myBean = cdi.select(MyBean.class).get();
            log.debug(String.format(">>> MyBean name=\"%s\"\n", myBean.getName()));
            log.debug(String.format(">>> MyBean accountId=\"%s\"\n", myBean.getAccountId()));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
