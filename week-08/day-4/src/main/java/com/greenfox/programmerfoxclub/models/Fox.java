package com.greenfox.programmerfoxclub.models;

import com.greenfox.programmerfoxclub.services.FoodAndDrinkService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Entity
@Getter
@Setter
public class Fox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    @Transient
    private List<String> tricks;
    @Transient
    private Tricks trickList = new Tricks();
    private String food;
    private String drink;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = "salad";
        this.drink = "water";
    }

    public Fox() {
    }

    public String getName() {
        return name.toLowerCase(Locale.ROOT);
    }

    public List<String> getTricks() {
        return this.tricks;
    }

    public List<String> getRemainingTricksToLearn() {
        trickList.getTricks().removeIf(trick -> tricks.contains(trick));
        return trickList.getTricks();
    }

    public void learnTrick(String trick) {
        if (tricks.stream().anyMatch(n -> n.matches(trick))) {
            return;
        }
        tricks.add(trick);
    }

    @Override
    public String toString() {
        return "This is " + name + ". Currently living on " + food + " and " + drink + ". He knows " + tricks.size() + " tricks.";
    }
}
