import java.util.ArrayList;
import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("978-1-60309-452-8", "A Letter to Jo");
        numbers.put("978-1-60309-459-7", "Lupus");
        numbers.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        numbers.put("978-1-60309-461-0", "The Lab");
        ArrayList<String> numberInHashMap = new ArrayList<>(numbers.keySet());

        for (String values : numberInHashMap){
            System.out.println(numbers.get(values) + " (ISBN: " + values + ")");
        }

        numbers.remove("978-1-60309-444-3");
        numbers.remove(numbers.entrySet());

        for (String keys : numberInHashMap){        // for loop to remove based on value
            if("The Lab" == numbers.get(keys)){
                numbers.remove(keys);
            }
        }

        numbers.put("978-1-60309-450-4", "They Called Us Enemy");
        numbers.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(numbers.containsKey("478-0-61159-424-8"));
        System.out.println(numbers.get("978-1-60309-453-5"));

    }
}
