package springdata.repository;

import org.springframework.data.repository.CrudRepository;
import springdata.model.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByContent(String content);

}
