import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 5 numbers in a row");
        System.out.println("1. number: ");
        int number = scanner.nextInt();
        System.out.println("2. number: ");
        number += scanner.nextInt();
        System.out.println("3. number: ");
        number += scanner.nextInt();
        System.out.println("4. number: ");
        number += scanner.nextInt();
        System.out.println("5. number: ");
        number += scanner.nextInt();
        System.out.println("Sum is: " +number + ", Average is: " + (number/5.));
    }
}
