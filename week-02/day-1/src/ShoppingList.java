import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

        if (shoppingList.contains("milk")){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

        if (shoppingList.contains("bananas")){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
