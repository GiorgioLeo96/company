package com.delivero.company.controller;


import java.util.HashMap;
import java.util.Map;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivero.company.model.LoginForm;
import com.delivero.company.model.User;
import com.delivero.company.repository.UserRepository;
import com.delivero.company.service.UserService;


import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/user")
@Slf4j
@CrossOrigin
public class UserController {

    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;
    

    

    

}
