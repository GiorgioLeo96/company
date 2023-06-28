package com.delivero.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivero.company.model.User;
import com.delivero.company.repository.UserRepository;

@Service
public class UserService {
    

    @Autowired
    private UserRepository userRepository;

 

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findByID(Long id) {
        Optional<User> userOpt = userRepository.findById(id);

        if (userOpt.isPresent())
            return userOpt.get();

        return null;
    }

    public void deleteByID(Long id) {
        userRepository.deleteById(id);
    }

    
    public User update(Long id, User newUser) {
        User oldUser = findByID(id);

        if (oldUser == null)
            return null;

        oldUser.setCognome(newUser.getCognome());
        oldUser.setEmail(newUser.getEmail());
        oldUser.setNome(newUser.getNome());
        oldUser.setPIva(newUser.getPIva());
        oldUser.setPassword(newUser.getPassword());
        

        return userRepository.save(oldUser);
    }

}
