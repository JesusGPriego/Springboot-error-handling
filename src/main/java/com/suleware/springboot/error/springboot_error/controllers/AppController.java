package com.suleware.springboot.error.springboot_error.controllers;

import java.util.List;
import java.util.Optional;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suleware.springboot.error.springboot_error.models.domain.User;
import com.suleware.springboot.error.springboot_error.services.UserService;

@RestController
@RequestMapping("/api")
public class AppController {

    private UserService userService;

    public AppController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/main")
    public String index() {
        return "ok 200";
    }

    @GetMapping("/users")
    public List<User> list() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> findUser(@PathVariable Long id) {
        Optional<User> oUser = userService.findById(id);
        if (oUser.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK.value()).body(oUser.orElseThrow());
    }

}
