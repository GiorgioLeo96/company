package com.delivero.company.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivero.company.model.Category;
import com.delivero.company.repository.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

 

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public Category findByID(Long id) {
        Optional<Category> catOpt = categoryRepository.findById(id);

        if (catOpt.isPresent())
            return catOpt.get();

        return null;
    }

    public void deleteByID(Long id) {
        categoryRepository.deleteById(id);
    }

    
    public Category update(Long id, Category newCat) {
        Category oldCat = findByID(id);

        if (oldCat == null)
            return null;

        oldCat.setImg(newCat.getImg());
        oldCat.setName(newCat.getName());
    

        return categoryRepository.save(oldCat);
    }


}
