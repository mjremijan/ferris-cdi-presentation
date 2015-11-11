package org.ferris.cdi.research.producer;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class WordListProducer {

    @Produces
    public List<Word> produceWordList() {
        List<Word> wordList = new ArrayList<>();
        
        try (LineNumberReader reader 
            = new LineNumberReader(new FileReader("voice-test-one.txt"));
        ){            
            for (String line=reader.readLine(); line!=null; line=reader.readLine()) {
                wordList.add(new Word(line));
            }            
        } catch (IOException e) {
            wordList.clear();
        }
        
        return wordList;
    }
    
    public void disposeWordList(@Disposes List<Word> wordList) {
        System.out.printf(">>>> Disposing list!!!\n");
        wordList.clear();
        wordList = null;
    }    
}
