package com.delivero.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Restaurants {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private User user;

    private String name;

    private String description;

    private String address;

    private Long telNumber;

    private String photo;

    public Restaurants(User user, String name, String description, String address, Long telNumber, String photo) {
        this.user = user;
        this.name = name;
        this.description = description;
        this.address = address;
        this.telNumber = telNumber;
        this.photo = photo;
    }


    


}
