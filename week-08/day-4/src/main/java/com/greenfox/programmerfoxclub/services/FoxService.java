package com.greenfox.programmerfoxclub.services;

import com.greenfox.programmerfoxclub.models.Fox;
import com.greenfox.programmerfoxclub.models.Tricks;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
@Getter
@Setter
public class FoxService {
    private List<Fox> foxes;
    private List<Tricks> tricks;

    public FoxService(List<Fox> foxes) {
        this.foxes = foxes;
        this.addFox("Robert");
    }

    public void addFox(String name) {
        foxes.add(new Fox(name));
    }

    public boolean isFoxPresent(String name) {
        return foxes.stream().anyMatch(fox -> fox.getName().matches(name.toLowerCase(Locale.ROOT)));
    }

    public Fox getFoxFromList(String name) {
        return foxes.stream().filter(fox -> fox.getName().matches(name)).findFirst().orElse(null);
    }
}
