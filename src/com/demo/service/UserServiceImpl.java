package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String say(String value) {
        System.out.println("hahha");
        return value;
    }
}
