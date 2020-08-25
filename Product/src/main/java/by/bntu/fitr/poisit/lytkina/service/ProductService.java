package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.Product;

public class ProductService {
    private Product product;

    public ProductService(Product product) {
        this.product = product;
    }
    public double actualPrice(){
        return product.getRegularPrice()-product.getRegularPrice()*(product.getDiscount()/100);
    }
}
