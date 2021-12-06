public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, write a recursive method (no loops)
        // which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).

        System.out.println(powerN(8, 2));
    }

    private static int powerN(int n, int power) {
        if (n > 1  && power > 1){
            return n * powerN(n, power-1);
        } else {
            return n;
        }
    }
}
