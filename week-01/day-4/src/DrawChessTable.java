public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        int lineChess = 8;
        int position = 1;
        for (int i = 1; i <= lineChess; i++) {
            for (int j = 0; j  < lineChess; j++) {
                if (position % 2 == 1) {
                    System.out.print("%");
                }else if(position % 2 == 0) {
                    System.out.print(" ");
                }
                ++position;
            }
            ++position;
            System.out.println();
        }
    }
}
