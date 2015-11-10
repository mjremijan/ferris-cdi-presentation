package org.ferris.cdi.research.producer;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class Word {
    private String value;
    public Word(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value;
    }
}
