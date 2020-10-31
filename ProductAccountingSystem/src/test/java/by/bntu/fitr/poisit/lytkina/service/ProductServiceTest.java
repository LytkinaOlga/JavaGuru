package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.ProductCategory;
import by.bntu.fitr.poisit.lytkina.Products;
import by.bntu.fitr.poisit.lytkina.bean.Product;
import by.bntu.fitr.poisit.lytkina.exceptions.ProductAccountingSystemException;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ProductServiceTest  {

    ProductService productService;
    Product apple;
    Product banana;
    Product tomato;
    double price;
    double discount;
    Products products;

    @Before
    public void init(){
        productService = new ProductService();
        price = 5;
        discount = 50;
        apple = new Product.ProductBuilder()
                .setName("Apple")
                .setPrice(price)
                .setCategory(ProductCategory.FRUIT)
                .setDiscount(discount)
                .setDescription("Apple from Africa")
                .build();
        banana = new Product.ProductBuilder()
                .setName("Banana")
                .setPrice(price)
                .setCategory(ProductCategory.FRUIT)
                .setDiscount(discount)
                .setDescription("Bananas from India")
                .build();
        tomato = new Product.ProductBuilder()
                .setName("Tomato")
                .setPrice(price)
                .setCategory(ProductCategory.VEGETABLES)
                .setDiscount(discount)
                .setDescription("Red tomato from Pinsk")
                .build();
        products = new Products();
        products.setProducts(new ArrayList<Product>());
        products.getProducts().add(apple);
        products.getProducts().add(banana);
    }

    @Test
    public void addProduct() throws JAXBException, IOException {

        productService.addProduct(banana);
    }

    @Test
    public void findProductById() throws JAXBException, IOException {
        productService.addProduct(apple);
        productService.addProduct(banana);

        Product expected = banana;
        Product actual = productService.findProductById(1L);
        assertEquals(expected, actual);
    }

    @Test(expected = ProductAccountingSystemException.class)
    public void findProductByIdThrowException() throws JAXBException, IOException {
        productService.addProduct(apple);
        productService.addProduct(banana);

        productService.findProductById(3L);
     }

    @Test
    public void getAllProducts() throws JAXBException {
        products = productService.getAllProducts();
        for (Product product : products.getProducts()){
            System.out.println(product.toString());
        }
    }

    @Test
    public void deleteProductById() throws JAXBException, IOException {
        productService.addProduct(apple);
        productService.addProduct(banana);

        productService.deleteProductById(1L);

        assertEquals(1, productService.sizeOfProductList());
    }

    @Test
    public void calculatePriceWithDiscount() {
        assertEquals(2,5, productService.calculatePriceWithDiscount(5, 50));

    }

    @Test
    public void marshaling() throws JAXBException {
        productService.marshaling(products);
    }

    @Test
    public void unMarshaling() throws JAXBException {
        productService.unMarshaling();
    }

    @Test
    public void compareByPrice() throws JAXBException {
        Products prod = productService.getAllProducts();
        productService.sortByIncreaseAge(prod);

    }

    @Test
    public void sortByName() throws JAXBException {
        Products prod = productService.getAllProducts();
        productService.sortByName(prod);
    }

}