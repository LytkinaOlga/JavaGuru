package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PersonService {
    
    private Person person;
    
    Logger logger = (Logger) LoggerFactory.getLogger(PersonService.class);

    public PersonService(Person person) {
        this.person = person;
    }

    public boolean ifAdult(){
        logger.info("checking if person is adult");
        return person.getAge() >= 18;
    }
}
