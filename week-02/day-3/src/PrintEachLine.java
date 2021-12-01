import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    // Write a program that opens a file called "my-file.txt" and prints each
    // line from the file.
    // If the program is unable to read the file (for example the file does not exist),
    // it should print the following error message: "Unable to read file: my-file.txt".
    public static void main(String[] args) {
        Path path = Paths.get("my-file.txt");
        try{
            List<String> lines = Files.readAllLines(path);
            for (String l : lines){
                System.out.println(l);
            }
        }
        catch (IOException e){
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
