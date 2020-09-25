package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.App;
import by.bntu.fitr.poisit.lytkina.bean.Product;
import by.bntu.fitr.poisit.lytkina.interfaces.ProductServiceI;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements ProductServiceI {
    private List<Product> productList;
    private static Long INCREMENT_ID = 0L;

    public ProductService() {
        productList = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {

        product.setId(INCREMENT_ID);
        productList.add(product);
        INCREMENT_ID++;
    }

    @Override
    public Product findProductById() {
        return null;
    }

    @Override
    public void getAllProducts() {

    }

    @Override
    public void deleteProductById() {

    }

    @Override
    public void printAllProducts() {
        for (Product product:productList ) {
            App.log.info("{}", product);
        }
    }

    @Override
    public long sizeOfProductList() {
        return productList.size();
    }
}
