package by.bntu.fitr.poisit.lytkina.bean;

import java.util.Objects;

public class Product {
    private String productName;
    private double productCost;

    public Product(String productName, double productCost) {
        this.productName = productName;
        this.productCost = productCost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName) &&
                Objects.equals(productCost, product.productCost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productCost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCost=" + productCost +
                '}';
    }
}
