package com.example.Entity;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String imagePath;
    private String offerPrice;
    private String price;

    @ManyToOne
    @JoinColumn(name = "category") // Name of the foreign key column in the FoodEntity table
    private Category category;
}
