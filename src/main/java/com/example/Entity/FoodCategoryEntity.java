package com.example.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class FoodCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

}
