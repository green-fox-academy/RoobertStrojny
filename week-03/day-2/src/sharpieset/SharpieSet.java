package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    public static void main(String[] args) {

//        Sharpie pink = new Sharpie("pink", 5);
//        Sharpie blue = new Sharpie("blue", 5);
//        Sharpie red = new Sharpie("red", 5);
//        Sharpie yellow = new Sharpie("yellow", 5);
//        Sharpie green = new Sharpie("green", 5);

        List<Sharpie> listOfSharpies = new ArrayList<>();

        listOfSharpies.add(new Sharpie("pink", 5));

        System.out.println(listOfSharpies);
    }

    private List<Sharpie> listOfSharpies;

    public SharpieSet() {
        listOfSharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
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

}
