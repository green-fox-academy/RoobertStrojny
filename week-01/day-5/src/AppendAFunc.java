public class AppendAFunc {
    public static void main(String[] args) {
        //  Create the usual class wrapper and main method on your own

        // - Create a string variable named `typo` and assign the value `Chinchill` to it
        // - Write a function called `appendA()` that gets a string as an input,
        //   appends an 'a' character to its end and returns the modified string
        //
        // - Print the result of `appendA(typo)`

        String typo = "Chinchill";
        appendA(typo);
    }

    public static void appendA(String add){
        System.out.println(add + 'a');
    }
}
