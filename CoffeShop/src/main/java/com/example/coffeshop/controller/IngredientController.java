package com.example.coffeshop.controller;


import com.example.coffeshop.model.Ingredient;
import com.example.coffeshop.service.IngredientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/ingredients")
@CrossOrigin("http://localhost:3000/*")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public List<Ingredient> getAllIngredients() {
        return this.ingredientService.getAllIngredients();
    }


}
