package org.ferris.cdi.research.producer;

import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class FieldProducerExample {
    @Inject
    private List<Integer> integers;
    
    public void print() {
        System.out.printf(">>>> Integers: %s\n", integers);
    }
}
