package by.bntu.fitr.poisit.lytkina;

import junit.framework.TestCase;

public class PhraseAnalyserTest extends TestCase {

    public void testAnalyzeTextWithMakeAndGreatAgain() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

        String expected = "It stands no chance";
        String actual = phraseAnalyser.analyze("Make smt great again");
        assertEquals(expected, actual);
    }
    public void testAnalyzeTextStsrtsWithMake() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

        String expected = "It could be worse";
        String actual = phraseAnalyser.analyze("Make smt");
        assertEquals(expected, actual);
    }
    public void testAnalyzeTextFinishesWithGreatAgain() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

        String expected = "It could be worse";
        String actual = phraseAnalyser.analyze("Smt great again");
        assertEquals(expected, actual);
    }
    public void testAnalyzeTextWithoutMakeAndGreatAgain() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

        String expected = "It is fine, really";
        String actual = phraseAnalyser.analyze("smt");
        assertEquals(expected, actual);
    }
}