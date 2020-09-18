package by.bntu.fitr.poisit.lytkina;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    Square square;
    @Before
    public void initCircle(){
        square = new Square(5);
    }

    @Test
    public void getSideLength() {
        assertEquals(5, square.getSideLength());
    }

    @Test
    public void getName() {
        assertEquals("Square", square.getName());
    }

    @Test
    public void getArea() {
        assertEquals(25, square.getArea(), 0);
    }
}