public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double length = 5.4;
        double breadth = 12.8;
        double height = 3.2;

        double surface = 2*(length + breadth + height);
        System.out.println("Surface area: " +surface);
        double volume = height*breadth*length;
        System.out.println("Volume: " +volume);
    }
}
