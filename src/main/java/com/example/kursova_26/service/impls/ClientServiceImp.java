package com.example.kursova_26.service.impls;

import com.example.kursova_26.model.Client;
import com.example.kursova_26.repository.ClientRepository;
import com.example.kursova_26.service.Interfaces.IClientSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ClientServiceImp implements IClientSerive {

    private LocalDateTime now = LocalDateTime.now();
    private List<Client> clients = new ArrayList<>(
            Arrays.asList(
                    new Client("Klapiichuck" , "Dmytro","Anat"
                            ,"St.Storoj","+38066","123@gmail.com"
                            ,false,"desk1")
            )
    );

    @Autowired
    ClientRepository repository;
    //@PostConstruct
    public void init(){
        repository.saveAll(clients);
    }

    @Override
    public void saveClient(Client client){          //функція збереження
        repository.save(client);
    }

    @Override
    public List<Client> getAll() {
        return repository.findAll();
    }      //вивід всіх

}
