package by.bntu.fitr.poisit.lytkina.bean;

import junit.framework.TestCase;

public class DogTest extends TestCase {

    public void testGetAge() {
        Dog dog = new Dog();
        dog.setAge(2);
        int expected = 2;
        int actual = dog.getAge();
        assertEquals(expected, actual);
    }

    public void testGetColor() {
        Dog dog = new Dog();
        dog.setColor("black");
        String expected = "black";
        String actual = dog.getColor();
        assertEquals(expected, actual);
    }

    public void testGetName() {
        Dog dog = new Dog();
        dog.setName("Bob");
        String expected = "Bob";
        String actual = dog.getName();
        assertEquals(expected, actual);
    }

    public void testEquals() {
        Dog firstDog = new Dog(2, "black", "Bob");
        Dog secondDog = new Dog(2, "black", "Bob");

        boolean expected = true;
        boolean actual = firstDog.equals(secondDog);
        assertEquals(expected, actual);
    }

    public void testHashCode() {
        Dog dog = new Dog();
        int expected = 29791;
        int actual = dog.hashCode();
        assertEquals(expected, actual);
    }

    public void testTestToString() {
        Dog dog = new Dog();
        String expected = "Dog{age=0, color='null', name='null'}";
        String actual = dog.toString();
        assertEquals(expected, actual);
    }
}