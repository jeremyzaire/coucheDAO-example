import fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.model.Product;
import fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.service.ProductService;
import fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.service.impl.ProductServiceImpl;

public class Main {

    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();

        Product product = new Product(1, "");

        productService.getProducts();
        productService.addProduct(product);

        productService.getProducts();

    }

}
