package com.example.kursova_26.service.Interfaces;

import com.example.kursova_26.model.Client;
import com.example.kursova_26.model.Goods;
import com.example.kursova_26.model.Sale;

import java.util.List;

public interface ISaleService {
    List<Sale> getAll();

    void deleteSale(Sale sale);

    Sale create(Sale sale, Client client, Goods goods);
}
