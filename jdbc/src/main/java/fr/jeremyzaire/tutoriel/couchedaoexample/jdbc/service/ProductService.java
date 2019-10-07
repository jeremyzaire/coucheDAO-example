package fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.service;

import fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    void getOneProduct();

    void addProduct();

    void deleteProduct();

    void updateProduct();
}
