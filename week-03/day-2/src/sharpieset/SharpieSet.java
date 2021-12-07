package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    public List<Sharpie> listOfSharpies;

    public SharpieSet() {
        this.listOfSharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie){
        listOfSharpies.add(sharpie);
    }


    public int countUsable() {
        int counter = 0;
        for (Sharpie listOfSharpy : listOfSharpies) {
            if (listOfSharpy.inkAmount > 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {
        listOfSharpies.removeIf(listOfSharpy -> listOfSharpy.inkAmount == 0);
    }

    public static void main(String[] args) {

        Sharpie pink = new Sharpie("pink", 5);
        Sharpie blue = new Sharpie("blue", 5);
        Sharpie red = new Sharpie("red", 5);
        Sharpie yellow = new Sharpie("yellow", 5);
        Sharpie green = new Sharpie("green", 5);

        SharpieSet sharpies = new SharpieSet();

        sharpies.add(pink);
        sharpies.add(blue);
        sharpies.add(red);
        sharpies.add(yellow);
        sharpies.add(green);

        for (int i = 0; i < 10; i++) {
            pink.use();
        }

        System.out.println("Usable sharpies : " + sharpies.countUsable());
        sharpies.removeTrash();

        System.out.println(sharpies);

    }

    @Override
    public String toString() {
        return "SharpieSet{" +
                "listOfSharpies=" + listOfSharpies +
                '}';
    }
}
