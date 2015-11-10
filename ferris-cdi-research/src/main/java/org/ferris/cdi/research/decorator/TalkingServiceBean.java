package org.ferris.cdi.research.decorator;

/**
 *
 * @author @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class TalkingServiceBean implements TalkingService {

    public String sayOne() {
        return "One";
    }

    public String sayTwo() {
        return "Two";
    }

    public String sayThree() {
        return "Three";
    }
}
