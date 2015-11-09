package org.ferris.cdi.research.interfaces;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class HelloWorldServiceBean implements HelloWorldService {
    @Override
    public String getHello() {
        return "Hello Bean!";
    }
}
