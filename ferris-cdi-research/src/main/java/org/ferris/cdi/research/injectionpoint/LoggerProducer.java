package org.ferris.cdi.research.injectionpoint;


import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import org.apache.log4j.Logger;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class LoggerProducer {

    @Produces
    public Logger getLogger(InjectionPoint ip) {
        String name = ip.getMember().getDeclaringClass().getName();
        System.out.printf("|||| Get logger for %s\n",name);
        return Logger.getLogger(name);
    }
}
