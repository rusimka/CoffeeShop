package com.example.coffeshop.service;

import com.example.coffeshop.model.CoffeeOrder;
import com.example.coffeshop.model.Ingredient;

public interface CoffeeOrderService {

    CoffeeOrder createCoffee(CoffeeOrder coffeeOrder, Ingredient ingredient);
}
