public class Sum {
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own

        // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
        int number = 5;
        System.out.println(sum(number));

    }
    public static int sum(int a){
        int sum = a;
        for (int i = 0; i < a; i++) {
            sum += i;
        }
        return sum;
    }
}
