package com.napster.controllers;

import com.napster.models.User;
import com.napster.sirvices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class FormController {
    @Autowired
    UserService userService;

    @GetMapping("/add")
    public String addName_Get(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/add")
    public String addUser_Post(Model model, @ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/users/all";
    }

    @GetMapping("/all")
    private String showAll(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "showAllUsers";
    }
}
