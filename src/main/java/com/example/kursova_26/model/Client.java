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
public class Client {
    @Id
    private String id;
    private String lastName;
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String eMail;
    private boolean IsRegularCustomer;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public Client(String lastName, String name, String surname, String address, String phone, String eMail, boolean isRegularCustomer, String description) {
        this.lastName = lastName;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.eMail = eMail;
        IsRegularCustomer = isRegularCustomer;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(getId(), client.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
