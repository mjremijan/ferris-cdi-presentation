package org.ferris.cdi.research.producer;

import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class FieldProducerExample {
    @Inject
    private List<Integer> integers;
    
    public void print() {
        System.out.printf(">>>> Integers: %s\n", integers);
    }
}
