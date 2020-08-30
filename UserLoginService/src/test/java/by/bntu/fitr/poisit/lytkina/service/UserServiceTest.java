package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.User;
import junit.framework.TestCase;

public class UserServiceTest extends TestCase {


    public void testLoginReturnTrue() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();


        boolean expected = true;
        boolean actual = userService.login(user, "1234");
        assertEquals(expected, actual);

    }

    public void testLoginUserAfterTwoAttepts() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();
        userService.login(user, "1134");
        userService.login(user, "1134");

        int expected = 1;
        int actual = user.getNumberOfAttempts();
        assertEquals(expected, actual);

    }

    public void testLoginCheckUserBlockAfterTwoIncorrectAttepts() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();
        userService.login(user, "1134");
        userService.login(user, "1134");

        boolean expected = false;
        boolean actual = user.isBlock();
        assertEquals(expected, actual);

    }

    public void testLoginBlockUserAfterThreeIncorrectAttepts() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();
        userService.login(user, "1134");
        userService.login(user, "1134");
        userService.login(user, "1134");

        boolean expected = true;
        boolean actual = user.isBlock();
        assertEquals(expected, actual);

    }

    public void testLoginBlockUserAfterOneIncorrectAttepts() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();
        userService.login(user, "1134");
        userService.login(user, "1234");

        boolean expected = false;
        boolean actual = user.isBlock();
        assertEquals(expected, actual);

    }

    public void testCheckIfPasswordsAreEqualReturnsTrue() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();

        boolean expected = true;
        boolean actual = userService.checkIfPasswordsAreEqual(user, "1234");
        assertEquals(expected, actual);
    }

    public void testCheckIfPasswordsAreEqualReturnsFalse() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();

        boolean expected = false;
        boolean actual = userService.checkIfPasswordsAreEqual(user, "1134");
        assertEquals(expected, actual);
    }

    public void testDropNumberOfAttempts() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();
        userService.dropNumberOfAttempts(user);

        int expected = 3;
        int actual = user.getNumberOfAttempts();
        assertEquals(expected, actual);

    }

    public void testIsUserBlockedReturnFalse() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();

        boolean expected = false;
        boolean actual = userService.isUserBlocked(user);
        assertEquals(expected, actual);
    }

    public void testIsUserBlockedReturnTrue() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();

        userService.login(user, "1111");
        userService.login(user, "1111");
        userService.login(user, "1111");

        boolean expected = true;
        boolean actual = userService.isUserBlocked(user);
        assertEquals(expected, actual);
    }

    public void testReduceNumberOfAttempts() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();

        userService.login(user, "1111");
        userService.login(user, "1234");

        int expected = 2;
        int actual = user.getNumberOfAttempts();
        assertEquals(expected, actual);
    }

    public void testBlockUser() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();

        userService.blockUser(user);
        boolean expected = true;
        boolean eactual = user.isBlock();
        assertEquals(expected, eactual);

    }

    public void testIfNumberOfAttemptsIsDropReturnFalse() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();

        boolean expected = false;
        boolean actual = userService.ifNumberOfAttemptsIsDrop(user);
        assertEquals(expected, actual);

    }

    public void testIfNumberOfAttemptsIsDropReturnTrue() {
        User user = new User("Olya", "1234");
        UserService userService = new UserService();

        userService.login(user, "1111");
        userService.login(user, "1111");
        userService.login(user, "1111");
        boolean expected = true;
        boolean actual = userService.ifNumberOfAttemptsIsDrop(user);
        assertEquals(expected, actual);

    }
}