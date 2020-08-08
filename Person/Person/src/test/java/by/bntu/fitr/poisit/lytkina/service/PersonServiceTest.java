package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.Person;
import junit.framework.TestCase;

public class PersonServiceTest extends TestCase {

    public void testIfAdultReturnTrue() {
        Person person = new Person();
        person.setAge(18);

        PersonService personService = new PersonService(person);

        boolean expected = true;
        boolean actual = personService.ifAdult();
        assertEquals(expected, actual);
    }

    public void testIfAdultReturnFalse() {
        Person person = new Person();
        person.setAge(14);

        PersonService personService = new PersonService(person);

        boolean expected = false;
        boolean actual = personService.ifAdult();
        assertEquals(expected, actual);
    }
}