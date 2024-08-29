package com.example.coffeshop.controller;

import com.example.coffeshop.model.Coffee;
import com.example.coffeshop.model.CoffeeOrder;
import com.example.coffeshop.model.Ingredient;
import com.example.coffeshop.service.CoffeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/coffee")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:3000")
public class CoffeeController {

    private final CoffeeService coffeeService;

    @GetMapping("/list")
    public List<Coffee> getAllCoffees() throws IOException {
        return this.coffeeService.getAllCoffees();
    }


}
