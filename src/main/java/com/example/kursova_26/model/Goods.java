package com.example.kursova_26.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Goods {
    @Id
    private  String id;
    private String name;
    private double cost;
    private String  unit;
    private int quantityOfGoods;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public Goods(String name, double cost, String unit, int quantityOfGoods, String description) {
        this.name = name;
        this.cost = cost;
        this.unit = unit;
        this.quantityOfGoods = quantityOfGoods;
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(getId(), goods.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
