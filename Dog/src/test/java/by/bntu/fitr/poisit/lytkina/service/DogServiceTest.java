package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.Dog;
import junit.framework.TestCase;

public class DogServiceTest extends TestCase {

    public void testVoice() {
        Dog dog = new Dog(2, "black", "Bob");
        DogService dogService = new DogService(dog);
        dogService.voice();
    }

    public void testEating() {
        Dog dog = new Dog(2, "black", "Bob");
        DogService dogService = new DogService(dog);
        dogService.eating();
    }

    public void testSleeping() {
        Dog dog = new Dog(2, "black", "Bob");
        DogService dogService = new DogService(dog);
        dogService.sleeping();
    }
}