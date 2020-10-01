package by.bntu.fitr.poisit.lytkina.interfaces;

import by.bntu.fitr.poisit.lytkina.bean.Product;

import java.util.ArrayList;

public interface ProductServiceI {
    void addProduct(Product product);
    Product findProductById(Long id);
    void getAllProducts();
    void deleteProductById(Long id);
    long sizeOfProductList();
}
