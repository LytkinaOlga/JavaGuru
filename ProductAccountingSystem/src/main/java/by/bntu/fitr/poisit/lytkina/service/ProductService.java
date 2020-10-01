package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.App;
import by.bntu.fitr.poisit.lytkina.bean.Product;
import by.bntu.fitr.poisit.lytkina.exceptions.ProductAccountingSystemException;
import by.bntu.fitr.poisit.lytkina.interfaces.ProductServiceI;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ProductService implements ProductServiceI {

    private ArrayList<Product> products;
    private static Long INCREMENT_ID = 0L;

    public ProductService() {
        this.products = new ArrayList<Product>();
    }

    @Override
    public void addProduct(Product product) {

        product.setId(INCREMENT_ID);
        products.add(product);
        INCREMENT_ID++;
    }

    @Override
    public Product findProductById(Long id) {
        boolean flag = true;
        for (Product product:products) {
            if (product.getId() == id){
                flag = true;
                return product;
            }
            else flag = false;
        }
        if (!flag){
            throw new ProductAccountingSystemException("Product not found");
        }
        return null;
    }

    @Override
    public void getAllProducts() {
        for (Product product:products ) {
            App.log.info("{}", product);
        }
    }

    @Override
    public void deleteProductById(Long id) {
        boolean flag = true;
        for (Product product:products) {
            if (product.getId() == id){
                flag = true;
                products.remove(product);
                break;
            }
            else flag = false;
        }
        if (!flag){
            throw new ProductAccountingSystemException("Id not found");
        }
    }

    @Override
    public long sizeOfProductList() {
        return products.size();
    }

    public boolean checkListIsEmpty(){
        return products.isEmpty();
    }

    public BigDecimal calculatePriceWithDiscount(BigDecimal price, BigDecimal discount){
        if (discount.equals(0)){
            return price;
        }else {
            return price.subtract(price.multiply(discount.divide(BigDecimal.valueOf(100L))));
        }
    }
}
