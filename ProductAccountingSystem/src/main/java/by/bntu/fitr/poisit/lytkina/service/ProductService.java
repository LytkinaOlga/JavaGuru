package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.App;
import by.bntu.fitr.poisit.lytkina.bean.Product;
import by.bntu.fitr.poisit.lytkina.exceptions.ProductAccountingSystemException;
import by.bntu.fitr.poisit.lytkina.interfaces.ProductServiceI;
import org.junit.platform.commons.PreconditionViolationException;

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
    public Product findProductById(Long id) {
        boolean flag = true;
        for (Product product:productList) {
            if (product.getId() == id){
                flag = true;
                return product;
            }
            else flag = false;
        }
        if (flag = false){
            throw new ProductAccountingSystemException("Product not found");
        }
        return null;
    }

    @Override
    public void getAllProducts() {
        for (Product product:productList ) {
            App.log.info("{}", product);
        }
    }

    @Override
    public void deleteProductById() {

    }

    @Override
    public long sizeOfProductList() {
        return productList.size();
    }
}
