package org.ferris.cdi.research;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class Order {
    public static int counter = 0;
    
    private int i = ++counter;
    
    @Override
    public String toString() {
        return String.format("I'm order %d", i);
    }
}
