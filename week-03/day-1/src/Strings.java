import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars changed to 'y' chars.

        String randomString = "xxXoooxxxoooxxx";
        System.out.println(changeXtoY(randomString));
    }

    private static String changeXtoY(String string) {
        if (string.length() < 1) {
            return string;
        }

        if (string.charAt(0) == 'x'){
            string = 'y' + string.substring(1);
        }
        return string.charAt(0) + changeXtoY(string.substring(1));

    }
}
