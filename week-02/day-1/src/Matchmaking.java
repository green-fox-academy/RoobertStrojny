import java.util.*;

public class Matchmaking{
    public static void main(String... args){

        List<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        List<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be added to the list on his/her own
        // Expected output: [Eve-Joe, Ashley-Fred, Claire-Tom, Kat-Todd, Jane-Neef, Jeff]

        System.out.println(match(girls, boys));
    }

    private static String match(List<String> girls, List<String> boys) {
        ArrayList<String> boysAndGirls = new ArrayList<>();
        if (boys.size() >= girls.size()){
            for (int i = 0; i < boys.size(); i++) {
                if (i >= girls.size()) {
                    boysAndGirls.add(i, boys.get(i));
                } else {
                    boysAndGirls.add(i, girls.get(i) + "-" + boys.get(i));
                }
            }
        }
        if (boys.size() < girls.size()){
            for (int i = 0; i < girls.size(); i++) {
                if (i >= boys.size()) {
                    boysAndGirls.add(i, girls.get(i));
                } else {
                    boysAndGirls.add(i, girls.get(i) + "-" + boys.get(i));
                }
            }
        }
        return boysAndGirls.toString();
    }

}