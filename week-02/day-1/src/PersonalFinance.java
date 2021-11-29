import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        float sumOfNumbers = 0;
        for (int n : numbers){
            sumOfNumbers += n;
        }
        System.out.println(sumOfNumbers);

        Collections.sort(numbers);
        Collections.sort(numbers);
        System.out.println(numbers.get(numbers.size()-1));

        System.out.println(numbers.get(0));

        float averageOfNumbers = sumOfNumbers / numbers.size();

        System.out.println(averageOfNumbers);



    }

}
