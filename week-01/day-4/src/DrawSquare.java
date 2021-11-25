public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that draws a square like this:
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as lineCount is
        int lineCount = 8;
        for (int i = 1; i <= lineCount; i++) {
            if (i==1 || i==lineCount){
                for (int j = 0; j < lineCount; j++) {
                    System.out.print("%");
                }
            }else{
                for (int j = 1; j <= lineCount; j++) {
                    if (j == 1 || j == lineCount){
                        System.out.print("%");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
