package com.ksy.backend.account.service;

import com.ksy.backend.account.model.User;
import com.ksy.backend.account.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listUsers() {
        return userRepository.findAll();
    }

}
