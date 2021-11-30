import java.util.*;

public class ElementFinder{
    public static void main(String... args){

        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Add a method called `containsSeven` that checks if the `listOfNumbers` contains the number 7
        // If it does the method should return "Hoorray" otherwise return "Noooooo"

        // The output should be "Noooooo"
        System.out.println(containsSeven(listOfNumbers));

        // Add a method called `containsSevenDifferent` which implements the same behavior differently
        // (e.g. using different list methods)

        // The output should be "Noooooo", again!
        System.out.println(containsSevenDifferent(listOfNumbers));
    }

    private static String containsSevenDifferent(List<Integer> listOfNumbers) {
        List<Integer> compareList = new ArrayList<>();
        for (Integer n : listOfNumbers){
            if (!compareList.contains(n)){
                compareList.add(n);
            }
        }

        if (compareList.size() < listOfNumbers.size()){
            return "Hooorrrayyy";
        }else {
            return "Noooooo";
        }
    }

    private static String containsSeven(List<Integer> listOfNumbers) {
        if (listOfNumbers.contains(7)){
            return "Hoorray";
        }else {
            return "Noooooo";
        }
    }
}