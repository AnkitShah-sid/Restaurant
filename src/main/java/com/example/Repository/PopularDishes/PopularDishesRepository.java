package com.example.Repository.PopularDishes;


import com.example.Entity.PopularDishes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface PopularDishesRepository extends JpaRepository<PopularDishes, Long> {
}
