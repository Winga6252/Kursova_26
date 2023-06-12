package com.example.kursova_26.controller.Ui;

import com.example.kursova_26.model.Goods;
import com.example.kursova_26.service.impls.GoodsServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register/goods")
@RequiredArgsConstructor
public class GoodsRegistrarController {

    @Autowired
    GoodsServiceImp service;


    @GetMapping
    public String showRegistrationForm() {              //вивід форми реєстрації
        return "registerNewGoods";
    }

    @PostMapping
    public String processRegistrationForm(Goods goods) {        //збереження товару

        service.saveGoods(goods);
        return "redirect:/ui/v1/goods/" + service.getIdActiveClient();
    }
}
