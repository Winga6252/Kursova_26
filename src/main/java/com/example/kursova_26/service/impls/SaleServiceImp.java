package com.example.kursova_26.service.impls;

import com.example.kursova_26.model.Client;
import com.example.kursova_26.model.Goods;
import com.example.kursova_26.model.Sale;
import com.example.kursova_26.repository.ClientRepository;
import com.example.kursova_26.repository.GoodsRepository;
import com.example.kursova_26.repository.SaleRepository;
import com.example.kursova_26.service.Interfaces.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SaleServiceImp implements ISaleService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Sale> sales = new ArrayList<>(
            Arrays.asList(
                    new Sale(1,"desk1")
            )
    );

    @Autowired
    SaleRepository saleRepository;

    @Autowired
    GoodsRepository goodsRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    GoodsServiceImp GoodsService;

  // @PostConstruct
    public void init(){
        saleRepository.saveAll(sales);
    }

    @Override
    public List<Sale> getAll() {

        return saleRepository.findAll();
    }

    @Override
    public void deleteSale(Sale sale){
        saleRepository.deleteById(sale.getId());
    }


    @Override
    public Sale create(Sale sale, Client client, Goods goods){      //створення замовлення
        sale.setClientId(client);                                   //збереження даних клієнта

        if (client.isIsRegularCustomer()){                          //перевірка на знижку
            sale.setPrice(goods.getCost() * (1 - 2/100.0));
        }
        else {
            sale.setPrice(goods.getCost());
        }
        sale.setGoodsId(goods);                                     //збереження товару
        sale.setDateOfSale(LocalDateTime.now());                    //Дата замовлення : сьогодні
        sale.setDateOfDelivery(LocalDateTime.now().plusDays(3));    //Дата доставлення : через 3 дні
       return saleRepository.save(sale);
    }
}
