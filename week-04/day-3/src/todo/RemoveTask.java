package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RemoveTask {

    public void rmTask(String string) {
        Path path = Paths.get("todo/task/tasks.txt");
        try {
            List<String> taskList = Files.readAllLines(path);
            taskList.remove(Integer.parseInt(string));

        } catch (IOException e) {
            System.out.println("Can't find file path!");
        }
    }
}
