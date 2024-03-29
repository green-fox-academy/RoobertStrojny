package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ErrorHandling {
    Path path = Paths.get("todo/task/tasks.txt");

    public List<String> makeListAndCheckFileException() {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Can't find file path!");
            return null;
        }
    }

    public void writeToListAndCheckFileException(List<String> list) {
        try {
            Files.write(path, list);
        } catch (IOException e) {
            System.out.println("Can't find file path!");
        }
    }

    public boolean checkIfInputIsNumber(String[] args, String string) {
        try {
            int i = Integer.parseInt(args[1]);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Unable to " + string + ": index is not a number");
            return false;
        }
    }

    public boolean checkIfIndexIsProvided(String[] args, String string) {
        if (args.length == 1) {
            System.out.println("Unable to " + string + ": no index provided");
            return false;
        }
        return true;
    }

    public boolean checkIfIndexIsOutOfBound(List<String> list, int index, String string) {
        try {
            String s = list.get(index);
            return true;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Unable to " + string + ": index is out of bound");
            return false;
        }

    }


}
