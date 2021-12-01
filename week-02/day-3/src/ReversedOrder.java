import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        Path path = Paths.get("reversed-order.txt");
        reverseOrder(path);
    }

    private static void reverseOrder(Path path) {
        try {
            Path finalPath = Paths.get("reversed-order-output.txt");
            List<String> lines = Files.readAllLines(path);
            Collections.reverse(lines);           //reversing order of lines
            Files.write(finalPath, lines);

        } catch (IOException e) {
            System.out.println("FILE NOT FOUND :(");
        }
    }
}
