import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtils {

    public static void main(String[] args) {
//        evenNumbers();
//        squareNumbers();
//        squareIsGreaterThen20();
//        averageOfOddNumbers();
//        sumOfOddNumbers();
//        uppercaseCharacters();
//        startsWithCharacter('R');
//        startsWithCharacter('N');
//        concatList();
//        frequencyOfCharacters();
//        List<Fox> foxes = Arrays.asList(new Fox("Arnold", "WHITE", 5),
//                new Fox("Arthur", "BLACK", 4),
//                new Fox("Bnjsas", "GREEN", 9),
//                new Fox("Bajds", "WHITE", 7),
//                new Fox("Grieaa", "GREEN", 3),
//                new Fox("Mfaidn", "YELLOW", 4),
//                new Fox("Nasknd", "BROWN", 3),
//                new Fox("Coasjd", "BLACK", 4),
//                new Fox("Fnasid", "BLACK", 7)
//                );
//        greenColorFoxes(foxes);
//        greenColorAndYoungerThen5(foxes);
//        colorMapOfFoxes(foxes);
//        getWordFrequency("wikipedia.txt");
//        getMostCommonWords();
        Path path = Paths.get("swcharacters.csv");
        getHeaviestCharacter(path);
    }

    private static String getHeaviestCharacter(Path path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Map<String, Double> map = lines.stream()
                .map(line -> line.split(";"))
                .collect(Collectors.toMap(line -> line[0], line -> line[2].matches("\\d+") ? Double.parseDouble(line[2]) : 0))
                ;

        String s = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        
        System.out.println(s);
        return s;
    }

    private static Map<String, Long> getMostCommonWords() {

        Map<String, Long> map = getWordFrequency("wikipedia.txt")
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(map);

        return map;
    }

    private static Map<String, Long> getWordFrequency(String s) {
        Path path = Paths.get(s);
        List<String> words = new ArrayList<>();
        try {
            words = List.of(Files.readString(path, StandardCharsets.UTF_8).split("[\\p{Punct}\\s]+"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, Long> wordsMap = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordsMap);
        return wordsMap;
    }

    private static Map<String, Long> colorMapOfFoxes(List<Fox> foxes) {
        Map<String, Long> count = foxes.stream()
                .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));
        System.out.println(count);
        return count;
    }

    private static void greenColorAndYoungerThen5(List<Fox> foxes) {
        List<Fox> output = foxes.stream()
                .filter(fox -> fox.getAge() < 5 && fox.getColor() == "GREEN")
                .collect(Collectors.toList());
        System.out.println(output);
    }

    private static void greenColorFoxes(List<Fox> foxes) {

        List<Fox> output = foxes.stream()
                .filter(fox -> fox.getColor() == "GREEN")
                .collect(Collectors.toList());

        System.out.println(output);
    }

    private static Map<Character, Long> frequencyOfCharacters() {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.";

        Map<Character, Long> map = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

        return map;

    }

    private static String concatList() {

        List<Character> characters = Arrays.asList('L', 'o', 'r', 'e', 'm', ' ', 'i', 'p', 's', 'u', 'm');

        String output = characters.stream()
                .map(c -> c.toString())
                .collect(Collectors.joining());

        System.out.println(output);

        String expectedOutput = "Lorem ipsum";

        System.out.println(expectedOutput);
        return output;
    }

    private static List<String> startsWithCharacter(char ch) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        List<String> output = cities.stream()
                .filter(s -> s.startsWith(String.valueOf(ch)))
                .collect(Collectors.toList());

        System.out.println(output);

        List<String> expectedOutput;
        expectedOutput = Arrays.asList("ROME"); // for 'R'
        expectedOutput = Arrays.asList("NAIROBI", "NEW DELHI"); // for 'N'

        return output;
    }

    private static List<Character> uppercaseCharacters() {
        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";

        List<Character> list = s.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isUpperCase)
                .collect(Collectors.toList());

        System.out.println(list);

        List<Character> expectedOutput = Arrays.asList('L', 'I', 'D', 'S', 'A', 'C', 'A', 'E', 'M');

        System.out.println(expectedOutput);

        return list;
    }

    private static int sumOfOddNumbers() {

        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        int output = numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer::sum);

        System.out.println(output);

        int expectedOutput = 61;

        System.out.println(expectedOutput);

        return output;
    }

    private static double averageOfOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        double output = numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer::sum)
                .doubleValue() / numbers.stream().filter(n -> n % 2 != 0).count();

        System.out.println(output);

        double expectedOutput = 22.0 / 6.0;
        System.out.println(expectedOutput);
        return output;
    }

    private static List<Integer> squareIsGreaterThen20() {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> output = numbers.stream()
                .filter(n -> (n * n) > 20)
                .collect(Collectors.toList());

        System.out.println(output);

        List<Integer> expectedOutput = Arrays.asList(9, 8, 6, 5);
        System.out.println(expectedOutput);

        return output;
    }

    private static List<Integer> squareNumbers() {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> squareNumbers = numbers.stream()
                .filter(n -> n > 0)
                .map(n -> n = n * n)
                .collect(Collectors.toList());
        System.out.println(squareNumbers);

        List<Integer> expectedOutput = Arrays.asList(1, 9, 144, 361, 36, 81, 100, 196);
        System.out.println(expectedOutput);

        return squareNumbers;
    }

    public static List<Integer> evenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(evenNumbers);
        List<Integer> expectedOutput = Arrays.asList(-2, -4, -8, 12, 6, 10, 14);
        System.out.println(expectedOutput);

        return evenNumbers;
    }
}
