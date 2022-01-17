import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String[] args) {
//        evenNumbers();
        squareNumbers();
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
