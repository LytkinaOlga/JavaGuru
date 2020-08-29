package by.bntu.fitr.poisit.lytkina;

import junit.framework.TestCase;

public class SignComparatorTest extends TestCase {

    public void testCompareReturnPositive() {
        SignComparator signComparator = new SignComparator();

        String expected = "Number is positive";
        String actual = signComparator.compare(5);
        assertEquals(expected, actual);

    }

    public void testCompareReturnNegative() {
        SignComparator signComparator = new SignComparator();

        String expected = "Number is negative";
        String actual = signComparator.compare(-5);
        assertEquals(expected, actual);

    }

    public void testCompareReturnZero() {
        SignComparator signComparator = new SignComparator();

        String expected = "Number is equal to zero";
        String actual = signComparator.compare(0);
        assertEquals(expected, actual);
    }
}