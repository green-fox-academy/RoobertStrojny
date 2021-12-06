public class MaximumFinder {
    public static void main(String[] args) {
        // Write a function which returns the largest element of an array using recursion.
//        int[] arr = {1,2,4,5,1,2,2,5,6,8,12,14,2,5,4,26,1,0,1};
        int[] arr = {1,2,4};
        System.out.println(maximum(arr));
    }

    private static int[] maximum(int[] arr) {
        if (arr.length > 0){
            return arr;
        }
        return arr;

    }
}
