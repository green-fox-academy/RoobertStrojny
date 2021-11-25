import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 28;
        System.out.println("Try to guess number: ");
        int guess = scanner.nextInt();
        while (guess != number){
            if (guess > number){
                System.out.println("The stored number is lower");
            }
            else {
                System.out.println("The stored number is higher");
            }
            System.out.println("Try again: ");
            guess = scanner.nextInt();
        }
        System.out.println("You found the number: " +number);
    }
}
