import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        //         Create a function that divides number 10
        //         by a number that's passed as a paramater and prints the result.
        //         It should print "fail" if the parameter is 0

        int a = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("fail");
        }

    }
}
