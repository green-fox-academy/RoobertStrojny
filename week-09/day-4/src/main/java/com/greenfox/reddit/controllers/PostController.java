package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String viewPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "index";
    }

    @GetMapping("/submit")
    public String submit(Model model) {
        model.addAttribute("post", new Post());
        return "submit";
    }

    @PostMapping("/submitPost")
    public String submitPost(@ModelAttribute Post post) {
        postService.savePost(post);
        return "redirect:/";
    }

    @PostMapping("/increment")
    public String increment(@ModelAttribute("post") Post post) {
        postService.incrementPost(post);
        postService.savePost(post);
        return "redirect:/";
    }

    
}
