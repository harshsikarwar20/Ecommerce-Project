package com.Harsh.EcommerceApplication.Controller;

import com.Harsh.EcommerceApplication.Model.User;
import com.Harsh.EcommerceApplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {

    @Autowired
    UserService userService;

    //Create User
    @PostMapping(value = "/user")
    public String createUser(@RequestBody List<User> user){
        return userService.createUser(user);
    }

    @GetMapping("/user")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
