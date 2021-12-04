import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TicTacToe {
    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file's content
        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    private static String ticTacResult(String path) {
        Path getPath = Paths.get(path);
        try {
            String ticTacString = Files.readString(getPath);
            String[] board = ticTacString.replaceAll("\r\n", "").split("");  //String array with X or O only

            for (int i = 0; i < 8; i++) {
                String line = null;

                switch (i){
                    case 0:
                        line = board[0] + board[1] + board[2];
                        break;
                    case 1:
                        line = board[3] + board[4] + board[5];
                        break;
                    case 2:
                        line = board[6] + board[7] + board[8];
                        break;
                    case 3:
                        line = board[0] + board[3] + board[6];
                        break;
                    case 4:
                        line = board[1] + board[4] + board[7];
                        break;
                    case 5:
                        line = board[2] + board[5] + board[8];
                        break;
                    case 6:
                        line = board[0] + board[4] + board[8];
                        break;
                    case 7:
                        line = board[2] + board[4] + board[6];
                        break;
                }

                if (line.equals("XXX")){
                    return "X";
                }else if (line.equals("OOO")){
                    return "O";
                }
            }

        } catch (IOException e) {
            return "FILE NOT FOUND :(";
        }

        return "Draw";

    }
}
