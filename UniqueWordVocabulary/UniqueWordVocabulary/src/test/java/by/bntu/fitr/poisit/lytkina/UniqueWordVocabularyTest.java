package by.bntu.fitr.poisit.lytkina;

import junit.framework.TestCase;

public class UniqueWordVocabularyTest extends TestCase {

    public void testAddWord() {
        String word = "cat";
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWord(word);
        boolean expected = true;
        boolean actual = uniqueWordVocabulary.words.contains(word);
        assertEquals(expected, actual);
    }

    public void testGetWordsCount() {
        String firstWord = "cat";
        String secondWord = "dog";
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWord(firstWord);
        uniqueWordVocabulary.addWord(secondWord);
        int expected = 2;

        int actual = uniqueWordVocabulary.getWordsCount();
        assertEquals(expected, actual);
    }

    public void testPrintVocabulary() {
        String word = "cat";
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWord(word);
        String expected = "words = [cat]";
        String actual = uniqueWordVocabulary.printVocabulary();
        assertEquals(expected, actual);
    }
}