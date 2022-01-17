import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUtils {

    public static void main(String[] args) {
//        evenNumbers();
//        squareNumbers();
//        squareIsGreaterThen20();
        averageOfOddNumbers();
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
