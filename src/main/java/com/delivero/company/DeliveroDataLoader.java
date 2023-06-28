package com.delivero.company;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.delivero.company.model.Category;
import com.delivero.company.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DeliveroDataLoader implements CommandLineRunner {
    
    @Autowired
    CategoryService categoryserv;

     @Override
    public void run(String... args) throws Exception {
        log.warn("Runner start");

        Category c1 = new Category("Cinese","./img/categories/cinese.png");
        Category c2 = new Category("Giapponese","./img/categories/giapponese.png");
        Category c3 = new Category("Hamburger","./img/categories/hamburger.png");
        Category c4 = new Category("Indiana","./img/categories/indiana.png");
        Category c5 = new Category("Messicana","./img/categories/messicana.png");
        Category c6 = new Category("Pizza","./img/categories/pizza.png");
        Category c7 = new Category("Poke","./img/categories/poke.png");
        Category c8 = new Category("Vegetariana","./img/categories/vegetariana.png");

        categoryserv.save(c1);
        categoryserv.save(c2);
        categoryserv.save(c3);
        categoryserv.save(c4);
        categoryserv.save(c5);
        categoryserv.save(c6);
        categoryserv.save(c7);
        categoryserv.save(c8);

        System.out.println("cis ono");
    }
    

}
