package hibernate;

import hibernate.model.Product;
import hibernate.service.ProductService;
import hibernate.service.impl.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();

        //Create a new product object
        Product product = new Product(3, "Produit Démo");

        //Insert product data
        //productService.insertProduct(product);

        //Get Product by Id
        //productService.getProductById(3);

        //Update Product
        product = new Product(3, "Fin de la démo My Batis");
        //productService.updateProduct(product);

        //Show all products
        productService.getAllProducts();

        //Delete product by id
        //productService.deleteProduct(3);

        //show all products
        //productService.getAllProducts();

    }
}
