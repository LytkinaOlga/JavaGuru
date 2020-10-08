package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.Products;
import by.bntu.fitr.poisit.lytkina.bean.Product;
import by.bntu.fitr.poisit.lytkina.exceptions.ProductAccountingSystemException;
import by.bntu.fitr.poisit.lytkina.interfaces.ProductServiceI;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class ProductService implements ProductServiceI {

    private Products products;
    private static Long INCREMENT_ID = 1L;
    private static File file = new File("products.xml");
    private static JAXBContext context;

    static {
        try {
            context = JAXBContext.newInstance(Product.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public ProductService() {

        this.products = new Products();
        products.setProducts(new ArrayList<Product>());

    }

    @Override
    public void addProduct(Product product) throws JAXBException, IOException {
        products = new Products();
        if (file.length() != 0){

            products = unMarshaling();
            INCREMENT_ID = (Long)(products.getProducts().size() + 0L);
        }else{
            products.setProducts(new ArrayList<Product>());
            INCREMENT_ID = 0L;
        }

        product.setId(++INCREMENT_ID);

        products.getProducts().add(product);
        marshaling(products);
    }

    @Override
    public Product findProductById(Long id) throws JAXBException {
        boolean flag = true;
        products = unMarshaling();
        for (Product product:products.getProducts()) {
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
    public Products getAllProducts() throws JAXBException {
        products = unMarshaling();
        return products;
    }

    @Override
    public void deleteProductById(Long id) throws JAXBException {
        boolean flag = true;
        products = unMarshaling();
        for (Product product:products.getProducts()) {
            if (product.getId() == id){
                flag = true;
                products.getProducts().remove(product);
                break;
            }
            else flag = false;
        }
        if (!flag){
            throw new ProductAccountingSystemException("Id not found");
        }
        if (file.exists()) {
            file.delete();
            File file = new File ("products.xml");
            marshaling(products);
        }
    }

    @Override
    public long sizeOfProductList() {
        return products.getProducts().size();
    }

    public boolean checkListIsEmpty(){
        return products.getProducts().isEmpty();
    }

    public BigDecimal calculatePriceWithDiscount(BigDecimal price, BigDecimal discount){
        if (discount.equals(0)){
            return price;
        }else {
            return price.subtract(price.multiply(discount.divide(BigDecimal.valueOf(100L))));
        }
    }
    public void marshaling(Products products) throws JAXBException
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(products, file);
    }
    public Products unMarshaling() throws JAXBException
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        Products productsList = (Products) jaxbUnmarshaller.unmarshal( file );

        return productsList;
    }
}
