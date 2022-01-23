package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ShopItem;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Controller
@RequestMapping("")
public class WebShopController {

    @GetMapping("/webshop")
    public String index(Model model) {
        List<ShopItem> items = addItems();
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("only-available")
    public String available(Model model) {
        List<ShopItem> items = addItems().stream().filter(n -> n.getQuantityOfStock() > 0).collect(Collectors.toList());
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("contains-nike")
    public String containsNike(Model model) {
        String nike = "Nike";
        List<ShopItem> items = addItems().stream().filter(n -> n.getDescription().contains(nike)).collect(Collectors.toList());
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("cheapest-first")
    public String cheapestFirst(Model model) {
        List<ShopItem> items = addItems().stream().sorted(Comparator.comparingDouble(ShopItem::getPrice)).collect(Collectors.toList());
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("average-stock")
    public String averageStock(Model model) {
        double averageValue = addItems().stream().mapToDouble(ShopItem::getQuantityOfStock).average().getAsDouble();
        String average = "Average stock : " + averageValue;
        model.addAttribute("string", average);
        return "stock";
    }

    @GetMapping("most-expensive")
    public String mostExpensive(Model model) {
        String mostExpensive = "Most expensive item : " + addItems().stream()
                .max(Comparator.comparingDouble(ShopItem::getPrice))
                .get()
                .getName();
        model.addAttribute("string", mostExpensive);
        return "stock";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam(name = "searchString") String searchString){
        List<ShopItem> search = addItems().stream()
                .filter(n -> n.getDescription().toLowerCase(Locale.ROOT).contains(searchString.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
        if (search.size() > 0) {
            model.addAttribute("items", search);
            return "index";
        }

        search = addItems().stream()
                .filter(n -> n.getName().toLowerCase(Locale.ROOT).contains(searchString.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());

        model.addAttribute("items", search);
        return "index";
    }

    private List<ShopItem> addItems() {
        List<ShopItem> items = new ArrayList<>();
        items.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
        items.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
        items.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
        items.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
        items.add(new ShopItem("T-shirt", "Blue with corgi on a bike", 300.0, 1));
        return items;
    }
}
