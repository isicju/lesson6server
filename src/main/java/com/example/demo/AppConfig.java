package com.example.demo;

import com.example.demo.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("James",12,31));
        users.add(new User("Peter",13,32));
        users.add(new User("John",14,23));
        users.add(new User("Mary",15,35));
        return users;
    }

}
