package com.delivero.company;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.delivero.company.model.Category;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DeliveroDataLoader implements CommandLineRunner {
    
    @Autowired
    Category category;

     @Override
    public void run(String... args) throws Exception {
        log.warn("Runner start");
    }
    

}
