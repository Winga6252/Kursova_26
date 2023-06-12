package com.example.kursova_26.repository;

import com.example.kursova_26.model.Goods;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository extends MongoRepository<Goods,String> {
}
