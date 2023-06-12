package com.example.kursova_26.controller.Rest;

import com.example.kursova_26.model.Goods;
import com.example.kursova_26.model.Sale;
import com.example.kursova_26.service.impls.GoodsServiceImp;
import com.example.kursova_26.service.impls.SaleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sale")
public class SaleRestController {
    @Autowired
    SaleServiceImp service;


    @GetMapping("/getall/")
    public List<Sale> getAllSales(){
        return service.getAll();
    }
}

