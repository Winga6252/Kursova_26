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
public class Sale {
    @Id
    private  String id;
    private  Goods goodsId;
    private  Client clientId;
    private LocalDateTime dateOfSale;
    private LocalDateTime dateOfDelivery;
    private double Number;
    private double price;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public Sale( Integer number, String description) {
        Number = number;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(getId(), sale.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
