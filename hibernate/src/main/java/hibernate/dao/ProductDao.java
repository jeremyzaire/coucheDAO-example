package hibernate.dao;

import hibernate.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;


public class ProductDao {

    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;

    public ProductDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("product-unit");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void saveProduct(Product product) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List getProducts() {
        entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("Select p from Product p");
        List products = query.getResultList();
        entityManager.close();

        return products;
    }

    public Product findById(int id) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Product product = entityManager.find(Product.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();

        return product;
    }

    public void updateProduct(Product product) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(product);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void deleteProduct(int id) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Product product = entityManager.find(Product.class, id);
        entityManager.remove(product);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

}
