package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TaskManagement {
    ErrorHandling error = new ErrorHandling();

    public void list() {
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

    public void add(String task) {
        List<String> taskList = error.makeListAndCheckFileException();
        taskList.add("[ ] " + task);
        error.writeToListAndCheckFileException(taskList);
    }

    public void remove(String[] args) {
        if (!error.checkIfIndexIsProvided(args, "remove")){
            return;
        }

        if (!error.checkIfInputIsNumber(args, "remove")) {
            return;
        }

        int index = Integer.parseInt(args[1]) - 1;
        List<String> taskList = error.makeListAndCheckFileException();

        try {
            taskList.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Unable to remove: index is out of bound");
            return;
        }

        taskList.remove(index);
        error.writeToListAndCheckFileException(taskList);

    }

}
