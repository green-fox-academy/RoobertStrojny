import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {

    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as parameters
        //  It returns the indices of the integers of the array which contain the given number
        //  or returns an empty array (if the number is not part of any of the integers in the array)

        //  Examples:
        System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] {1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] {1, 11, 34, 52, 61})));
        //  should print: '[]'

        // Note: We are using Arrays.toString() function to print the array returned
        // You could just as well iterate over the array and print its items one by one


    }
    public static int[] findMatchingIndexes(int number, int[] array){
        ArrayList<Integer> listToCompare = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (String.valueOf(array[i]).contains(String.valueOf(number))){
                listToCompare.add(i);
            }
        }
        int[] finalArray = new int[listToCompare.size()];
        for (int i = 0; i < listToCompare.size(); i++) {
            finalArray[i] = listToCompare.get(i);
        }


        return finalArray;

    }

}
