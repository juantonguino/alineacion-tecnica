package com.personal.solid.singleResponsability.good;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encrypt {

    public String encriptString(String param){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(param);
    }
}
