package com.example.demo.service;

import com.example.demo.model.User;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    List<User> users;

    public String getUsersAsCommaSeparatedString() {
        return users.stream().map(user -> user.getId() + "," + user.getAge() + "," + user.getName()).collect(Collectors.joining(";"));
    }

    public String getUserAsJsonString() {
        return new Gson().toJson(users);
    }

}
