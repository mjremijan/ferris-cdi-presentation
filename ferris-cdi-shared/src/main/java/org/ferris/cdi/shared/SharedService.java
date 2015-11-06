package org.ferris.cdi.shared;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class SharedService {
    private String name;
    
    public SharedService() {
        name = "I'm a shared Service";
    }
    
    public String getName() {
        return name;
    }
}
