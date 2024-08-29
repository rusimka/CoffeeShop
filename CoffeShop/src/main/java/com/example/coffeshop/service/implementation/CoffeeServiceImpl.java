package com.example.coffeshop.service.implementation;

import com.example.coffeshop.model.Coffee;
import com.example.coffeshop.service.CoffeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {

    private final ObjectMapper objectMapper;
    @Override
    public List<Coffee> getAllCoffees() throws IOException {
        ClassPathResource resource = new ClassPathResource("coffees.json");
        InputStream inputStream = resource.getInputStream();
        Coffee[] coffeesArray = objectMapper.readValue(inputStream, Coffee[].class);
        return Arrays.asList(coffeesArray);
    }
}
