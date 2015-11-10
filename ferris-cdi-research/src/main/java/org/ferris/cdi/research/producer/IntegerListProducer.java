package org.ferris.cdi.research.producer;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Produces;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class IntegerListProducer {
    @Produces
    private List<Integer> intList = new ArrayList(){{add(1); add(2); add(3);}};
}
