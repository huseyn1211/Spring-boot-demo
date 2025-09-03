package com.example.demo.buyer;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Service
public class BuyerService {
    private  List<Buyer> buyers = new ArrayList<>();
    public  void addBuyer(Buyer buyer) {
        buyers.add(buyer);
    }
}
