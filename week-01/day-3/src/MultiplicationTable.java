public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 30;

        // Create a program
        // that prints the multiplication table with number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150
        int i = 1;
        while (i < 11){
            System.out.println(i + " * " + number + " = " + (number*i));
            i++;
        }
    }
}

