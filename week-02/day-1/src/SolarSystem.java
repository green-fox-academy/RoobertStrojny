import java.util.*;

public class SolarSystem {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // "Saturn" is missing from the planetList
        // Insert it into the correct position
        // Create a method called "putSaturn()" which has a list parameter and returns
        // the list of planets in the correct order

        // Expected output: [Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune]

        System.out.println(putSaturn(planetList));
    }

    public static String putSaturn(List<String> planets){
        planets.add(5, "Saturn");

        return planets.toString();
    }
}
