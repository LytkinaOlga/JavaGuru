package by.bntu.fitr.poisit.lytkina;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    Triangle triangle;
    @Before
    public void initCircle(){
        triangle = new Triangle(5, 2);
    }

    @Test
    public void getHeightLength() {
        assertEquals(5, triangle.getHeightLength());
    }

    @Test
    public void getBaseLength() {
        assertEquals(2, triangle.getBaseLength());
    }

    @Test
    public void getName() {
        assertEquals("Triangle", triangle.getName());
    }

    @Test
    public void getArea() {
        assertEquals(5, triangle.getArea(), 0);
    }
}