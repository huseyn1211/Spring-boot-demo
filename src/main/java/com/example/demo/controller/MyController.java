package com.example.demo.controller;

import com.example.demo.buyer.Buyer;
import com.example.demo.buyer.BuyerService;
import com.example.demo.product.Product;
import com.example.demo.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") 
public class MyController {

    @Autowired
    private BuyerService buyerService;

    @Autowired
    private ProductService productService;


    @PostMapping("/buyers")
    public String addBuyer(@RequestBody Buyer buyer) {
        buyerService.addBuyer(buyer);
        return "Buyer əlavə olundu: " + buyer.getName();
    }

    @GetMapping("/buyers")
    public List<Buyer> getBuyers() {
        return buyerService.getBuyers();
    }


    @PostMapping("/products")
    public String addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "Product əlavə olundu: " + product.getName();
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}
