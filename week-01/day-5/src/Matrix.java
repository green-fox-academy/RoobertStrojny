public class Matrix {
    public static void main(String[] args) {
        // - Create a two dimensional array dynamically with the following content.
        //   Note that a two dimensional array is often called matrix if every
        //   internal array has the same length.
        //   Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        //   Its length should depend on a variable
        //
        // - Print this two dimensional array to the output
        int matrixLeng = 7;
        int matrix[][] = new int[matrixLeng][matrixLeng];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrixLeng; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] = 1);
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
