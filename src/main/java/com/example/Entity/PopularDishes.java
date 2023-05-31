package com.example.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class PopularDishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "food_id")
    private FoodEntity food;
}
