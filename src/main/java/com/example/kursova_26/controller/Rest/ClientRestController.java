package com.example.kursova_26.controller.Rest;

import com.example.kursova_26.model.Client;
import com.example.kursova_26.service.impls.ClientServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
public class ClientRestController {

    @Autowired
    ClientServiceImp service;

    @GetMapping("/")
    public List<Client> getAllClient(){
        return service.getAll();
    }


}


