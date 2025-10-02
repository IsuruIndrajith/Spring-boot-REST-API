package com.example.demo.model;

//to create entity/table in the data base

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {
//        the variables in the DTO should be included here.
    @Id
    private int id;
    private String name;
}
