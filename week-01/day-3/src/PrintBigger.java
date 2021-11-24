import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if(firstNumber > secondNumber){
            System.out.println(firstNumber + " is bigger then " + secondNumber);
        }
        else{
            System.out.println(secondNumber + " is bigger then " + firstNumber);
        }
    }
}
