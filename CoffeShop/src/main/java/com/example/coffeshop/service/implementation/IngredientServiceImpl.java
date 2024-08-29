package com.example.coffeshop.service.implementation;

import com.example.coffeshop.model.Ingredient;
import com.example.coffeshop.repository.IngredientRepository;
import com.example.coffeshop.service.IngredientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return this.ingredientRepository.findAll();
    }
}
