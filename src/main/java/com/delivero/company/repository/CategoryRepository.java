package com.delivero.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivero.company.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
