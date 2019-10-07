import fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.service.ProductService;
import fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.service.impl.ProductServiceImpl;

public class Main {

    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();

        productService.getProducts();







    }

}
