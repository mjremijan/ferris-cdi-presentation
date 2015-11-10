package org.ferris.cdi.research.producer;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
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
