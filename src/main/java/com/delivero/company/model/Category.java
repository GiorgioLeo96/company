package com.delivero.company.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Category {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String img;

    @ManyToMany
    @JoinTable(name = "restaurant_category") 
    private List<Restaurants> restaurants;

    public Category(String name, String img, List<Restaurants> restaurants) {
        this.name = name;
        this.img = img;
        this.restaurants = restaurants;
    }

}

