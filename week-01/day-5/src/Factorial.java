import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //  Create the usual class wrapper and main method on your own

        // - Create a function called `calculateFactorial()`
        //   that returns the factorial of its input
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter number: ");
        int userFactorial = userInput.nextInt();
        System.out.println(userFactorial + "! is : " + calculateFactorial(userFactorial));

    }
    public static int calculateFactorial(int a){
        int factorial = a;
        for (int i = a - 1; i >= 1; --i) {
            factorial *= i;
        }
        return factorial;
    }
}
