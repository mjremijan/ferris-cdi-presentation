package org.ferris.cdi.research;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class Product {
    public static int counter = 0;
    
    private int i = ++counter;
    
    @Override
    public String toString() {
        return String.format("I'm product %d", i);
    }
}
