import java.util.Arrays;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {
        evenNumbers();
    }

    public static void evenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(evenNumbers);

        List<Integer> expectedOutput = Arrays.asList(-2, -4, -8, 12, 6, 10, 14);
    }
}
