import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses
        // Write a function that returns the GET / POST request ratio
        Path path = Paths.get("logs.txt");

        String[] ipAddress = arrayIpAddress(path); // printing all ip addresses
        for (String s : ipAddress){
            System.out.println(s);
        }

        getPostRatio(path);    // printing get post ratio


    }

    public static String[] arrayIpAddress(Path path) {
        try {
            List<String> list = Files.readAllLines(path);
            String[] ipList;
            List<String> listOfIp = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {         //splitting only ip addresses and adding to list
                ipList = list.get(i).split("   ");
                listOfIp.add(ipList[1]);
            }

            String[] finalIpList = listOfIp.toArray(new String[0]);   // parsing list to array and returning array
            return finalIpList;

        } catch (IOException e) {
            String[] returned = {"FILE NOT FOUND :(", "thats sad"};
            return returned;
        }
    }

    public static void getPostRatio(Path path) {
        try {
            List<String> list = Files.readAllLines(path);
            String[] getPostArray;
            List<String> listOfGetPost = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {                 // splitting only post or get with " /"
                getPostArray = list.get(i).split("   ");
                listOfGetPost.add(getPostArray[2]);
            }

            List<String> trimmedList = new ArrayList<>();
            for (int i = 0; i < listOfGetPost.size(); i++) {
                getPostArray = listOfGetPost.get(i).split(" "); // splitting only words post and get
                trimmedList.add(getPostArray[0]);
            }

            HashMap<String, Integer> getPostMap = new HashMap<>();    // making hashmap to count number of post or get
            getPostMap.put("POST", 0);
            getPostMap.put("GET", 0);
            for (int i = 0; i < trimmedList.size(); i++) {
                if (trimmedList.get(i).equals("POST")){
                    int postCount = getPostMap.getOrDefault("POST", 0);
                    getPostMap.put("POST", postCount + 1);
                }else if(trimmedList.get(i).equals("GET")){
                    int getCount = getPostMap.getOrDefault("GET", 0);
                    getPostMap.put("GET", getCount + 1);
                }
            }
            float result = getPostMap.get("GET").floatValue() / getPostMap.get("POST").floatValue();  // printing ratio
            System.out.println("GET / POST ratio is : " + result);



        } catch (IOException e) {
            System.out.println("FILE NOT FOUND");
        }
    }
}
