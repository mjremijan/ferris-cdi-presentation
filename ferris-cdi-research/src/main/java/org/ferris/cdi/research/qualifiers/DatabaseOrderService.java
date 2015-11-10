package org.ferris.cdi.research.qualifiers;

import static java.lang.System.out;
import static org.ferris.cdi.research.qualifiers.Storage.StorageType.DB;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
//@DB
@Storage(value=DB)
public class DatabaseOrderService implements OrderService {

    @Override
    public void save(Object o) {
        out.printf(">>>> @Storage save to database\n");
    }

}
