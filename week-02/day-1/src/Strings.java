public class Strings {
    public static void main(String[] args) {
        //simpleReplace();
        //urlFixer();
        //takesLonger();
        toDoPrint();
    }

    private static void toDoPrint() {
        String todoText = " - Buy milk\n";
        // Add "My todo" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying indention
        // Expected output:
        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder sb = new StringBuilder(todoText);
        todoText = sb.insert(0, "My todo:\n").toString();
        todoText = sb.insert(todoText.lastIndexOf("\n"), "\n - Download games\n").toString();
        todoText = sb.insert(todoText.lastIndexOf("\n"), "\t - Diablo").toString();
        

        System.out.println(todoText);

    }

    private static void takesLonger() {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
        // Use pieces of the `quote` variable, e.g. quote.substring(...), instead of just redefining the string!
        StringBuilder sb = new StringBuilder(quote);

        sb.insert(21,"always takes longer than ");
        System.out.println(sb.toString());
    }

    private static void urlFixer() {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        // first method
        //url.replace("bots", "odds");
        //String newUrl = url.replace("https", "https:");
        //System.out.println(newUrl);

        StringBuilder sb = new StringBuilder(url);   //second method
        sb.insert(5, ':');
        sb.replace(39,43, "odds");
        System.out.println(sb.toString());



    }

    public static void simpleReplace(){
        String example = "In a dishwasher far, far away";

        example.replace("dishwasher", "galaxy");

        // I would like to replace "dishwasher" with "galaxy" in this example variable, but it has a problem
        // Please fix it for me!
        // Expected output: In a galaxy far, far away

        System.out.println(example.replace("dishwasher", "galaxy"));

    }

}
