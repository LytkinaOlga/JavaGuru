package by.bntu.fitr.poisit.lytkina;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAddition() {
        Calculator calculator = new Calculator(1, 4);
        int expected = 5;
        int actual = calculator.Addition();
        assertEquals(expected, actual);
    }

    public void testMultiplication() {
        Calculator calculator = new Calculator(1, 4);
        int expected = 4;
        int actual = calculator.Multiplication();
        assertEquals(expected, actual);
    }

    public void testSubtraction() {
        Calculator calculator = new Calculator(1, 4);
        int expected = -3;
        int actual = calculator.Subtraction();
        assertEquals(expected, actual);
    }

    public void testDivision() {
        Calculator calculator = new Calculator(1, 4);
        double expected = 0.25;
        double actual = calculator.Division();
        assertEquals(expected, actual);
    }

    public void testDivisionReturnZero() {
        Calculator calculator = new Calculator(1, 0);
        double expected = 0;
        double actual = calculator.Division();
        assertEquals(expected, actual);
    }
}