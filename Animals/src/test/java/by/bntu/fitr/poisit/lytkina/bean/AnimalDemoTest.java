package by.bntu.fitr.poisit.lytkina.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalDemoTest {
    @Test
    public void testParrot(){
        Parrot parrot = new Parrot(2, true, "yellow", "pink", "Kesha");
        String expected = "Parrot{name='Kesha', beakColor='pink', countOfLegs=2, canSwim=true, color='yellow'}";
        String actual = parrot.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testParrotMethod(){
        Parrot parrot = new Parrot(2, true, "yellow", "pink", "Kesha");
        
        assertEquals("Hello! I am Kesha", parrot.speak());
        assertEquals("kurlyk-kyrlyk", parrot.voice());
        assertEquals("I can breath", parrot.breath());
        assertEquals("I am flying", parrot.fly());
        
    }
    @Test
    public void testCat(){
        Cat cat = new Cat(2, true, "white", "Olya");
        String expected = "Cat{name='Olya', countOfLegs=2, canSwim=true, color='white'}";
        String actual = cat.toString();
    }
    @Test
    public void testCatMethods(){
        Cat cat = new Cat(2, true, "white", "Olya");
        assertEquals("I like drinking milk", cat.drinkMilk());
        assertEquals("mua - mua", cat.voice());
        assertEquals("I can breath", cat.breath());
        assertEquals("I can run", cat.run());
    }
    @Test
    public void testDog(){
        Dog dog = new Dog(4, true, "white", "ridgback");
        String expected = "Dod{dogBreed='ridgback', countOfLegs=4, canSwim=true, color='white'}";
        String actual = dog.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testDogMethods(){
        Dog dog = new Dog(4, true, "white", "ridgback");
        String expected = "Dod{dogBreed='ridgback', countOfLegs=4, canSwim=true, color='white'}";

        assertEquals("I am wagging a tail", dog.wagTail());
        assertEquals("hau-hau", dog.voice());
        assertEquals("I can breath", dog.breath());
        assertEquals("I can run", dog.run());
    }

}