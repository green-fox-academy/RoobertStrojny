package com.greenfox.programmerfoxclub.controllers;

import com.greenfox.programmerfoxclub.services.FoodAndDrinkService;
import com.greenfox.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FoxController {
    FoxService foxService;
    FoodAndDrinkService foodAndDrink;

    @Autowired
    public FoxController(FoxService foxService, FoodAndDrinkService foodAndDrink) {
        this.foxService = foxService;
        this.foodAndDrink = foodAndDrink;
    }

    @GetMapping("/nutritionStore")
    public String nutrition(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("fox", foxService.getFoxFromList(name));
        model.addAttribute("drinks", foodAndDrink.getDrinks());
        model.addAttribute("foods", foodAndDrink.getFoods());
        return "nutrition";
    }

    @PostMapping("/nutritionChange")
    public String change(@RequestParam(name = "name") String name,
                         @RequestParam(name = "food") String food,
                         @RequestParam(name = "drink") String drink
            , Model model, RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("name", name);
        model.addAttribute("drinks", foodAndDrink.getDrinks());
        model.addAttribute("foods", foodAndDrink.getFoods());
        foxService.getFoxFromList(name).setFood(food);
        foxService.getFoxFromList(name).setDrink(drink);
        return "redirect:/";
    }

    @GetMapping("/trickCenter")
    public String trickCenter(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("fox", foxService.getFoxFromList(name));
        model.addAttribute("tricks", foxService.getFoxFromList(name).getRemainingTricksToLearn());
        return "trick";
    }

    @PostMapping("/trickCenter")
    public String trickCenter(@RequestParam(name = "name") String name,
                              @RequestParam(name = "trick") String trick, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("fox", foxService.getFoxFromList(name));
        model.addAttribute("tricks", foxService.getFoxFromList(name).getRemainingTricksToLearn());
        foxService.getFoxFromList(name).learnTrick(trick);
        return "trick";
    }
}
