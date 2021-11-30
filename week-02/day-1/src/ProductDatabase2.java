import java.util.ArrayList;
import java.util.HashMap;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();


        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        ArrayList<Integer> productsList = new ArrayList<>(products.values());

        for (String product : products.keySet()){
            if (products.get(product) < 201){
                System.out.println(product);
            }
        }

        for (String product : products.keySet()){
            if (products.get(product) > 150){
                System.out.println(product + " " +products.get(product));
            }
        }
    }
}
