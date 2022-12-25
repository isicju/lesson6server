package com.example.demo.controller;

import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class UserController {

    UserService userService;

    @GetMapping("/users")
    public String getUsersAsJson(@RequestParam(required = false) String format){
        if("csv".equals(format)){
            return userService.getUsersAsCommaSeparatedString();
        }
        return userService.getUserAsJsonString();
    }

}
