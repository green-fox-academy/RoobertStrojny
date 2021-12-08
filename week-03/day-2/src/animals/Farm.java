package animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {
    List<Animals> listOfAnimals;
    public final int limit = 5;

    public Farm() {
        listOfAnimals = new ArrayList<>(limit);
    }

    public void breed(Animals animals) {
        if (listOfAnimals.size() < limit) {
            listOfAnimals.add(animals);
            System.out.println("You breed : " + animals.name);
        } else {
            System.out.println("You can only have 5 animals!");
        }
    }

    public void sell() {
        listOfAnimals.remove(leastHungryAnimal());
    }

    public int leastHungryAnimal() {
        int index = 0;

        int[] hunger = new int[listOfAnimals.size()];

        for (int i = 0; i < listOfAnimals.size(); i++) {
            hunger[i] = listOfAnimals.get(i).hunger;
        }

        Arrays.sort(hunger);

        for (Animals animals : listOfAnimals) {
            if (animals.hunger == hunger[hunger.length-1]){
                index = listOfAnimals.indexOf(animals);
            }
        }

        return index;


//        for (Animals animals : listOfAnimals) {
//            for (Animals animalsToCompare : listOfAnimals) {
//                if (animals.hunger > animalsToCompare.hunger) {
//                    index = listOfAnimals.indexOf(animals);
//                    System.out.println("You just sold your " + animals.name);
//                    break;
//                }
//            }
//        }

    }

    public static void main(String[] args) {
        Animals dog = new Animals("dog");
        Animals cat = new Animals("cat");
        Animals tiger = new Animals("tiger");
        Animals lion = new Animals("lion");
        Animals pig = new Animals("pig");
        Animals sheep = new Animals("sheep");

        Farm farm = new Farm();

        farm.breed(dog);
        farm.breed(cat);
        farm.breed(tiger);
        farm.breed(lion);
        farm.breed(pig);
        farm.breed(sheep);

        pig.play();
        cat.play();
        cat.play();

        farm.sell();

        System.out.println(farm.listOfAnimals);

    }
}
