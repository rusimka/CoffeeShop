package com.example.coffeshop.repository;


import com.example.coffeshop.model.CoffeeOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeOrderRepository extends JpaRepository<CoffeeOrder,Long> {
}
