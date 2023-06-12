package com.example.kursova_26.service.Interfaces;

import com.example.kursova_26.model.Client;

import java.util.List;

public interface IClientSerive {


    void saveClient(Client client);

    List<Client> getAll();
}
