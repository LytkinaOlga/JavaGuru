package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    List<Product> productList;
    Product milk;
    Product shampoo;
    Product biscuit;

    @Before
    public void innit() {
        shop = new Shop();

        milk = new Product("milk", 1.5);
        shampoo = new Product("Shampoo", 15.4);
        biscuit = new Product("Biscuit", 4.5);

        productList = new ArrayList<Product>();

        productList.add(milk);
        productList.add(shampoo);
        productList.add(biscuit);
    }

    @Test
    public void addProduct() {
        shop.addProduct(milk);
        assertEquals(1, shop.returnSizeOfList());
    }

    @Test
    public void addProductTestWithShopConstructor() {
        Shop newShop = new Shop(productList);
        newShop.addProduct(milk);
        assertEquals(4, productList.size());
    }

    @Test
    public void deleteProduct() {
        shop.addProduct(milk);
        shop.addProduct(shampoo);
        shop.deleteProduct(milk);
        assertEquals(1, shop.returnSizeOfList());
    }

    @Test
    public void findProductByName() {
        shop.addProduct(milk);
        shop.addProduct(shampoo);
        Product expected = new Product("Shampoo", 15.4);
        Product actual = shop.findProductByName("Shampoo");
        assertEquals(expected, actual);
    }

    @Test
    public void findProductsByPrices() {
        List<Product> expected = new ArrayList<Product>();
        expected.add(milk);
        expected.add(biscuit);

        Shop newShop = new Shop(productList);
        List<Product> actual = newShop.findProductsByPrices(0, 10);
        assertEquals(expected, actual);
    }
}