package by.bntu.fitr.poisit.lytkina.bean;

import by.bntu.fitr.poisit.lytkina.ProductCategory;

import java.math.BigDecimal;
import java.util.Objects;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)

public class Product {

    private String name;
    private Long id;
    private BigDecimal price;
    private ProductCategory category;
    private BigDecimal discount;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
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
        private BigDecimal price;
        private ProductCategory category;
        private BigDecimal discount;
        private String description;

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public ProductBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public ProductBuilder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }


        public ProductBuilder setCategory(ProductCategory category) {
            this.category = category;
            return this;
        }

        public ProductBuilder setDiscount(BigDecimal discount) {
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

