package com.example.coffeshop.controller;

import com.example.coffeshop.model.CoffeeOrder;
import com.example.coffeshop.model.Ingredient;
import com.example.coffeshop.service.CoffeeOrderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
@CrossOrigin("http://localhost:3000/*")
public class CoffeeOrderController {

    private final CoffeeOrderService coffeeOrderService;

    public CoffeeOrderController(CoffeeOrderService coffeeOrderService) {
        this.coffeeOrderService = coffeeOrderService;
    }

    @PostMapping
    public CoffeeOrder createCoffeeOrder(@RequestBody CoffeeOrder coffeeOrder, @RequestBody Ingredient ingredient) {
        return this.coffeeOrderService.createCoffee(coffeeOrder,ingredient);
    }
}
