package com.greenfox.programmerfoxclub.services;

import com.greenfox.programmerfoxclub.models.Drink;
import com.greenfox.programmerfoxclub.models.Food;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodAndDrinkService {
    private List<String> drinks;
    private List<String> foods;

    public FoodAndDrinkService(List<String> drinks, List<String> foods) {
        this.drinks = drinks;
        drinks.add("milk");
        drinks.add("cola");
        drinks.add("rum");
        drinks.add("water");
        drinks.add("fanta");
        this.foods = foods;
        foods.add("pizza");
        foods.add("salad");
        foods.add("mozzarella");
        foods.add("baklava");
        foods.add("kebab");
    }

    public List<String> getDrinks() {
        return drinks;
    }

    public List<String> getFoods() {
        return foods;
    }
}
