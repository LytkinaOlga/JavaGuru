package by.bntu.fitr.poisit.lytkina;

import by.bntu.fitr.poisit.lytkina.bean.Product;
import by.bntu.fitr.poisit.lytkina.service.ProductService;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class App {

    public static final Logger log = LoggerFactory.getLogger(App.class);
    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scannerNextLine = new Scanner(System.in);
    public static ProductService productService = new ProductService();
    public static File file = new File("products.xml");
    public static Products products;

    public static void main(String[] args) throws JAXBException, IOException {

        System.out.println("Welcome to product accounting system");
        boolean exit = false;
        int choice;

        while (!exit) {
            System.out.println("1 - add product\n" +
                    "2 - get all products\n" +
                    "3 - find product by id\n" +
                    "4 - delete product by id\n" +
                    "5 - exit\n" +
                    "Input your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:

                        System.out.println("--------------Adding product-------------");
                        System.out.println("Input product name: ");
                        String name = scannerNextLine.nextLine();

                        System.out.println("Input product price: ");
                        BigDecimal price = scanner.nextBigDecimal();

                        System.out.println("Input product category (FRUIT, BAKERY, DAIRY, VEGETABLES, DRINKS, MEAT, HOUSEHOLD, CEREALS): ");
                        String productCategory = scannerNextLine.nextLine();

                        System.out.println("Input product discount(%): ");
                        BigDecimal discount = scanner.nextBigDecimal();

                        System.out.println("Input product description: ");
                        String description = scannerNextLine.nextLine();

                        BigDecimal priceWithDiscount = productService.calculatePriceWithDiscount(price, discount);

                        Product product = new Product.ProductBuilder()
                                .setName(name)
                                .setPrice(priceWithDiscount)
                                .setCategory(ProductCategory.valueOf(productCategory))
                                .setDiscount(discount)
                                .setDescription(description)
                                .build();

                        productService.addProduct(product);
                    break;
                case 2:
                        products = productService.getAllProducts();
                        for (Product prod : products.getProducts()){
                            System.out.println(prod.toString());
                        }
                    break;
                case 3:
                    System.out.println("Input id: ");
                    Long findProductId = scanner.nextLong();

                    System.out.println("result = " + productService.findProductById(findProductId));
                    break;
                case 4:
                    System.out.println("Input id: ");
                    Long deleteProductId = scanner.nextLong();

                    productService.deleteProductById(deleteProductId);
                    System.out.println("Product is deleted");
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    break;
            }
        }




    }
}


