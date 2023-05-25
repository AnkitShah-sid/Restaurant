package com.example.Repository;

import com.example.Entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface FoodRepository extends JpaRepository<FoodEntity,Long> {
}
