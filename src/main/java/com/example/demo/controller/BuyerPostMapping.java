package com.example.demo.buyer;

import com.example.demo.model.Buyer;
import com.example.demo.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BuyerPostMapping {
    @Autowired
    private BuyerService buyerService;

    @PostMapping("/addBuyer")
    public String addBuyer(@RequestBody Buyer buyer) {
        buyerService.addBuyer(buyer);
        return "alici elave olundu" + buyer.getName();
    }
}
