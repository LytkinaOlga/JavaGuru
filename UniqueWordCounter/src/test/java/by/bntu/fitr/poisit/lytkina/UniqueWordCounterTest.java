package by.bntu.fitr.poisit.lytkina;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class UniqueWordCounterTest {
    UniqueWordCounter uniqueWordCounter;
    HashMap<String, Integer> wordAndNumber;
    @Before
    public void init(){
        wordAndNumber = new HashMap<>();
        uniqueWordCounter = new UniqueWordCounter();
        uniqueWordCounter.addWord("apple", wordAndNumber);
        uniqueWordCounter.addWord("banana", wordAndNumber);
        uniqueWordCounter.addWord("apple", wordAndNumber);
        uniqueWordCounter.addWord("apple", wordAndNumber);
        uniqueWordCounter.addWord("lemon", wordAndNumber);
        uniqueWordCounter.addWord("lemon", wordAndNumber);
        uniqueWordCounter.addWord("lemon", wordAndNumber);
        uniqueWordCounter.addWord("lemon", wordAndNumber);

    }

    @Test
    public void addWord() {
        uniqueWordCounter.addWord("watermelon", wordAndNumber);
        assertTrue(wordAndNumber.containsKey("watermelon"));
    }

    @Test
    public void checkCountOfAddingWord() {
        int count = 0;
        for(Map.Entry<String, Integer> map: wordAndNumber.entrySet()){
            if (map.getKey() == "apple"){
                count = map.getValue();
            }
        }
        assertEquals(3,  count);
    }

    @Test
    public void getMostFrequentWord() {
        uniqueWordCounter.getMostFrequentWord(wordAndNumber);
    }

    @Test
    public void printWordsFrequency() {
        uniqueWordCounter.printWordsFrequency(wordAndNumber);
    }
}