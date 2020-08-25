package by.bntu.fitr.poisit.lytkina.bean;

import by.bntu.fitr.poisit.lytkina.service.ProductService;
import junit.framework.TestCase;

public class ProductTest extends TestCase {

    public void testTestEquals() {
        Product firstProduct = new Product("Milk");
        firstProduct.setRegularPrice(1.8);
        firstProduct.setDiscount(25);

        Product secondProduct = new Product("Milk");
        secondProduct.setRegularPrice(1.8);
        secondProduct.setDiscount(25);

        boolean expected = true;
        boolean actual = firstProduct.equals(secondProduct);
        assertEquals(expected, actual);
    }

    public void testTestHashCode() {
        Product product = new Product("Milk");
        product.setRegularPrice(1.8);
        product.setDiscount(25);

        int expected = 1013508601;
        int actual = product.hashCode();
        assertEquals(expected, actual);
    }

    public void testTestToString() {
        Product product = new Product("Milk");
        product.setRegularPrice(1.8);
        product.setDiscount(25);

        String expected = "Product{name='Milk', regularPrice=1.8, discount=25.0}";
        String actual = product.toString();
        assertEquals(expected, actual);
    }
}