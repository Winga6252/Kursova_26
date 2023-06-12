package com.example.kursova_26.controller.Ui;

import com.example.kursova_26.model.Client;
import com.example.kursova_26.model.Goods;
import com.example.kursova_26.model.Sale;
import com.example.kursova_26.service.impls.ClientServiceImp;
import com.example.kursova_26.service.impls.GoodsServiceImp;
import com.example.kursova_26.service.impls.SaleServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Bill_page")
@RequiredArgsConstructor
public class BillPageUi {
    @Autowired
    SaleServiceImp SaleService;
    @Autowired
    ClientServiceImp ClientService;
    @Autowired
    GoodsServiceImp GoodsService;

    @RequestMapping ("/{clientId}/{GoodsID}")           //Викликається для створення нового замовлення
    public String addSale(@PathVariable("GoodsID") Goods goods ,
                              @PathVariable("clientId") Client client ,
                              Sale sale)
    {
        SaleService.create(sale,client,goods);
        return "redirect:/ui/v1/goods/" + GoodsService.getClient(client);

    }

    @GetMapping("/tray")                               //Вивід всіх замовлень
    public  String getAllSale(Model model){
       model.addAttribute("sale" , SaleService.getAll());
        return "BillPage";
    }

    @GetMapping("/tray/{id}")                          //Видалення замовлення
    public String deleteSale(@PathVariable("id")Sale sale){
        SaleService.deleteSale(sale);
        return "redirect:/Bill_page/tray";
    }

}
