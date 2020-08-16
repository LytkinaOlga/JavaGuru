package by.bntu.fitr.poisit.lytkina;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    Set<String> words = new HashSet();

    public void addWord(String word) {
        words.add(word);
    }

    public int getWordsCount() {
        return words.size();
    }

    public String printVocabulary() {
        return "words = " + words;
    }
}
