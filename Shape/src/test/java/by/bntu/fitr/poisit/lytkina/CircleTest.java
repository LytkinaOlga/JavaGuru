package by.bntu.fitr.poisit.lytkina;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    Circle circle;
    @Before
    public void initCircle(){
        circle = new Circle(5);
    }

    @Test
    public void getRadius() {
        assertEquals(5, circle.getRadius());
    }

    @Test
    public void getName() {
        Circle circle = new Circle(5);
        assertEquals("Circle", circle.getName());
    }

    @Test
    public void getArea() {
        Circle circle = new Circle(5);
        assertEquals(78.53981633974483, circle.getArea(), 0);
    }
}