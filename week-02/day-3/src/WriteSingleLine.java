import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // by writing your name into it as a single line.
        // The file should be named "my-file.txt".
        // In case the program is unable to write the file,
        // it should print the following error message: "Unable to write file: my-file.txt".
        Path path = Paths.get("my-file.txt");
        String name = "Robert Strojny";
        writeName(path ,name);

    }
    public static void writeName(Path path,String name){
        try {
            List<String> list = Files.readAllLines(path);
            list.add(name);
            Files.write(path, list);
            System.out.println("Added name: " + name);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
