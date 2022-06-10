package com.personal.solid.singleResponsability.bad;

import com.personal.solid.singleResponsability.UserRepository;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserRegistry {

    private UserRepository userRepository;

    public UserRegistry(){
        userRepository= new UserRepository();
    }
    public void saveUser(String name, String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String newPass=encoder.encode(password);
        userRepository.createUser(name, newPass);
    }
}
