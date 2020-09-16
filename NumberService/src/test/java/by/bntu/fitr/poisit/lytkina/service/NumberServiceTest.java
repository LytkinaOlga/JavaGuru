package by.bntu.fitr.poisit.lytkina.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    @Test
    public void rangeSumRightOrder() {
        NumberService numberService = new NumberService();
        int expected = 9;
        int actual = numberService.rangeSum(2, 4);
        assertEquals(expected, actual);
    }
    @Test
    public void rangeSumWrongOrder() {
        NumberService numberService = new NumberService();
        int expected = 9;
        int actual = numberService.rangeSum(4, 2);
        assertEquals(expected, actual);
    }
    @Test
    public void rangeSumWithEqualNumbers() {
        NumberService numberService = new NumberService();
        int expected = 0;
        int actual = numberService.rangeSum(4, 4);
        assertEquals(expected, actual);
    }
}