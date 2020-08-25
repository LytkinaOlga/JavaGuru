package by.bntu.fitr.poisit.lytkina.bean;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    public void testTestGetName() {
        Person person = new Person();
        person.setName("Olya");

        String expected = "Olya";
        String actual = person.getName();
        assertEquals(expected, actual);
    }

    public void testGetAge() {
        Person person = new Person();
        person.setAge(20);

        int expected = 20;
        int actual = person.getAge();
        assertEquals(expected, actual);
    }

    public void testTestEquals() {
        Person personRight = new Person();
        personRight.setAge(20);
        personRight.setName("Olya");

        Person personLeft = new Person();
        personLeft.setAge(20);
        personLeft.setName("Olya");

        boolean expected = true;
        boolean actual = personRight.equals(personLeft);
        assertEquals(expected, actual);
    }

    public void testTestHashCode() {
        Person person = new Person();
        person.setAge(20);
        person.setName("Olya");

        int expected = 76295856;
        int actual = person.hashCode();
        assertEquals(expected, actual);

    }

    public void testTestToString() {
        Person person = new Person();
        person.setAge(20);
        person.setName("Olya");

        String expected = "Person{name='Olya', age=20}";
        String actual = person.toString();
        assertEquals(expected, actual);
    }
}