package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class WebShopController {

    List<ShopItem> items = new ArrayList<>();

    @GetMapping("/webshop")
    @ResponseBody
    public String index(){
        return "Hello World";
    }

    private void addItems() {
        items.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
        items.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
        items.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
        items.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
        items.add(new ShopItem("T-shirt", "Blue with corgi on a bike", 300.0, 1));
    }
}
