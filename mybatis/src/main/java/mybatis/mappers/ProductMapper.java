package mybatis.mappers;

import mybatis.model.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> getAllProducts();

    Product getProductById(Integer id);

    void insertProduct(Product product);

    void deleteProduct(Integer id);

    void updateProduct(Product product);
}
