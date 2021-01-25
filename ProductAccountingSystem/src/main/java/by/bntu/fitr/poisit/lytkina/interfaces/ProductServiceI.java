package by.bntu.fitr.poisit.lytkina.interfaces;

import by.bntu.fitr.poisit.lytkina.Products;
import by.bntu.fitr.poisit.lytkina.bean.Product;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;

public interface ProductServiceI {
    void addProduct(Product product) throws JAXBException, IOException;
    Product findProductById(Long id) throws JAXBException;
    Products getAllProducts() throws JAXBException;
    void deleteProductById(Long id) throws JAXBException;
    long sizeOfProductList();
}
