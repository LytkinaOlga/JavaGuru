package by.bnbtu.fitr.poisit.lytkina.exception;

public class UserValidationException extends RuntimeException{
    public UserValidationException(String message) {
        super("UserValidationException::" + message);
    }
}
