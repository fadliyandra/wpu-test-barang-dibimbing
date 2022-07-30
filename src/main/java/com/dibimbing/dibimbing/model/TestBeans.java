package com.dibimbing.dibimbing.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class TestBeans {

    @Bean  //object
    public String appSaya(){
        return "aplikasi pertama saya berhasil, hello my world";
    }
}
