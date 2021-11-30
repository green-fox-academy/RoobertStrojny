import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Double> productPrices = new HashMap<>();
        HashMap<String, Integer> bobShoppingList = new HashMap<>();
        HashMap<String, Integer> aliceShoppingList = new HashMap<>();


        double bobSum = 0;
        double aliceSum = 0;

        productPrices.put("Milk", 1.07);
        productPrices.put("Rice", 1.59);
        productPrices.put("Eggs", 3.14);
        productPrices.put("Cheese", 12.60);
        productPrices.put("Chicken Breasts", 9.40);
        productPrices.put("Apples", 2.31);
        productPrices.put("Tomato", 2.58);
        productPrices.put("Potato", 1.75);
        productPrices.put("Onion", 1.10);

        bobShoppingList.put("Milk", 3);
        bobShoppingList.put("Rice", 2);
        bobShoppingList.put("Eggs", 2);
        bobShoppingList.put("Cheese", 1);
        bobShoppingList.put("Chicken Breasts", 4);
        bobShoppingList.put("Apples", 1);
        bobShoppingList.put("Tomato", 2);
        bobShoppingList.put("Potato", 1);

        aliceShoppingList.put("Rice", 1);
        aliceShoppingList.put("Eggs", 5);
        aliceShoppingList.put("Chicken Breasts", 2);
        aliceShoppingList.put("Apples", 1);
        aliceShoppingList.put("Tomato", 10);

        for (String product : bobShoppingList.keySet()) {
            bobSum += productPrices.get(product) * bobShoppingList.get(product);
        }
        System.out.println(bobSum);

        for (String product : aliceShoppingList.keySet()){
            aliceSum += productPrices.get(product) * aliceShoppingList.get(product);
        }
        System.out.println(aliceSum);

        int bobValue = 0;
        int aliceValue = 0;

        if (bobShoppingList.containsKey("Rice")){
            bobValue = bobShoppingList.get("Rice");
        }
        if (aliceShoppingList.containsKey("Rice")){
            aliceValue = aliceShoppingList.get("Rice");
        }
        if (bobValue > aliceValue){
            System.out.println("Bob");
        } else if (aliceValue > bobValue){
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }
        bobValue = 0;
        aliceValue = 0;

        if (bobShoppingList.containsKey("Potato")){
            bobValue = bobShoppingList.get("Potato");
        }
        if (aliceShoppingList.containsKey("Potato")){
            aliceValue = aliceShoppingList.get("Potato");
        }
        if (bobValue > aliceValue){
            System.out.println("Bob");
        } else if (aliceValue > bobValue){
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }
        bobValue = 0;
        aliceValue = 0;

        if (bobShoppingList.containsKey("Ham")){
            bobValue = bobShoppingList.get("Ham");
        }
        if (aliceShoppingList.containsKey("Ham")){
            aliceValue = aliceShoppingList.get("Ham");
        }
        if (bobValue > aliceValue){
            System.out.println("Bob");
        } else if (aliceValue > bobValue){
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }

        bobValue = 0;
        aliceValue = 0;

        if (bobShoppingList.containsKey("Apples")){
            bobValue = bobShoppingList.get("Apples");
        }
        if (aliceShoppingList.containsKey("Apples")){
            aliceValue = aliceShoppingList.get("Apples");
        }
        if (bobValue > aliceValue){
            System.out.println("Bob");
        } else if (aliceValue > bobValue){
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }

        if (bobShoppingList.size() > aliceShoppingList.size()){
            System.out.println("Bob");
        }else if (aliceShoppingList.size() > bobShoppingList.size()){
            System.out.println("Alice");
        }else{
            System.out.println("no one");
        }

        int bobProductCount = 0;
        int aliceProductCount = 0;

        for (Integer number : bobShoppingList.values()){
            bobProductCount += number;
        }

        for (Integer number : aliceShoppingList.values()){
            aliceProductCount += number;
        }

        if (bobProductCount > aliceProductCount){
            System.out.println("Bob");
        }else if(aliceProductCount > bobProductCount){
            System.out.println("Alice");
        }else {
            System.out.println("no one");
        }


    }
}
