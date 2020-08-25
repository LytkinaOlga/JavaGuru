package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DogService {
    private Dog dog;

    public DogService(Dog dog) {
        this.dog = dog;
    }

    Logger logger = LoggerFactory.getLogger(DogService.class);
    public void voice(){
        logger.info("Hello! My name is {}! gav gav", dog.getName());
    }
    public void eating(){
        logger.info("I'm eating");
    }
    public void sleeping(){
        logger.info("I'm sleeping");
    }

}
