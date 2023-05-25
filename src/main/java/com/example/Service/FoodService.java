package com.example.Service;


import com.example.Entity.FoodEntity;
import com.example.Repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;


    public List<FoodEntity> getAllFood() {
        return foodRepository.findAll();
    }
}
