import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();


        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        ArrayList<Integer> productsList = new ArrayList<>(products.values());

        System.out.println(products.get("Fish"));

        Collections.sort(productsList);

        System.out.println(productsList);

        for (String product : products.keySet()){
            if (products.get(product) == productsList.get(productsList.size()-1)) {
                System.out.println(product);
            }
        }

        float sumOfPrice = 0;

        for (String product : products.keySet()){
            sumOfPrice += products.get(product);
        }
        float averagePrice = 0;
        System.out.println(sumOfPrice/products.size());

        int countOfProducts = 0;
        for (String product : products.keySet()){
            if (products.get(product) < 300){
                countOfProducts++;
            }
        }
        System.out.println(countOfProducts);

        if (productsList.contains(125)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        for (String product : products.keySet()){
            if (products.get(product) == productsList.get(0)){
                System.out.println(product);
            }
        }


    }
}
