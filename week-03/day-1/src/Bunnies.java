public class Bunnies {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears. Write
        // a recursive method (no loops or multiplication) which takes the number of
        // bunnies as its sole parameter and returns the total number of ears
        // the bunnies have. The method should be able to handle invalid input
        // (e.g. negative numbers)

        int bunnies = 10;
        System.out.println(bunnyEars(bunnies));
    }

    private static int bunnyEars(int bunnies) {
        if (bunnies > 0) {
            return bunnyEars(bunnies-1) + 2;
        } else {
            return 0;
        }

    }
}
