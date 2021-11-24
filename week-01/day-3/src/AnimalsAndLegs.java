import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of chickens: ");
        int chicken = scanner.nextInt();
        System.out.println("Please enter number of pigs: ");
        int pigs = scanner.nextInt();
        chicken *= 2;
        pigs *= 4;
        System.out.println("Number of legs is: " +(chicken+pigs));
    }
}
