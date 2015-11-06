package org.ferris.cdi.research;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
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
