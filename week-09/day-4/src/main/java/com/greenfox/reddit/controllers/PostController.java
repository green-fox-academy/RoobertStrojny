package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("failed", false);
        return "submit";
    }

    @PostMapping("/submitPost")
    public String submitPost(@ModelAttribute Post post, Model model) {
        if (!post.getTitle().isEmpty() && !post.getUrl().isEmpty()) {
            postService.savePost(post);
            return "redirect:/";
        } else {
            model.addAttribute("failed", true);
        }
        return "submit";
    }

    @GetMapping("/voteUp/{id}")
    public String increment(@PathVariable Integer id) {
        postService.incrementPost(id);
        return "redirect:/";
    }

    @GetMapping("/voteDown/{id}")
    public String decrement(@PathVariable Integer id) {
        postService.decrementPost(id);
        return "redirect:/";
    }
}
