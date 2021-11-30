import java.util.*;

public class AppendLetter{
    public static void main(String[] args){

        List<String> animals = Arrays.asList(
                "koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
                "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"
        );

        // Create a method called "appendA()"" that adds "a" to every string in the "animals" list
        // The method should accept a list of strings as a parameter and return an updated list of strings
        // Expected output: [koala, panda, zebra, anaconda, boa, chinchilla, cobra, gorilla, hyena, hydra, iguana, impala, puma, tarantula, pirahna]

        System.out.println(appendA(animals));
    }

    private static String appendA(List<String> animals) {
        List<String> animalsCorrect = new ArrayList<>();

        for (int i = 0; i < animals.size(); i++) {
            animalsCorrect.add(i, animals.get(i) + "a");
        }
        return animalsCorrect.toString();
    }
}