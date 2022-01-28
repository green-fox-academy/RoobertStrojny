package com.greenfox.programmerfoxclub.models;

import com.greenfox.programmerfoxclub.services.FoodAndDrinkService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Fox {
    private final String name;
    private final List<String> tricks;
    private String food;
    private String drink;

    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = "salad";
        this.drink = "water";
    }

    public String getName() {
        return name.toLowerCase(Locale.ROOT);
    }

    public List<String> getTricks() {
        return this.tricks;
    }

    public void addTrick(String trick) {
        if (tricks.stream().anyMatch(n -> n.matches(trick))) {
            return;
        }
        tricks.add(trick);
    }

    public String getFood() {
        return food;
    }


    public String getDrink() {
        return drink;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "This is " + name + ". Currently living on " + food + " and " + drink +". He knows " + tricks.size() + " tricks.";
    }
}
