package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.ProductCategory;
import by.bntu.fitr.poisit.lytkina.bean.Product;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductServiceTest {

    Product apple;
    Product banana;
    BigDecimal price;
    BigDecimal discount;

    @Before
    public void init(){
        price = BigDecimal.valueOf(4.56);
        discount = BigDecimal.valueOf(0);
        apple = new Product("Apple", price , ProductCategory.FRUIT, discount, "Tasty apple from Belarus");
        banana = new Product("Banana", price, ProductCategory.FRUIT, discount, "Bananas from India");
    }

    @Test
    public void addProduct() {
        ProductService productService = new ProductService();
        productService.addProduct(apple);
        productService.addProduct(banana);
        assertEquals(2, productService.sizeOfProductList());
    }

    @Test
    public void findProductById() {
    }

    @Test
    public void getAllProducts() {
    }

    @Test
    public void deleteProductById() {
    }
}