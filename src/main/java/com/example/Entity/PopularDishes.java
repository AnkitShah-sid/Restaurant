package com.example.Entity;

import com.example.Entity.FoodEntity;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class PopularDishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "food_id") // Name of the foreign key column in the FoodEntity table
    private FoodEntity food;
}
