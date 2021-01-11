package by.bntu.fitr.poisit.lytkina.singleton;

import by.bntu.fitr.poisit.lytkina.singleton.simple.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void getInstance() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(" " + singleton + " " + singleton1);
        Singleton singleton2 = Singleton.getInstance();
        Assert.assertEquals(singleton1, singleton2);
    }
}