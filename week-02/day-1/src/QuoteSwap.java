import java.util.*;

public class QuoteSwap{
    public static void main(String... args){

        List<String> list = Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand.");

        // Accidentally, I messed up this quote from Richard Feynman - two words are out of place,
        // Your task is to fix it by swapping the right words in your code
        // To do this, create a method called "swapQuote()" which takes the `list` as a parameter,
        // fixes the order of the words and returns the words joined in a single string with spaces between them.

        // Expected output: "What I cannot create, I do not understand."
        System.out.println(swapQuote(list));
    }

    public static String swapQuote(List<String> list) {
        List<String> fixedList = new ArrayList<>(list);
        Collections.swap(fixedList, 2, 5);
        String finalList = "";
        for (String words : fixedList){
            finalList = finalList.concat(words + " ");
        }
        finalList = finalList.trim();
        return finalList;
    }
}