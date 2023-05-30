package com.example.Entity;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class DataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String icon;

    @Column(unique = true, nullable = false)
    private String title;

    @Column(unique = true, nullable = false)
    private String description;

    @Column(unique = true, nullable = false)
    private String imagePath;

}
