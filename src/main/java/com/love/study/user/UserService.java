package com.love.study.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    //static HashMap<String, Integer> userObjects = new HashMap<>();

    private final static List<User> USER_LIST = new ArrayList<>();

    public void registerUser(User user){
        USER_LIST.add(user);
        //userType.setName();
        //userType.setAge();
        //registerNewUser();
        //userObjects.put(user.)
    }

    //static {
    //    userObjects.put();

}
