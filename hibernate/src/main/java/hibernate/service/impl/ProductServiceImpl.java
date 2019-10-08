package hibernate.service.impl;

import hibernate.dao.ProductDao;
import hibernate.model.Product;
import hibernate.service.ProductService;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao = new ProductDao();

    @Override
    public void getAllProducts() {
        System.out.println("List of products : " + productDao.getProducts());
    }

    @Override
    public void getProductById(Integer id) {

    }

    @Override
    public void insertProduct(Product product) {

    }

    @Override
    public void deleteProduct(Integer id) {

    }

    @Override
    public void updateProduct(Product product) {

    }

}
