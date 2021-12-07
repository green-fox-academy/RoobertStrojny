package sharpie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Sharpie pink = new Sharpie("pink", 5);
        Sharpie blue = new Sharpie("blue", 5);
        Sharpie red = new Sharpie("red", 5);
        Sharpie yellow = new Sharpie("yellow", 5);
        Sharpie green = new Sharpie("green", 5);

        ArrayList<Sharpie> sharpieList = new ArrayList<Sharpie>();

        sharpieList.add(pink);
        sharpieList.add(blue);
        sharpieList.add(red);
        sharpieList.add(yellow);
        sharpieList.add(green);

        sharpieList.get(1).use();
        sharpieList.get(1).use();
        sharpieList.get(1).use();
        sharpieList.get(1).use();
        sharpieList.get(1).use();
        sharpieList.get(1).use();
        sharpieList.get(1).use();
        sharpieList.get(1).use();
        sharpieList.get(1).use();
        sharpieList.get(1).use();



        System.out.println(sharpieList);
    }
}
