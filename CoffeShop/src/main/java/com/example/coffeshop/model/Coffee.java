package com.example.coffeshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {

    private String coffeeName;
    private String coffeeDescription;
    private Map<String,String> coffeeIngredients;



}
