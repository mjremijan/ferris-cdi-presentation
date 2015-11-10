package org.ferris.cdi.research.qualifiers;

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
        
        DatabaseExample dbex 
            = cdi.select(DatabaseExample.class).get();        
        dbex.save();
        
        JMSExample jmsex 
            = cdi.select(JMSExample.class).get();        
        jmsex.save();
    }
}
