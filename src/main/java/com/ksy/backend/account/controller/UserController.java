package com.ksy.backend.account.controller;

import com.ksy.backend.account.dto.UserResponseDTO;
import com.ksy.backend.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<UserResponseDTO> listUsers() {
        return userService.listUsers().stream()
                .map(user -> new UserResponseDTO(user.getId(), user.getLoginType()))
                .toList();
    }

}
