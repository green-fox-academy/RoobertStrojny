public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`

        String[] orders = {"first", "second", "third"};
        String third = orders[2];
        orders[2] = orders[0];
        orders[0] = third;
        System.out.println(orders[2]);
        System.out.println(orders[0]);
    }
}
