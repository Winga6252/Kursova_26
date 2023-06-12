package com.example.kursova_26.repository;

import com.example.kursova_26.model.Sale;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends MongoRepository<Sale,String> {

}
