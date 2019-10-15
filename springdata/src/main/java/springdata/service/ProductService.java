package springdata.service;

import springdata.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAllProducts();

    Optional<Product> findById(Long id);

    Product addProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long id);
}
