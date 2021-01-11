package by.bntu.fitr.poisit.lytkina.singleton.inAdvanced;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonInstantiatedInAdvanceTest {

    @Test
    public void getInstance() {
        SingletonInstantiatedInAdvance singletonInstantiatedInAdvance = SingletonInstantiatedInAdvance.getInstance();
        SingletonInstantiatedInAdvance singletonInstantiatedInAdvance1 = SingletonInstantiatedInAdvance.getInstance();
        assertEquals(singletonInstantiatedInAdvance, singletonInstantiatedInAdvance1);
        System.out.println("1 - "+ singletonInstantiatedInAdvance + "\n2 - "+ singletonInstantiatedInAdvance1);
    }
}