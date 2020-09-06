package by.bntu.fitr.poisit.lytkina;

import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ArrayServiceTest extends TestCase {

    int[] myArray = {4, 5, 20, 74, -6};


    public void testCreate() {
        ArrayService arrayService = new ArrayService();
        arrayService.create(5);
    }

    public void testFillRandomly() {
        ArrayService arrayService = new ArrayService();

        int[] array = arrayService.create(10);
        arrayService.fillRandomly(myArray);
    }

    public void testPrintArray() {
        ArrayService arrayService = new ArrayService();
        arrayService.printArray(myArray);
    }

    public void testSum() {
        ArrayService arrayService = new ArrayService();

        assertEquals(97, arrayService.sum(myArray));
    }

    public void testAvg() {
        ArrayService arrayService = new ArrayService();
        
        assertEquals(19.4, arrayService.avg(myArray));
    }
}