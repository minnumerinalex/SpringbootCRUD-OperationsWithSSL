package com.myexampleproject.springbootcrudexample.controller;

import com.myexampleproject.springbootcrudexample.entity.Product;
import com.myexampleproject.springbootcrudexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
@PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
     return productService.saveProduct(product);
    }
@PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
    return productService.saveProducts(products);
}
@GetMapping("/products")
public List<Product> getProducts() {
    return productService.getAllProducts();
}
@GetMapping("/productById/{id}")
public Product getProductById(@PathVariable int id) {
    return productService.getProductById(id);
}
@GetMapping("/product/{name}")
public Product getProductByName(@PathVariable String name) {
    return productService.getProductByName(name);
}
@DeleteMapping ("/delete/{id}")
 public String deleteProductById(@PathVariable int id) {
    return productService.deleteProduct(id);
 }
 @PutMapping("/update")
 public Product updateProduct(@RequestBody Product product){
    return productService.updateProduct(product);
 }
}
