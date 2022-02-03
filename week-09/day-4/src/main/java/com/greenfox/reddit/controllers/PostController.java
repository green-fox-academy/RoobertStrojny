package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.models.User;
import com.greenfox.reddit.services.PostService;
import com.greenfox.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PostController {

    PostService postService;
    UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String viewPosts(@ModelAttribute("user") User user, Model model, RedirectAttributes redirectAttributes) {
        model.addAttribute("posts", postService.getAllPosts());
        if (user == null) {
            model.addAttribute("currentUser", new User());
        }
        model.addAttribute("currentUser", user);
        return "index";
    }

    @GetMapping("/submit/{id}")
    public String submit(@PathVariable(name = "id") Integer id,Model model) {
        model.addAttribute("post", new Post());
        model.addAttribute("failed", false);
        return "submit";
    }

    @PostMapping("/submitPost/{id}")
    public String submitPost(@ModelAttribute Post post,@PathVariable(name = "id") Integer id, Model model) {
        if (!post.getTitle().isEmpty() && !post.getUrl().isEmpty()) {
            post.setUser(userService.getUserById(id));
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
