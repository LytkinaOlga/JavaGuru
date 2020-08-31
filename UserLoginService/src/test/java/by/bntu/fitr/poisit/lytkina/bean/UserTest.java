package by.bntu.fitr.poisit.lytkina.bean;

import by.bntu.fitr.poisit.lytkina.service.UserService;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getLogin() {
        User user = new User("Olya", "1234");
        String expected = "Olya";
        String actual = user.getLogin();
        assertEquals(expected, actual);
    }

    @Test
    public void getPassword() {
        User user = new User("Olya", "1234");
        String expected = "1234";
        String actual = user.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void isBlock() {
        User user = new User("Olya", "1234");
        boolean expected = false;
        boolean actual = user.isBlock();
        assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfAttempts() {
        User user = new User("Olya", "1234");
        int expected = 3;
        int actual = user.getNumberOfAttempts();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        User firstUser = new User("Olya", "1234");
        User secondUser = new User("Olya", "1234");
        boolean expected = true;
        boolean actual = firstUser.equals(secondUser);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        User user = new User("Olya", "1234");

        int expected = 1756466476;
        int actual = user.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        User user = new User("Olya", "1234");

        String expected = "User{login='Olya', password='1234', isBlock=false, numberOfAttempts=3}";
        String actual = user.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void dropNumberOfAttempts() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();
        userService.login(user, "1111");
        user.dropNumberOfAttempts();
        int expected = 3;
        int actual = user.getNumberOfAttempts();
        assertEquals(expected, actual);
    }
}