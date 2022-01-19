package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWebController {

    Greeting greeting = new Greeting();

    @RequestMapping(path = "/web/greeting", method = RequestMethod.GET)
    public String index(@RequestParam(name = "name") String content, Model model) {
        greeting.setContent(content);
        greeting.count();
        model.addAttribute("name", content);
        model.addAttribute("count", greeting.getGreetCount());
        return "greeting";
    }




}
