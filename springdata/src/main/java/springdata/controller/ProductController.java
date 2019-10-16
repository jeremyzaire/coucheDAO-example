package springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springdata.model.Product;
import springdata.service.ProductService;

import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<Object> getAll() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProduct(@PathVariable("id") Long id) {
        return productService.findById(id);
    }

    @DeleteMapping(value = "/product/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
    }

    @PostMapping(value = "/product", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }


    @PutMapping(value = "/product", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
        return new ResponseEntity<>("Product updated successfully", HttpStatus.CREATED);
    }
}
