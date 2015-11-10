package org.ferris.cdi.research.producer;

import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author <a href="mailto:mjremijan@yahoo.com">Michael Remijan</a>
 */
public class MethodProducerExample {

    @Inject
    private List<Word> wordList;
    
    public void print() {
        System.out.println(">>>> VOICE TEST");
        wordList.forEach(w->System.out.printf(">>>> %s\n",w));
    }
}
