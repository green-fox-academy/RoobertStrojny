package com.greenfox.programmerfoxclub.controllers;

import com.greenfox.programmerfoxclub.models.Fox;
import com.greenfox.programmerfoxclub.models.User;
import com.greenfox.programmerfoxclub.repositories.FoxRepository;
import com.greenfox.programmerfoxclub.repositories.UserRepository;
import com.greenfox.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MainController {

    FoxService foxService;
    UserRepository userRepository;
    FoxRepository foxRepository;

    @Autowired
    public MainController(FoxService foxService, UserRepository userRepository, FoxRepository foxRepository) {
        this.foxService = foxService;
        this.userRepository = userRepository;
        this.foxRepository = foxRepository;
    }

    @GetMapping("/")
    public String index(@RequestParam(name = "name", required = false) String name, RedirectAttributes redirectAttributes, Model model) {
        redirectAttributes.addAttribute("name", name);
        if (name == null) {
            return "redirect:/login";
        }
        if (!foxService.isFoxPresent(name)) {
            return "redirect:/login";
        }
        model.addAttribute("fox", foxService.getFoxFromList(name));
        return "index";
    }


    @GetMapping("/login")
    public String getLogin(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }


    @PostMapping("/login")
    public String postLogin(@RequestParam(name = "name") String name, Model model, RedirectAttributes redirectAttributes) {
        if (foxService.isFoxPresent(name)) {
            redirectAttributes.addAttribute("name", name);
            model.addAttribute("name", name);
            return "redirect:/";
        }
        foxService.addFox(name);
        redirectAttributes.addAttribute("name", name);
        model.addAttribute("name", name);
        return "redirect:/";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("wrongRetype", false);
        return "register";
    }

    @PostMapping("/register")
    public String registerForm(@ModelAttribute User user, Model model,RedirectAttributes redirectAttributes) {

        if (user.getPassword().matches(user.getRetypePassword())) {
            userRepository.save(user);
            user.setFox(new Fox(user.getName()));
            foxRepository.save(foxService.getFoxFromList(user.getName()));
            foxService.addFox(user.getName());
            redirectAttributes.addAttribute("name", user.getName());
            return "redirect:/";
        }
        model.addAttribute("wrongRetype", true);
        return "register";
    }


}
