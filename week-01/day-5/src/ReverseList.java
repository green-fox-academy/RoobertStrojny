public class ReverseList {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers`
        // - Print the elements of the reversed `numbers`
        int[] numbers = {3, 4, 5, 6, 7};
        int[] temp = new int[numbers.length];
        int j = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            --j;
            temp[i] += numbers[j];
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = temp[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

