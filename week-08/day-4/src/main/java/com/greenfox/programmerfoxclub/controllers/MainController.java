package com.greenfox.programmerfoxclub.controllers;

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

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
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


}
