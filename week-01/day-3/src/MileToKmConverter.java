import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value in miles: ");
        double miles = scanner.nextDouble();
        miles *= 1.609344;
        System.out.println("Your value in KM is: " +miles);
    }
}
