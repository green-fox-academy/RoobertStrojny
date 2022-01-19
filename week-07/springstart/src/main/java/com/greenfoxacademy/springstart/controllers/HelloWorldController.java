package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "web/hello", method = RequestMethod.GET)
    public ModelAndView HelloWorld(Model model, @RequestParam(name = "size") String size, @RequestParam(name = "color") String color) {
        Hello hello = new Hello(size, color);
        ModelAndView modelAndView = new ModelAndView();

        model.addAttribute("size", Integer.parseInt(size));
        model.addAttribute("color", color);
        model.addAttribute("content", hello.getContent());
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
