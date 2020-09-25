package by.bntu.fitr.poisit.lytkina.interfaces;

import by.bntu.fitr.poisit.lytkina.bean.Product;

public interface ProductServiceI {
    void addProduct(Product product);
    Product findProductById(Long id);
    void getAllProducts();
    void deleteProductById();
    long sizeOfProductList();
}
