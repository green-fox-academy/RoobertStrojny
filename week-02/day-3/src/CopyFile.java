import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another file
        // It should take two filenames (string) as parameters:
        //  - path and name of the source file
        //  - path and name of the target file
        // It should return a boolean that shows if the copy was successful
        String fileToCopy = "my-file.txt";
        String copy = "my-file-copy.txt";

        System.out.println(copyFiles(fileToCopy, copy));
    }

    private static boolean copyFiles(String fileToCopy, String copy) {
        Path ogFile = Paths.get(fileToCopy);
        Path copyFile = Paths.get(copy);
        try {
            List<String> list = Files.readAllLines(ogFile);
            Files.write(copyFile, list);
            return true;
        } catch (IOException e) {
            return false;
        }

    }
}
