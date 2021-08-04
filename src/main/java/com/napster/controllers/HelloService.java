package com.napster.controllers;

import org.springframework.stereotype.Component;
@Component
public class HelloService {
    public String name() {
        return "Mr Napster";
    }
}
