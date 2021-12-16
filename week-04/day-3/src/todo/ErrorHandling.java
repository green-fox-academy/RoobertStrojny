package todo;

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

    public List<String> makeListAndCheckFileException() {
        try {
            return Files.readAllLines(path());
        } catch (IOException e) {
            System.out.println("Can't find file path!");
            return null;
        }
    }

    public void writeToListAndCheckFileException(List<String> list) {
        try {
            Files.write(path(), list);
        } catch (IOException e) {
            System.out.println("Can't find file path!");
        }
    }

    public boolean checkIfInputIsNumber(String[] args, String string) {
        try {
            int index = Integer.parseInt(args[1]);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Unable to " + string + ": index is not a number");
            return false;
        }
    }

    public boolean checkIfIndexIsProvided(String[] args, String string) {
        if (args.length == 1) {
            System.out.println("Unable to "+ string + ": no index provided");
            return false;
        }
        return true;
    }


}
