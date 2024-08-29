package com.example.coffeshop.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ingredients")
@Data
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ingredientId;

    @Column(name = "ingridient_name")
    private String ingredientName;

    @Column(name = "ingredient_amount")
    private String ingredientAmount;

    @ManyToMany(mappedBy = "ingredients")
    private List<CoffeeOrder> coffeeOrders = new ArrayList<>();


}
