package fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.service;

import fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.model.Product;

public interface ProductService {
    void getProducts();

    void getOneProduct();

    void addProduct(Product product);

    void deleteProduct();

    void updateProduct();
}
