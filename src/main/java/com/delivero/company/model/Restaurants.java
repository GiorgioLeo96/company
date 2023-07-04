package com.delivero.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Restaurants {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id") 
    private User user;

    private String name;

    private String description;

    private String address;

    private String telNumber; 

    private String photo;

    public Restaurants(User user, String name, String description, String address, String telNumber, String photo) {
        this.user = user;
        this.name = name;
        this.description = description;
        this.address = address;
        this.telNumber = telNumber;
        this.photo = photo;
    }
}
