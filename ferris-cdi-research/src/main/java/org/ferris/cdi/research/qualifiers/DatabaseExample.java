package org.ferris.cdi.research.qualifiers;

import javax.inject.Inject;
import static org.ferris.cdi.research.qualifiers.Storage.StorageType.DB;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class DatabaseExample {
    @Inject
    //@DB
    @Storage(value=DB, description="Save to DB") 
    OrderService orderService;
    
    public void save() {
        System.out.printf(">>>> DatabaseExample %s\n", orderService.getClass().getName());
        orderService.save(new Object());
    }
}
