package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Input {

    public void handleInput(String[] args) {
        TaskManagement task = new TaskManagement();

        if (args == null || args.length < 1) {
            printUsage();
            return;
        }

        switch (args[0]) {
            case "-l": {
                if (args.length > 1) {
                    System.out.println("Unsupported argument");
                    break;
                }
                task.list();
                break;
            }
            case "-a": {
                if (args.length == 1) {
                    System.out.println("Unable to add: no task provided");
                    break;
                }
                task.add(getString(args));
                break;
            }
            case "-r": {
                task.remove(args);
                break;
            }
            case "-c": {
                checkTask(args);
                break;
            }
            default: {
                System.out.println("Unsupported argument\n");
                printUsage();
            }
        }
    }

    private void printUsage() {
        System.out.println("Command Line Todo application");
        System.out.println("=============================\n");
        System.out.println("Command line arguments:");
        System.out.println("\t-l   Lists all the tasks");
        System.out.println("\t-a   Adds a new task");
        System.out.println("\t-r   Removes an task");
        System.out.println("\t-c   Completes an task");
    }

    private String getString(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
            sb.append(args[i]).append(" ");
        }

        return sb.toString();
    }

    private void checkTask(String[] args) {
        Path path = Paths.get("todo/task/tasks.txt");
        try {
            if (args.length == 1) {
                System.out.println("Unable to check: no index provided");
                return;
            }

            try {
                int index = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Unable to check: index is not a number");
                return;
            }

            int index = Integer.parseInt(args[1]) - 1;
            List<String> taskList = Files.readAllLines(path);

            try {
                taskList.remove(index);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to check: index is out of bound");
                return;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(taskList.get(index));
            sb.replace(0, 3, "[x]");


            taskList.remove(index);
            taskList.add(index, sb.toString());
            Files.write(path, taskList);

        } catch (IOException e) {
            System.out.println("Can't find file path!");
        }

    }


}
