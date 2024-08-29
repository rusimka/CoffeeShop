package com.example.coffeshop.service.implementation;

import com.example.coffeshop.model.CoffeeOrder;
import com.example.coffeshop.model.Ingredient;
import com.example.coffeshop.repository.CoffeeOrderRepository;
import com.example.coffeshop.service.CoffeeOrderService;
import org.springframework.stereotype.Service;

@Service
public class CoffeeOrderServiceImpl implements CoffeeOrderService {

    private final CoffeeOrderRepository coffeeOrderRepository;

    public CoffeeOrderServiceImpl(CoffeeOrderRepository coffeeOrderRepository) {
        this.coffeeOrderRepository = coffeeOrderRepository;
    }

    @Override
    public CoffeeOrder createCoffee(CoffeeOrder coffeeOrder, Ingredient ingredient) {
        CoffeeOrder coffeeOrder1 = new CoffeeOrder();
        coffeeOrder1.setOrderedCoffeeName(coffeeOrder1.getOrderedCoffeeName());
        coffeeOrder1.getIngredients().add(ingredient);
        this.coffeeOrderRepository.save(coffeeOrder);
        return coffeeOrder;

    }
}
