package org.ferris.cdi.research;

import javax.enterprise.event.Event;
import javax.enterprise.inject.spi.CDI;
import javax.enterprise.util.TypeLiteral;
import org.apache.log4j.Logger;
import org.ferris.cdi.shared.SharedService;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Main {

    public static final Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        log.debug(">>> ENTER Main#main\n");
        try (CDI<Object> cdi = CDI.getCDIProvider().initialize()) {
            // start the container, retrieve a bean and do work with it
            log.debug(">>> CDI bootstrap complete. \n");
            
            // Get my first bean example
            MyBean myBean = cdi.select(MyBean.class).get();
            log.debug(String.format(">>> MyBean name=\"%s\"\n", myBean.getName()));
            
            // Get bean from shared library example
            SharedService sharedService = cdi.select(SharedService.class).get();
            log.debug(String.format(">>> SharedService name=\"%s\"\n", sharedService.getName()));
            
            // Parameterized type example
            ParameterizedTypeExample parameterizedTypeExample = cdi.select(ParameterizedTypeExample.class).get();
            parameterizedTypeExample.setOrder();
            parameterizedTypeExample.setProduct();
            parameterizedTypeExample.print();
            parameterizedTypeExample.setOrder();
            parameterizedTypeExample.print();
            
            // Event
            Event<StartupEvent> e;
            e = cdi.select(new TypeLiteral<Event<StartupEvent>>(){}).get();
            e.fire(new StartupEvent());
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
