package todo;

import java.util.List;

public class TaskManagement {

    public void list() {
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

    public void setTask(String task) {
        ErrorHandling error = new ErrorHandling();
        List<String> taskList = error.makeListAndCheckFileException();
        taskList.add("[ ] " + task);
        error.writeToListAndCheckFileException(taskList);
    }

}
