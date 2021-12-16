package todo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTask {

    public void listTask() {
        ErrorHandling error = new ErrorHandling();
        List<String> taskList = error.makeListAndCheckFileException();
        if (taskList.isEmpty()) {
            System.out.println("No todos for today! :)");
        } else {
            int number = 1;
            for (String s : taskList) {
                System.out.println(number + " - " + s);
                number++;
            }
        }

    }
}
