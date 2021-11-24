import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of boys coming to the party: ");
        int boys = scanner.nextInt();
        System.out.println("Enter number of girls coming to the party: ");
        int girls = scanner.nextInt();

        if (girls == boys && (girls+boys) >= 20){
            System.out.println("The party is excellent! ");
        }else if(girls == 0 && (girls+boys)>0){
            System.out.println("Sausage party");
        }else if((girls+boys) < 20){
            System.out.println("Average party... ");
        }else {
            System.out.println("Quite a good party! ");
        }
    }
}
