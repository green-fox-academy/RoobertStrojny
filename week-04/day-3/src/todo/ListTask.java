package todo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ListTask {

    public void listTask() {
        Path path = Paths.get("todo/task/tasks.txt");
        try {
            List<String> taskList = Files.readAllLines(path);
            if (taskList.isEmpty()) {
                System.out.println("No todos for today! :)");
            } else {
                int number = 1;
                for (String s : taskList) {
                    System.out.println(number + " - " + s);
                    number++;
                }
            }
        } catch (IOException e) {
            System.out.println("Can't find file path!");
        }
    }
}
