package com.example.coffeshop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.aspectj.apache.bcel.generic.Tag;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "coffee_orders")
@Data
public class CoffeeOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @Column(name = "ordered_coffee_name")
    private String orderedCoffeeName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "orders_ingredients",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private List<Ingredient> ingredients = new ArrayList<>();


}
