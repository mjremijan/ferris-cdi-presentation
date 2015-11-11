package org.ferris.cdi.shared;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
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
