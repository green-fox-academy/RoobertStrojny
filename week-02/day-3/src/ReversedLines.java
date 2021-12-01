import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        Path path = Paths.get("reversedlines.txt");
        reverse(path);
    }

    private static void reverse(Path path) {
        try {
            Path reversedPath = Paths.get("reversedlistfixed.txt");
            List<String> lines = Files.readAllLines(path);  // getting list with lines
            List<String> linesFinal = new ArrayList<>();
            String[] linesArray = lines.toArray(new String[0]);   // list to string
            StringBuilder sb = new StringBuilder();
            for (String s : linesArray){    // using stringbuilder to reverse each line and adding to the linesFinal list
                sb.append(s);
                sb.reverse();
                linesFinal.add(sb.toString());
                sb.replace(0, sb.length(), "");    // resetting stringbuilder
            }

            Files.write(reversedPath, linesFinal);
        } catch (IOException e) {
            System.out.println("CANT READ FILE!!");;
        }
    }
}
