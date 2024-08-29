package com.example.coffeshop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.coffeshop.model.Ingredient;
import com.example.coffeshop.repository.IngredientRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public void run(String... args) throws Exception {
        // Populate the database with predefined ingredients
        Ingredient ingredient1 = new Ingredient();
        ingredient1.setIngredientName("Sugar");
        ingredient1.setIngredientAmount("2 teaspoons");
        ingredientRepository.save(ingredient1);

        Ingredient ingredient2 = new Ingredient();
        ingredient2.setIngredientName("Milk");
        ingredient2.setIngredientAmount("1 cup");
        ingredientRepository.save(ingredient2);

        Ingredient ingredient3 = new Ingredient();
        ingredient3.setIngredientName("Caramel flavour");
        ingredient3.setIngredientAmount("1 cup");
        ingredientRepository.save(ingredient3);

        Ingredient ingredient4 = new Ingredient();
        ingredient4.setIngredientName("Almond flavour");
        ingredient4.setIngredientAmount("1 cup");
        ingredientRepository.save(ingredient4);

        Ingredient ingredient5 = new Ingredient();
        ingredient5.setIngredientName("Water");
        ingredient5.setIngredientAmount("40ml");
        ingredientRepository.save(ingredient5);

        Ingredient ingredient6 = new Ingredient();
        ingredient6.setIngredientName("Coffee espresso brazilian");
        ingredient6.setIngredientAmount("20ml");
        ingredientRepository.save(ingredient5);

        // Add more ingredients as needed
    }
}
