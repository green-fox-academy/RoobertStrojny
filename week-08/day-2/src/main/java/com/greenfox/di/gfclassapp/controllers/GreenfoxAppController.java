package com.greenfox.di.gfclassapp.controllers;

import com.greenfox.di.gfclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class GreenfoxAppController {
    private StudentService studentService;

    @Autowired
    public GreenfoxAppController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("gfa")
    public String index() {
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
}
