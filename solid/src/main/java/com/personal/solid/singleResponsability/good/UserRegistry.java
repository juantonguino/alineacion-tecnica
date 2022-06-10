package com.personal.solid.singleResponsability.good;

import com.personal.solid.singleResponsability.UserRepository;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserRegistry {

    private UserRepository userRepository;

    private Encrypt encrypt;


    public UserRegistry(){
        userRepository= new UserRepository();
        encrypt= new Encrypt();
    }

    public void saveUser(String name, String password){
        String newPass=encrypt.encriptString(password);
        userRepository.createUser(name, newPass);
    }
}
