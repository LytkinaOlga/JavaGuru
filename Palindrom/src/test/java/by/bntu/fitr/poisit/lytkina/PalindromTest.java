package by.bntu.fitr.poisit.lytkina;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromTest {

    @Test
    public void isPalindrome() {
        Palindrom palindrom = new Palindrom();
        String text = "Le,VEl";
        text = palindrom.toLowerCase(text);
        text = palindrom.removeGarbage(text);

        boolean expected = true;
        boolean actual = palindrom.isPalindrome(text);
        assertEquals(expected, actual);

    }
}