package com.delivero.company.service;

import java.util.List;
import java.util.Optional;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.delivero.company.JwtTokenProvider;
import com.delivero.company.model.User;
import com.delivero.company.repository.UserRepository;

import jakarta.persistence.criteria.CriteriaBuilder.In;

@Service
public class UserService {
    

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
 

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

   

    public User register(User user) {
        // Verifica se l'email esiste già nel database
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("Email already exists");
        }

        // Effettua la validazione dei dati dell'utente, ad esempio controllando la presenza di campi obbligatori

        // Effettua l'hashing della password prima di salvarla nel database
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);

        // Salva l'utente nel database utilizzando il metodo save() del repository
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        // Implementa la logica per recuperare un utente dal database utilizzando il metodo findByEmail() del repository
        return userRepository.findByEmail(email);
    }
}










