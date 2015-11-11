package org.ferris.cdi.research.qualifiers;

import javax.inject.Inject;
import static org.ferris.cdi.research.qualifiers.Storage.StorageType.JMS;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class JMSExample {
    @Inject 
    //@JMS
    @Storage(value=JMS, description="Post to queue")
    private OrderService orderService;
    
    public void save() {
        System.out.printf(">>>> JMSExample %s\n", orderService.getClass().getName());
        orderService.save(new Object());
    }
}
