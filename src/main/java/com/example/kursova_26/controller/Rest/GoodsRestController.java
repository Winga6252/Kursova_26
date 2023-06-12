package com.example.kursova_26.controller.Rest;

import com.example.kursova_26.model.Goods;
import com.example.kursova_26.service.impls.GoodsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/goods")
public class GoodsRestController {
    @Autowired
    GoodsServiceImp service;

    @GetMapping("/hello")
    public String getHello(){
        return "HELLO!!!!!!!!!!!!!";
    }


    @GetMapping("/")
    public List<Goods> getAllGoods(){
        return service.getAll();
    }
}
