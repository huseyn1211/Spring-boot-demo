package com.example.demo.product;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductGetMapping {
    @Autowired
    private ProductService productService;
    @GetMapping("/product")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}
