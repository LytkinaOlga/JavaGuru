package by.bntu.fitr.poisit.lytkina.bean;

import by.bntu.fitr.poisit.lytkina.ProductCategory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)

public class Product {

    private String name;
    private Long id;
    private double price;
    private ProductCategory category;
    private double discount;
    private String description;

    public Product(){
        // необходим для маршаллизации/демаршалиизации XML
    }

    public Product(ProductBuilder productBuilder) {
        this.name = productBuilder.name;
        this.price = productBuilder.price;
        this.category = productBuilder.category;
        this.discount = productBuilder.discount;
        this.description = productBuilder.description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(id, product.id) &&
                Objects.equals(price, product.price) &&
                category == product.category &&
                Objects.equals(discount, product.discount) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, price, category, discount, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", category=" + category +
                ", discount=" + discount +
                ", description='" + description + '\'' +
                '}';
    }
    public static class ProductBuilder{
        private String name;
        private Long id;
        private double price;
        private ProductCategory category;
        private double discount;
        private String description;

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public ProductBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public ProductBuilder setPrice(double price) {
            this.price = price;
            return this;
        }


        public ProductBuilder setCategory(ProductCategory category) {
            this.category = category;
            return this;
        }

        public ProductBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }
        public Product build(){
            return new Product(this);
        }
    }
}

