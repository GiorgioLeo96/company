package com.delivero.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivero.company.model.Restaurants;

public interface RestaurantsRepository extends JpaRepository<Restaurants,Long>{
    
}
