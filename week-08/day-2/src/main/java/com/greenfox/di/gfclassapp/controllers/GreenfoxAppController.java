package com.greenfox.di.gfclassapp.controllers;

import com.greenfox.di.gfclassapp.services.StudentFileService;
import com.greenfox.di.gfclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class GreenfoxAppController {
    private final StudentFileService studentService;

    @Autowired
    public GreenfoxAppController(StudentFileService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("gfa")
    public String index(Model model) {
        model.addAttribute("count", "Current student count: " + studentService.count());
        return "gfa";
    }

    @GetMapping("gfa/list")
    public String list(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "list";
    }

    @GetMapping("gfa/add")
    public String add() {
        return "add";
    }

    @PostMapping("gfa/save")
    public String save(@RequestParam(name = "name") String name) {
        studentService.save(name);
        return "add";
    }

    @GetMapping("gfa/check")
    public String check() {
        return "check";
    }


    @PostMapping("gfa/check")
    public String check(@RequestParam(name = "name") String name, Model model) {
        if (studentService.check(name)) {
            model.addAttribute("check", "Student is in our list!");
        } else {
            model.addAttribute("check", "Student is not in our list!");
        }
        return "check";
    }
}
