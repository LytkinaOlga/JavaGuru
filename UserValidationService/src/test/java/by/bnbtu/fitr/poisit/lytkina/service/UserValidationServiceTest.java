package by.bnbtu.fitr.poisit.lytkina.service;

import by.bnbtu.fitr.poisit.lytkina.bean.User;
import by.bnbtu.fitr.poisit.lytkina.exception.UserValidationException;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserValidationServiceTest {

    @Test
    public void checkFirstNameReturnTrue() {
        User user = new User();
        UserValidationService userValidationService = new UserValidationService(user);

        userValidationService.checkFirstName("Olga");
        assertEquals("Olga", user.getFirstName());

    }

    @Test(expected = UserValidationException.class)
    public void checkTooShortFirstNameReturnException() {
        User user = new User();
        UserValidationService userValidationService = new UserValidationService(user);
        userValidationService.checkFirstName("Ol");
    }
    @Test(expected = UserValidationException.class)
    public void checkTooLongFirstNameReturnException() {
        User user = new User();
        UserValidationService userValidationService = new UserValidationService(user);
        userValidationService.checkFirstName("Olvfhyggjgbjkbkjhjugefvghcvhavctrw");
    }

    @Test
    public void checkLastNameReturnTrue() {
        User user = new User();
        UserValidationService userValidationService = new UserValidationService(user);

        userValidationService.checkLastName("Lytkina");
        assertEquals("Lytkina", user.getLastName());

    }

    @Test(expected = UserValidationException.class)
    public void checkTooShortLastNameReturnException() {
        User user = new User();
        UserValidationService userValidationService = new UserValidationService(user);
        userValidationService.checkLastName("Ol");
    }
    @Test(expected = UserValidationException.class)
    public void checkTooLongLastNameReturnException() {
        User user = new User();
        UserValidationService userValidationService = new UserValidationService(user);
        userValidationService.checkLastName("Olbhbrjehfbherjvbchjsvchvshcjrevjhrvevjeh");
    }

    @Test
    public void checkAgeReturnTrue() {
        User user = new User();
        UserValidationService userValidationService = new UserValidationService(user);

        userValidationService.checkAge(20);
        assertEquals(20, user.getAge());

    }

    @Test(expected = UserValidationException.class)
    public void checkTooBogAgeReturnException() {
        User user = new User();
        UserValidationService userValidationService = new UserValidationService(user);
        userValidationService.checkAge(125);
    }
    @Test(expected = UserValidationException.class)
    public void checkTooSmallAgeReturnException() {
        User user = new User();
        UserValidationService userValidationService = new UserValidationService(user);
        userValidationService.checkAge(0);
    }
}