import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to draw a triangle: ");
        int number = scanner.nextInt();
        char triangle = '*';
        for (int i = 0; i < number; i++) {
            for (int j = -1; j < i; j++) {
                System.out.print(triangle);
            }
            System.out.println("");
        }
    }
}
