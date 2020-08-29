package by.bntu.fitr.poisit.lytkina;

import junit.framework.TestCase;

public class LightColorDetectorTest extends TestCase {

    public void testDetectReturnViolet() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        String expected = "Violet";
        String actual = lightColorDetector.detect(400);
        assertEquals(expected, actual);
    }
    public void testDetectReturnBlue() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        String expected = "Blue";
        String actual = lightColorDetector.detect(460);
        assertEquals(expected, actual);
    }
    public void testDetectReturnGreen() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        String expected = "Green";
        String actual = lightColorDetector.detect(500);
        assertEquals(expected, actual);
    }
    public void testDetectReturnYellow() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        String expected = "Yellow";
        String actual = lightColorDetector.detect(575);
        assertEquals(expected, actual);
    }
    public void testDetectReturnOrange() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        String expected = "Orange";
        String actual = lightColorDetector.detect(600);
        assertEquals(expected, actual);
    }
    public void testDetectReturnRed() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        String expected = "Red";
        String actual = lightColorDetector.detect(700);
        assertEquals(expected, actual);
    }
    public void testDetectReturnInvisibleLight() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        String expected = "Invisible light";
        String actual = lightColorDetector.detect(200);
        assertEquals(expected, actual);
    }
}