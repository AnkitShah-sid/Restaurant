package com.example.Controller;


import com.example.Entity.FoodEntity;
import com.example.Repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodRepository foodEntityRepository;

    @GetMapping
    public List<FoodEntity> getAllFoodEntities() {
        return foodEntityRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodEntity> getFoodEntityById(@PathVariable Long id) {
        Optional<FoodEntity> foodEntity = foodEntityRepository.findById(id);
        if (foodEntity.isPresent()) {
            return ResponseEntity.ok(foodEntity.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public FoodEntity createFoodEntity(@RequestBody FoodEntity foodEntity) {
        return foodEntityRepository.save(foodEntity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FoodEntity> updateFoodEntity(@PathVariable Long id, @RequestBody FoodEntity newFoodEntity) {
        Optional<FoodEntity> existingFoodEntity = foodEntityRepository.findById(id);
        if (existingFoodEntity.isPresent()) {
            FoodEntity updatedFoodEntity = existingFoodEntity.get();
            updatedFoodEntity.setTitle(newFoodEntity.getTitle());
            updatedFoodEntity.setDescription(newFoodEntity.getDescription());
            // Update other properties as needed
            return ResponseEntity.ok(foodEntityRepository.save(updatedFoodEntity));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFoodEntity(@PathVariable Long id) {
        Optional<FoodEntity> foodEntity = foodEntityRepository.findById(id);
        if (foodEntity.isPresent()) {
            foodEntityRepository.delete(foodEntity.get());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}