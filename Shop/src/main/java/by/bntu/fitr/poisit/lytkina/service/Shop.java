package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.Product;
import by.bntu.fitr.poisit.lytkina.interfaces.ShopI;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ShopI {
    private List<Product> productList;

    public Shop() {
        productList = new ArrayList<>();
    }

    public Shop(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    @Override
    public Product findProductByName(String name) {
        Product result = null;
        for (Product product : productList) {
            if (product.getProductName().equals(name)) {
                result = product;
            }
        }
        return result;
    }

    @Override
    public List<Product> findProductsByPrices(double minPriceRange, double maxPriceRange) {
        List<Product> result = new ArrayList<>();
        for (Product product : productList) {
            if (product.getProductCost() <= maxPriceRange && product.getProductCost() >= minPriceRange) {
                result.add(product);
            }
        }
        return result;
    }

    public int returnSizeOfList() {
        return productList.size();
    }
}
