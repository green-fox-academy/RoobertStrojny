public class Strings3 {
    public static void main(String[] args) {
        // Given a string, write a recursive (no loops) method which returns a new
        // string with all adjacent chars separated by an `*`. Please note that there
        // should be no trailing `*` at the end of the returned string. For example,
        // the string `word` should be changed to `w*o*r*d`.

        String randomString = "wordiestword";
        System.out.println(makeStringPretty(randomString));
    }

    private static String makeStringPretty(String string) {

        if (string.length() == 1) {
            return string;
        }

        return string.charAt(0) + "*" + makeStringPretty(string.substring(1));
    }
}
