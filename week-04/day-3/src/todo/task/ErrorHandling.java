package todo.task;

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

    public List<String> makeListAndCheckFileError() {
        try {
            List<String> taskList = Files.readAllLines(path());
            return taskList;
        } catch (IOException e) {
            System.out.println("Can't find file path!");
            return new ArrayList<>();
        }
    }
}
