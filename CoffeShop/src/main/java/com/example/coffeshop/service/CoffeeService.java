package com.example.coffeshop.service;

import com.example.coffeshop.model.Coffee;

import java.io.IOException;
import java.util.List;

public interface CoffeeService {

    List<Coffee> getAllCoffees() throws IOException;
}
