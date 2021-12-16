package todo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AddTask {

    public void setTask(String task) {
        ErrorHandling error = new ErrorHandling();
        List<String> taskList = error.makeListAndCheckFileException();
        taskList.add("[ ] " + task);
        error.writeToListAndCheckFileException(taskList);
    }
}
