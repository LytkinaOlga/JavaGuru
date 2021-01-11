package by.bntu.fitr.poisit.lytkina.singleton.sinchronize;

import org.junit.Test;

import static org.junit.Assert.*;

public class SinchronixedSingletonTest {

    @Test
    public void getInstance() {
        SinchronixedSingleton sinchronixedSingleton = SinchronixedSingleton.getInstance();
        SinchronixedSingleton sinchronixedSingleton1 = SinchronixedSingleton.getInstance();
        assertEquals(sinchronixedSingleton, sinchronixedSingleton1);
    }
}