package com.greenfox.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String index(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam(name = "name") String name, RedirectAttributes redirectAttributes, Model model) {
        model.addAttribute("name", name);
        redirectAttributes.addAttribute("name", name);
        return "redirect:/";
    }
}
