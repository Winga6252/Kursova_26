package com.example.kursova_26.service.Interfaces;

import com.example.kursova_26.model.Client;
import com.example.kursova_26.model.Goods;

import java.util.List;

public interface IGoodsService {


    void saveGoods(Goods goods);

    boolean addToTray(Goods goods, Client client);

    int getTotalCost();

    String getClient(Client client);

    String getIdGoods(Goods goods);

    double getCostGoods(Goods goods);

    void saveIdActiveClient(Client client);

    String getIdActiveClient();

    List<Goods> getAll();
}
