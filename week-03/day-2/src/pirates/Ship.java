package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private Pirate captain;
    private List<Pirate> crew;
    private String name;
    private final int maximumPiratesInShip = 113;

    public Ship(String name) {
        this.name = name;
    }

    public void fillShip() {
        Random random = new Random();
        int randomNumberOfPirates = random.nextInt(1, maximumPiratesInShip);
        captain = new Pirate();
        crew = new ArrayList<>();

        for (int i = 0; i < maximumPiratesInShip; i++) {
            crew.add(new Pirate());
        }
    }

    public static void main(String[] args) {
        Ship ship = new Ship("Bloody Rummers");
        ship.fillShip();
    }


}
