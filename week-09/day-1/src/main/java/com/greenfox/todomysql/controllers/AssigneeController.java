package com.greenfox.todomysql.controllers;

import com.greenfox.todomysql.models.Assignee;
import com.greenfox.todomysql.models.Todo;
import com.greenfox.todomysql.repositories.AssigneeRepository;
import com.greenfox.todomysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {
    TodoRepository todoRepository;
    AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    @GetMapping({"/", "/list"})
    public String view(Model model) {
        model.addAttribute("assigneeList", assigneeRepository.findAll());
        return "assignee/assigneeList";
    }

    @GetMapping({"/{id}"})
    public String showTodos(@PathVariable(required = false) long id, Model model) {
            model.addAttribute("todos", assigneeRepository.getById(id).getTodo());
        return "assignee/todos";
    }

    @GetMapping("/add")
    public String addView(Model model) {
        model.addAttribute("assignee", new Assignee());
        return "assignee/add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Assignee assignee, Model model) {
        model.addAttribute("assignee", assignee);
        assigneeRepository.save(assignee);
        return "redirect:/assignee/list";
    }

    @DeleteMapping("/{id}/delete")
    public String delete(@PathVariable long id) {
        assigneeRepository.deleteById(id);
        return "redirect:/assignee/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("assignee", assigneeRepository.getById(id));
        model.addAttribute("name", assigneeRepository.getById(id).getName());
        model.addAttribute("email", assigneeRepository.getById(id).getEmail());
        return "assignee/edit";
    }

    @PostMapping("/{id}/edit")
    public String editForm(@ModelAttribute Assignee assignee, Model model) {
        model.addAttribute("assignee", assignee);
        assigneeRepository.save(assignee);
        return "redirect:/assignee/";
    }
}
