package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.models.User;
import com.greenfox.reddit.services.PostService;
import com.greenfox.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("user")
public class PostController {

    PostService postService;
    UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String viewPosts(@SessionAttribute(value = "user",required = false) User userSession, Model model, RedirectAttributes redirectAttributes) {
        if (userSession == null) {
            model.addAttribute("currentUser", new User());
        }
        model.addAttribute("posts", postService.getAllPosts());
        model.addAttribute("currentUser", userSession);
        return "index";
    }

    @GetMapping("/submit/")
    public String submit(Model model) {
        model.addAttribute("post", new Post());
        model.addAttribute("failed", false);
        return "submit";
    }

    @PostMapping("/submitPost/")
    public String submitPost(@ModelAttribute Post post, @ModelAttribute("user") User user, Model model) {
        if (!post.getTitle().isEmpty() && !post.getUrl().isEmpty()) {
            post.setUser(user);
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
