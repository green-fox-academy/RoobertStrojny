import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        System.out.println();
        int position = 1;
        for (int i = 1; i <= number; i++) {
            if (i == 1 || i == number) {
                for (int j = 0; j < number; j++) {
                    System.out.print("%");
                }
            }else{
                for (int j = 1; j <= number; j++) {
                    if (j == 1 || j == number || j == position){
                        System.out.print("%");
                    }else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
            position++;
        }
    }
}
