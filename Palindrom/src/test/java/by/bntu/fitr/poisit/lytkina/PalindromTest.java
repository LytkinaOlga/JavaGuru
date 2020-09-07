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

    @Test
    public void removeCharFromStr() {
        Palindrom palindrom = new Palindrom();
        String text = "Le,VEl";
        String expected = "LeVEl";
        String actual = palindrom.removeCharFromStr(text, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void toLowerCase() {
        Palindrom palindrom = new Palindrom();
        String text = "LeVEl";

        assertEquals("level", palindrom.toLowerCase(text));
    }

    @Test
    public void removeGarbage() {
        Palindrom palindrom = new Palindrom();
        String text = "Le,VEl";
        assertEquals("LeVEl", palindrom.removeGarbage(text));
        
    }
}