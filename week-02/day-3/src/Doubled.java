import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.nio.file.Files.*;

public class Doubled {
    public static void main(String[] args) {
        // Create a method called decryptDoubled() that takes a filename as string as a parameter
        // and it can decrypt the duplicated-chars.txt file
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should return this message: File not found
        // The result should be saved in the output.txt file
        String filename = "duplicated-file.txt";
        decryptDouble(filename);
    }

    private static void decryptDouble(String filename) {
        Path path = Paths.get(filename);
        Path output = Paths.get("output.txt");
        try {
            List<String> fileList = Files.readAllLines(path);
            char[] words = fileList.toString().toCharArray();
            List<Character> finalList = new ArrayList<>();
            List<String> finalString = new ArrayList<>();
            for (int j = 0; j < words.length-1; j+=2) {
                    finalList.add(words[j]);
            }
            finalList.remove(0);
            finalList.remove(finalList.size()-1);
            StringBuilder sb = new StringBuilder();
            for (Character c : finalList){
                if (c == '.'){
                    sb.append(".\n");
                }else {
                    sb.append(c);
                }
            }

            finalString.add(sb.toString().trim());

            System.out.println(finalString);
            Files.write(output, finalString);

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
