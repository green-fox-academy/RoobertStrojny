import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        int number = scanner.nextInt();
        int star = 0;
        for (int i = 1; i <= number; i++) {
            for (int space = number; space > i; space--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star += 2;
        }

        for (int i = 1; i <= number; i++) {
            for (int space = 0; space < i ; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j < star-2; j++) {
                System.out.print("*");
            }
            System.out.println();
            star -= 2;
        }

    }
}
