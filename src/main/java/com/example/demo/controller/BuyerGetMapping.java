package com.example.demo.buyer;

import com.example.demo.model.Buyer;
import com.example.demo.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BuyerGetMapping {
    @Autowired
    private BuyerService buyerService;
    @GetMapping("/buyers")

    public List<Buyer> getBuyers() {
        return buyerService.getBuyers();
    }
}
