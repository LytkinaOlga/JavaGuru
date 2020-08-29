package by.bntu.fitr.poisit.lytkina;

import junit.framework.TestCase;

public class HumanTest extends TestCase {

    public void testTestGetName() {
        Human human = new Human("Olya", 20);
        String expected = "Olya";
        String actual = human.getName();
        assertEquals(expected, actual);
    }

    public void testGetAge() {
        Human human = new Human("Olya", 20);
        int expected = 20;
        int actual = human.getAge();
        assertEquals(expected, actual);
    }

    public void testTestEquals() {
        Human firstHuman = new Human("Olya", 20);
        Human secondHuman = new Human("Olya", 20);

        boolean expected = true;
        boolean actual = firstHuman.equals(secondHuman);
        assertEquals(expected, actual);
    }

    public void testTestHashCode() {
        Human human = new Human("Olya", 20);
        int expected = 76295856;
        int actual = human.hashCode();
        assertEquals(expected, actual);
    }

    public void testTestToString() {
        Human human = new Human("Olya", 20);
        String expected = "Human{name='Olya', age=20}";
        String actual = human.toString();
        assertEquals(expected, actual);

    }

    public void testGreet() {
        Human human = new Human("Olya", 20);
        String expected = "Hi! I'm Olya, 20 years old.";
        String actual = human.greet();
        assertEquals(expected, actual);
    }
}