package com.greenfox.todomysql.controllers;

import com.greenfox.todomysql.models.Assignee;
import com.greenfox.todomysql.models.Todo;
import com.greenfox.todomysql.repositories.AssigneeRepository;
import com.greenfox.todomysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class TodoController {
    TodoRepository todoRepository;
    AssigneeRepository assigneeRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    @GetMapping({"/", "/list"})
    public String view(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
        if (isActive) {
            model.addAttribute("todoList", todoRepository.findAllByDoneFalse());
        } else {
            model.addAttribute("todoList", todoRepository.findAll());
        }
        return "todo/todolist";
    }

    @GetMapping("/add")
    public String addView(Model model) {
        model.addAttribute("todo", new Todo());
        return "todo/add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Todo todo, Model model) {
        model.addAttribute("todo", todo);
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @DeleteMapping("/{id}/delete")
    public String delete(@PathVariable long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("todo", todoRepository.getById(id));
        model.addAttribute("action", todoRepository.getById(id).getTitle());
        model.addAttribute("done", todoRepository.getById(id).isDone());
        model.addAttribute("urgent", todoRepository.getById(id).isUrgent());
        model.addAttribute("assignees", assigneeRepository.findAll());

        return "todo/edit";
    }

    @PostMapping("/{id}/edit")
    public String editForm(@PathVariable long id, @ModelAttribute Todo todo, @RequestParam Long assignee
            , Model model) {
        model.addAttribute("todo", todo);
        model.addAttribute("assignee", assignee);
        todo.setAssignee(assigneeRepository.getById(assignee));
        assigneeRepository.getById(assignee).addTodo(todo);
        todoRepository.save(todo);
        return "redirect:/todo/";
    }
}
