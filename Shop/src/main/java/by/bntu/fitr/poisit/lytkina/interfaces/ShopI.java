package by.bntu.fitr.poisit.lytkina.interfaces;

import by.bntu.fitr.poisit.lytkina.bean.Product;

import java.util.List;

public interface ShopI {
    void addProduct(Product product);

    void deleteProduct(Product product);

    Product findProductByName(String name);

    List<Product> findProductsByPrices(double minPriceRange, double maxPriceRange);
}
