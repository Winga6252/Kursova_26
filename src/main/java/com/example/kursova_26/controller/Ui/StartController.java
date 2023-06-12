package com.example.kursova_26.controller.Ui;

import com.example.kursova_26.service.impls.ClientServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class StartController {
    @Autowired
    ClientServiceImp service;

    @GetMapping()               //стартова сторінки з користувачами
    public String getAllGoods(Model model){
        model.addAttribute("client" , service.getAll());
        return "users";
    }
}
