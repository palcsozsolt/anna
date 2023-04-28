package com.love.study.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity registerNewUser(@RequestBody User user){
        //User user = new User();
        //user.setName(name);
        //user.setAge(age);
        userService.registerUser(user);
        return ResponseEntity.created(null).build();
    }
}
