package by.bntu.fitr.poisit.lytkina;

import junit.framework.TestCase;

public class LookupArrayServiceTest extends TestCase {
    int array[] = {41, 2, 0, -5, 854};
    int emptyArray[] = null;

    public void testFindMax() {

        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(854, lookupArrayService.findMax(array));
        assertEquals(0, lookupArrayService.findMax(emptyArray));
    }

    public void testFindMin() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(-5, lookupArrayService.findMin(array));
        assertEquals(0, lookupArrayService.findMin(emptyArray));
    }

    public void testIndexOfMax() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(4, lookupArrayService.indexOfMax(array));
        assertEquals(-1, lookupArrayService.indexOfMax(emptyArray));
    }

    public void testIndexOfMin() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(3, lookupArrayService.indexOfMin(array));
        assertEquals(-1, lookupArrayService.indexOfMin(emptyArray));
    }

    public void testIndexOf() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(2, lookupArrayService.indexOf(array, 0));
        assertEquals(-1, lookupArrayService.indexOfMax(emptyArray));
        assertEquals(-1, lookupArrayService.indexOf(array, 21));
    }
}