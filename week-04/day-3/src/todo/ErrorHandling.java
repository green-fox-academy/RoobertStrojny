package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandling {

    public Path path() {
        Path path = Paths.get("todo/task/tasks.txt");
        return path;
    }

    public List<String> makeListAndCheckFileException() {
        try {
            return Files.readAllLines(path());
        } catch (IOException e) {
            System.out.println("Can't find file path!");
            return null;
        }
    }

    public void writeToListAndCheckFileException(List<String> list){
        try {
            Files.write(path(), list);
        } catch (IOException e) {
            System.out.println("Can't find file path!");
        }
    }


}
