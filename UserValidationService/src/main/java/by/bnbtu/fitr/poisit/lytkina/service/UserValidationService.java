package by.bnbtu.fitr.poisit.lytkina.service;

import by.bnbtu.fitr.poisit.lytkina.bean.User;
import by.bnbtu.fitr.poisit.lytkina.exception.UserValidationException;

public class UserValidationService {
    private User user;

    public UserValidationService(User user) {
        this.user = user;
    }

    public void checkFirstName(String name) {
        if (name.length() > 3 && name.length() <= 15) {
            user.setFirstName(name);
        } else throw new UserValidationException("Incorrect length of firstname");
    }

    public void checkLastName(String lastName) {
        if (lastName.length() > 3 && lastName.length() <= 15) {
            user.setLastName(lastName);
        } else throw new UserValidationException("Incorrect length of lastname");
    }

    public void checkAge(int age) {
        if (age > 0 && age <= 120) {
            user.setAge(age);
        } else throw new UserValidationException("Incorrect age");
    }
}
