import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String > telephoneBook = new HashMap<>();
        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");
        ArrayList<String> telephoneBookToList = new ArrayList<>(telephoneBook.keySet());

        System.out.println(telephoneBook.get("John K. Miller"));

        for (String number : telephoneBookToList){
            if (telephoneBook.get(number) == "307-687-2982") {
                System.out.println(number);
            }
        }

        if (telephoneBookToList.contains("Chris E. Myers")){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
