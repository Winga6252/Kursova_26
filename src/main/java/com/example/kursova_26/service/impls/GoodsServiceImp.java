package com.example.kursova_26.service.impls;

import com.example.kursova_26.model.Client;
import com.example.kursova_26.model.Goods;
import com.example.kursova_26.repository.ClientRepository;
import com.example.kursova_26.repository.GoodsRepository;
import com.example.kursova_26.service.Interfaces.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class GoodsServiceImp implements IGoodsService {
    private int totalCost=0;
    private String IdActiveClient=null;
    private LocalDateTime now = LocalDateTime.now();
    private List<Goods> goods = new ArrayList<>(
            Arrays.asList(
                    new Goods("Book" , 200 , "unit" , 5 , "desk1")
            )
    );


    @Autowired
    GoodsRepository goodsRepository;
    @Autowired
    ClientRepository clientRepository;
   // @PostConstruct
    public void init(){
        goodsRepository.saveAll(goods);
    }


    @Override
    public void saveGoods(Goods goods){     //збереження товару
        goodsRepository.save(goods);
        }

    @Override
    public boolean addToTray(Goods goods , Client client) {     //додаю в "кошик"
        boolean response;                                       //змінна про присутність товару
        goods.setQuantityOfGoods(goods.getQuantityOfGoods()-1); //зміна кількості на складі
        totalCost = (int) (totalCost+goods.getCost());          //для виводу вартості

        if (goods.getQuantityOfGoods() > 0){                    //перевірка чи є товар
            goodsRepository.save(goods);
            response=true;
        }
        else {
            goodsRepository.deleteById(goods.getId());
            response=false;
        }
        if (totalCost >= 5000){                                 //система знижки
            client.setIsRegularCustomer(true);
            totalCost *= 1 - 0.02;
            clientRepository.save(client);

        }
        return response;
    }

    @Override
    public int getTotalCost() {                                 //вивід вартості
        return totalCost;
    }



    @Override
    public String getClient(Client client) {
        return client.getId();
    }

    @Override
    public String getIdGoods(Goods goods){
        return goods.getId();
    }

    @Override
    public double getCostGoods(Goods goods){
        return goods.getCost();
    }

    @Override
    public void saveIdActiveClient(Client client) {
        IdActiveClient=client.getId();
    }
    @Override
    public String getIdActiveClient() {
        return IdActiveClient;
    }


    @Override
    public List<Goods> getAll() {
        return goodsRepository.findAll();
    }
}