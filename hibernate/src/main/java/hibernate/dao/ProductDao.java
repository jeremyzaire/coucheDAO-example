package hibernate.dao;

import hibernate.model.Product;
import hibernate.utils.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class ProductDao {

    public void saveProduct(Product product) {

    }

    public List<Product> getProducts() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.createQuery("from Product", Product.class).list();
        }
    }
}
