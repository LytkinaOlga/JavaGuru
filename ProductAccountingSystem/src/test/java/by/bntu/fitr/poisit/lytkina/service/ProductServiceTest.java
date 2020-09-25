package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.ProductCategory;
import by.bntu.fitr.poisit.lytkina.bean.Product;
import by.bntu.fitr.poisit.lytkina.exceptions.ProductAccountingSystemException;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.regex.PatternSyntaxException;

import static org.junit.Assert.*;

public class ProductServiceTest {

    ProductService productService;
    Product apple;
    Product banana;
    BigDecimal price;
    BigDecimal discount;

    @Before
    public void init(){
        productService = new ProductService();
        price = BigDecimal.valueOf(4.56);
        discount = BigDecimal.valueOf(0);
        apple = new Product("Apple", price , ProductCategory.FRUIT, discount, "Tasty apple from Belarus");
        banana = new Product("Banana", price, ProductCategory.FRUIT, discount, "Bananas from India");
    }

    @Test
    public void addProduct() {

        productService.addProduct(apple);
        productService.addProduct(banana);
        assertEquals(2, productService.sizeOfProductList());
    }

    @Test
    public void findProductById() {
        productService.addProduct(apple);
        productService.addProduct(banana);

        Product expected = banana;
        Product actual = productService.findProductById(1L);
        assertEquals(expected, actual);
    }

    @Test(expected = ProductAccountingSystemException.class)
    public void findProductByIdThrowException() {
        productService.addProduct(apple);
        productService.addProduct(banana);

        productService.findProductById(3L);
    }

    @Test
    public void getAllProducts() {
    }

    @Test
    public void deleteProductById() {
    }
}