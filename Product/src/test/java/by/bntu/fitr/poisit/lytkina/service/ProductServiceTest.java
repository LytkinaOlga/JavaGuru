package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.Product;
import junit.framework.TestCase;

public class ProductServiceTest extends TestCase {

    public void testActualPrice() {
        Product product = new Product("Milk");
        ProductService productService = new ProductService(product);
        product.setRegularPrice(1.8);
        product.setDiscount(25);
        double expected = 1.35;
        double actual = productService.actualPrice();

        assertEquals(expected, actual);

    }
}