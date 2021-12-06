public class String2 {
    public static void main(String[] args) {
        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars removed.
        String randomString = "xhxxxexxlxxlxxxoxxx";
        System.out.println(removeX(randomString));
    }

    private static String removeX(String string) {
        if (string.length() < 1){
            return string;
        }

        if (string.charAt(0) == 'x'){
            return removeX(string.substring(1));
        }

        return string.charAt(0) + removeX(string.substring(1));
    }
}
