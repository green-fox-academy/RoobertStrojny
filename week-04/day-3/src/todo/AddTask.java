package todo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AddTask {

    public void setTask(String task) {
        Path path = Paths.get("todo/task/tasks.txt");
        try {
            List<String> taskList = Files.readAllLines(path);
            taskList.add("[ ] " + task);
            Files.write(path, taskList);
        } catch (IOException e) {
            System.out.println("Can't find file path!");
        }
    }
}
