package org.ferris.cdi.research.interfaces;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class HelloWorldServiceBean implements HelloWorldService {
    @Override
    public String getHello() {
        return "Hello Bean!";
    }
}
