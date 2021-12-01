import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function called countLines() that takes a filename as string as a parameter
        // and returns the number of lines the file contains.
        // It should return zero if it can't open the file
        // and should not raise any error.
        Path path = Paths.get("my-file.txt"); //my-file.txt have 10 lines
        System.out.println(countLines(path));
    }

    public static int countLines(Path path){
        try {
            List<String> lines = Files.readAllLines(path);
            return lines.size();
        } catch (IOException e) {
            return 0;
        }
    }
}
