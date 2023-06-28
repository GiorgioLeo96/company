package com.delivero.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivero.company.model.Restaurants;
import com.delivero.company.repository.RestaurantsRepository;


@Service
public class RestaurantService {
    
    @Autowired
    private RestaurantsRepository restaurantsRepository;

 

    public List<Restaurants> findAll() {
        return restaurantsRepository.findAll();
    }

    public Restaurants save(Restaurants restaurants) {
        return restaurantsRepository.save(restaurants);
    }

    public Restaurants findByID(Long id) {
        Optional<Restaurants> resOpt = restaurantsRepository.findById(id);

        if (resOpt.isPresent())
            return resOpt.get();

        return null;
    }

    public void deleteByID(Long id) {
        restaurantsRepository.deleteById(id);
    }

    
    public Restaurants update(Long id, Restaurants newRes) {
        Restaurants oldRes = findByID(id);

        if (oldRes == null)
            return null;

        oldRes.setAddress(newRes.getAddress());
        oldRes.setDescription(newRes.getDescription());
        oldRes.setName(newRes.getName());
        oldRes.setPhoto(newRes.getPhoto());
        oldRes.setTelNumber(newRes.getTelNumber());
        oldRes.setUser(newRes.getUser());

        return restaurantsRepository.save(oldRes);
    }


}



