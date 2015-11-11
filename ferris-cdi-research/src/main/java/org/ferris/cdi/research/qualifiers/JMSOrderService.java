package org.ferris.cdi.research.qualifiers;

import static java.lang.System.out;
import static org.ferris.cdi.research.qualifiers.Storage.StorageType.JMS;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
//@JMS
@Storage(value=JMS)
public class JMSOrderService implements OrderService {
    @Override
    public void save(Object o) {
        out.printf(">>>> @Storage post Order to JMS Queue\n");
    }
}
