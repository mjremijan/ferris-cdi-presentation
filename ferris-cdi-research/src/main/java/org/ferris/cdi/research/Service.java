package org.ferris.cdi.research;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Service<T> {
    private T obj;
    
    public T get() {
        return obj;
    }
    
    public void set(T t) {
        this.obj = t;
    }
}
