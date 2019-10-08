package hibernate.service.impl;

import hibernate.dao.ProductDao;
import hibernate.model.Product;
import hibernate.service.ProductService;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao = new ProductDao();

    @Override
    public void getAllProducts() {
        System.out.println("List of products : " + productDao.getProducts());
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public void getProductById(Integer id) {
        Product product = productDao.findById(id);
        System.out.println("Product found : " + product);
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public void insertProduct(Product product) {
        productDao.saveProduct(product);
        System.out.println("Insert Product : " + product);
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public void deleteProduct(Integer id) {
        productDao.deleteProduct(id);
        System.out.println("Delete Product from id: " + id);
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public void updateProduct(Product product) {
        productDao.updateProduct(product);
        System.out.println("Product updated: " + product);
        System.out.println("-----------------------------------------------------------");
    }

}
