package sharpieset;

public class Sharpie {
    String color;
    int width;
    int inkAmount = 100;

    public Sharpie(String color, int width) {
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmount -= 10;
        System.out.println("You just used your sharpie. Ink amount is now: " + inkAmount);
    }

}
