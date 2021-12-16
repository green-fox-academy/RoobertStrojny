package todo;

import java.util.ArrayList;
import java.util.List;

public class TaskManagement {
    ErrorHandling error = new ErrorHandling();
    List<String> taskList = new ArrayList<>();

    public void list() {
        taskList = error.makeListAndCheckFileException();
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
        taskList = error.makeListAndCheckFileException();
        taskList.add("[ ] " + task);
        error.writeToListAndCheckFileException(taskList);
    }

    public void remove(String[] args) {
        if (!error.checkIfIndexIsProvided(args, "remove")) {
            return;
        }

        if (!error.checkIfInputIsNumber(args, "remove")) {
            return;
        }

        int index = Integer.parseInt(args[1]) - 1;
        taskList = error.makeListAndCheckFileException();

        if (!error.checkIfIndexIsOutOfBound(taskList, index, "remove")){
            return;
        }

        taskList.remove(index);
        error.writeToListAndCheckFileException(taskList);
    }

    public void check(String[] args) {
        if (!error.checkIfIndexIsProvided(args, "check")) {
            return;
        }

        if (!error.checkIfInputIsNumber(args, "check")) {
            return;
        }

        int index = Integer.parseInt(args[1]) - 1;
        taskList = error.makeListAndCheckFileException();

        if (!error.checkIfIndexIsOutOfBound(taskList, index, "check")){
            return;
        }

            StringBuilder sb = new StringBuilder();
            sb.append(taskList.get(index));
            sb.replace(0, 3, "[x]");

            taskList.remove(index);
            taskList.add(index, sb.toString());
            error.writeToListAndCheckFileException(taskList);

    }

   

}
