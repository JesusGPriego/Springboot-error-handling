package com.suleware.springboot.error.springboot_error;

import java.util.List;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.suleware.springboot.error.springboot_error.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    public List<User> usersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Sule", "ware", 1L));
        users.add(new User("Pepe", "Jeans", 2L));
        users.add(new User("Louis", "Vuiton", 3L));
        return users;
    }

}
