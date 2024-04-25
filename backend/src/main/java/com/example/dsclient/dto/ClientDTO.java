package com.example.dsclient.dto;

import com.example.dsclient.entities.Client;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO implements Serializable {

    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private Instant birth_Date;
    private Integer children;

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        this.birth_Date = entity.getBirth_Date();
        this.children = entity.getChildren();
    }
}
