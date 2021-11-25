import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number
        // It would ask this many times to enter an integer
        // If all the integers are entered it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number of numbers: ");
        double count = scanner.nextInt();
        int numbers = 0;
        for (int i = 1; i <= count; i++) {
            System.out.println("Write " + i + ". number: ");
            numbers += scanner.nextInt();
        }
        System.out.println("Sum: "+numbers + ", Average: " + (numbers/count));
    }
}
