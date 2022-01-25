package com.greenfox.di.usefulutilities.controllers;

import com.greenfox.di.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class UtilityController {

    private final UtilityService utilityService;

    @Autowired
    public UtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String homepage() {
        return "utility";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("useful/email")
    public String email(@RequestParam(value = "email") String email, Model model) {
        if (utilityService.validateEmail(email)) {
            model.addAttribute("email", email + " is a valid email address");
            model.addAttribute("color", "green");
        } else {
            model.addAttribute("email", email + " is not a valid email address");
            model.addAttribute("color", "red");
        }
        System.out.println(email);
        return "email";
    }

    @GetMapping("useful/encoder")
    public String encode(@RequestParam(value = "text") String text, @RequestParam(value = "number") int number, Model model) {
        model.addAttribute("text", utilityService.caesar(text, number));
        return "coder";
    }

    @GetMapping("useful/decoder")
    public String decode(@RequestParam(value = "text") String text, @RequestParam(value = "number") int number, Model model) {
        model.addAttribute("text", utilityService.caesar(text, number*-1));
        return "coder";
    }

}
