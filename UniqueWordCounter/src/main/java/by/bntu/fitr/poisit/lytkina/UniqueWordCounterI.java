package by.bntu.fitr.poisit.lytkina;

import java.util.HashMap;

public interface UniqueWordCounterI {
    void addWord(String word, HashMap<String, Integer> map);
    void getMostFrequentWord(HashMap<String, Integer> map);
    void printWordsFrequency(HashMap<String, Integer> map);
}
