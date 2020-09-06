package by.bntu.fitr.poisit.lytkina;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest {

    int[] myArray = {4, 5, 2, 74, 6};

    @Test
    public void testCreateArrayLength() {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.create(5);

        int expected = 5;
        int actual = array.length;
        assertEquals(expected, actual);
    }
    @Test
    public void testCreateArray() {
        ArrayService arrayService = new ArrayService();

        int[] expected = {0, 0, 0, 0, 0};
        int[] actual = arrayService.create(5);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testFillRandomly() {
        ArrayService arrayService = new ArrayService();

        int[] array = arrayService.create(10);
        arrayService.fillRandomly(array);
    }
    @Test
    public void testFillRandomlyWithExistArray() {
        ArrayService arrayService = new ArrayService();

        arrayService.fillRandomly(myArray);
    }
    @Test
    public void testPrintArray() {
        ArrayService arrayService = new ArrayService();
        arrayService.printArray(myArray);
    }
    @Test
    public void testSum() {
        ArrayService arrayService = new ArrayService();

        assertEquals(91, arrayService.sum(myArray));
    }
    @Test
    public void testAvg() {
        ArrayService arrayService = new ArrayService();
        assertEquals(18.2, arrayService.avg(myArray), 0);
    }

    @Test
    public void sort() {
        ArrayService arrayService = new ArrayService();
        int[] expected = { 2, 4, 5, 6, 74};
        arrayService.sort(myArray);
        assertArrayEquals(expected, myArray);
    }

    @Test
    public void swap() {
        ArrayService arrayService = new ArrayService();
        int[] expected = { 6, 74, 2, 5, 4};
        arrayService.swap(myArray);
        assertArrayEquals(expected, myArray);
    }
}