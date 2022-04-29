package ee.karl.webshop.controller;

import ee.karl.webshop.model.Product;
import ee.karl.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("products/{index}")
    public Product getProduct(@PathVariable Long index) {
        return productRepository.findById(index).get();
    }

    @DeleteMapping("products/{index}")
    public List<Product> deleteProduct(@PathVariable Long index) {
        productRepository.deleteById(index);
        return productRepository.findAll();
    }

    @DeleteMapping("products")
    public String deleteAllProducts() {
        productRepository.deleteAll();
        return "Kõik tooted kustutatud";
    }

    @PostMapping("products")
    public void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    @PutMapping("products")
    public void editProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    @PostMapping("add-all-products")
    public void addAllProducts(@RequestBody List<Product> products) {
        productRepository.saveAll(products);
    }
}
