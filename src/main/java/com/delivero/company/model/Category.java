package com.delivero.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private Restaurants restaurants;

    public Category(String name, String img, Restaurants restaurants) {
        this.name = name;
        this.img = img;
        this.restaurants = restaurants;
    }

}
