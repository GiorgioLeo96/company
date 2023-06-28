package com.delivero.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivero.company.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
