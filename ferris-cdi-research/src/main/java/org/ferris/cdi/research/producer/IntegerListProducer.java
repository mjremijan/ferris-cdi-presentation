package org.ferris.cdi.research.producer;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Produces;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class IntegerListProducer {
    @Produces
    private List<Integer> intList = new ArrayList(){{add(1); add(2); add(3);}};
}
