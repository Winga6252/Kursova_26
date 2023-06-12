package com.example.kursova_26.controller.Ui;

import com.example.kursova_26.model.Client;
import com.example.kursova_26.service.impls.ClientServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
@RequiredArgsConstructor
public class UserRegistratorController {

    @Autowired
    ClientServiceImp service;


    @GetMapping
    public String showRegistrationForm() {      //форма реєстрації
        return "registration-form";
    }

    @PostMapping("/client")         //збереження клієнта
    public String processRegistrationForm(Client client) {

        service.saveClient(client);
        return "redirect:/users";
    }
}
