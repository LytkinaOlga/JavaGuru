package by.bntu.fitr.poisit.lytkina.exceptions;

public class ProductAccountingSystemException extends RuntimeException {
    public ProductAccountingSystemException(String message){
        super("ProductAccountingSystemException: " + message);
    }
}
