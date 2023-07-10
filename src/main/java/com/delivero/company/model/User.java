package com.delivero.company.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "restaurant")
    List<Restaurants> restaurants;
    
    private String nome;

    private String cognome;

    private String pIva;

    @Column(unique = true)
    private String email;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Restaurants> restaurant;

    public User(String nome, String cognome, String pIva, String email, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.pIva = pIva;
        this.email = email;
        this.password = password;
    }
}
