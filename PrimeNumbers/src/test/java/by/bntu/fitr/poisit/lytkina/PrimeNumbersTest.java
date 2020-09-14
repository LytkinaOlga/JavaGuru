package by.bntu.fitr.poisit.lytkina;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumbersTest {


    @Test
    public void sumOfPrimeNumbers() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertEquals(5501, primeNumbers.sumOfPrimeNumbers());
    }

    @Test
    public void checkAndReturnPrimeNumber() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertEquals(7, primeNumbers.checkAndReturnPrimeNumber(7));
    }

    @Test
    public void calculateCountOfPrimeNumbers() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertEquals(3, primeNumbers.calculateCountOfPrimeNumbers(7, 2));
    }
}