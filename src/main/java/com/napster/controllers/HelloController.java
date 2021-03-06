package com.napster.controllers;

import com.napster.sirvices.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @Autowired private HelloService helloService;

    @GetMapping({"/hello", ""})
    public String hello(Model model) {
        model.addAttribute("names", helloService.getNames());
        return "index";
    }

}
