package com.love.study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/get-love")
    public String getLove(@RequestParam(name = "anyName") String name){
        return "Love "+ name;
    }

}