package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.User;
import com.greenfox.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String registerView(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginView(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam(name = "user") String username,
                        @RequestParam(name = "password") String password, RedirectAttributes redirectAttributes) {
        if (userService.validateUser(username, password)) {
            redirectAttributes.addFlashAttribute("user", userService.getUserByUsername(username));
            return "redirect:/";
        }
        return "login";
    }
}
