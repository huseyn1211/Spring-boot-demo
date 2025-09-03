package com.example.demo.product;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductPostMapping {
    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "yemeylerin siyahisi" + product.getName();

    }
}
