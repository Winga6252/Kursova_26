package com.example.kursova_26.controller.Ui;

import com.example.kursova_26.model.Client;
import com.example.kursova_26.model.Goods;
import com.example.kursova_26.service.impls.GoodsServiceImp;
import com.example.kursova_26.service.impls.SaleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ui/v1/goods")
public class GoodsUiController {
    @Autowired
    GoodsServiceImp GoodsService;
    @Autowired
    SaleServiceImp SaleService;


    @RequestMapping("/{id}")
    public String getAllGoods(Model model , @PathVariable("id") Client client ){      //Всі товари
        GoodsService.saveIdActiveClient(client);
        model.addAttribute("goods" , GoodsService.getAll());
        model.addAttribute("client" , GoodsService.getIdActiveClient());
        model.addAttribute("totalCost" , GoodsService.getTotalCost());
        return "goods";
    }


   @GetMapping("/{ClientId}/save_{GoodsID}")                                //додавання в "кошик" замовлень
    public String addToTray(@PathVariable("GoodsID") Goods goods ,
                            @PathVariable("ClientId") Client client)
    {
        GoodsService.saveIdActiveClient(client);
        if (GoodsService.addToTray(goods, client)){                           //якщо товар є на складі
            return "redirect:/Bill_page/" + GoodsService.getClient(client) + "/" + GoodsService.getIdGoods(goods);
        }
        else {                                                               //якщо нема
            return "redirect:/ui/v1/goods/" + GoodsService.getClient(client);
        }
    }




}
