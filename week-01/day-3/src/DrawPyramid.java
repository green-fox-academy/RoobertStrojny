public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that draws a pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        int number = 5;
        int star = 0;
        for (int i = 1; i <= number; i++) {
            for (int space = number; space >= i; space--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            star +=2;
        }

    }
}
