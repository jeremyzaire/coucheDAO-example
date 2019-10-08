package hibernate.dao;

import hibernate.model.Product;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ProductDao {
    @PersistenceContext(unitName = "hibernate.product_catalog")
    private EntityManager entityManager;

    public ProductDao() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate.product_catalog");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void saveProduct(Product product) {
        entityManager.persist(product);
    }

    public List<Product> getProducts() {
        Query query = entityManager.createQuery("Select p from Product p");
        return query.getResultList();
    }

    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }

    public void updateProduct(Product product) {
        entityManager.merge(product);
    }

    public void deleteProduct(int id) {
        Product prodcut = entityManager.find(Product.class, id);
        entityManager.remove(prodcut);
    }
}
