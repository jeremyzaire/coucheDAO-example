package hibernate.service;

import hibernate.model.Product;

public interface ProductService {
    void getAllProducts();

    void getProductById(Integer id);

    void insertProduct(Product product);

    void deleteProduct(Integer id);

    void updateProduct(Product product);
}
