public class Strings {
    public static void main(String[] args) {
        //simpleReplace();
        urlFixer();

    }

    private static void urlFixer() {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
        url.replace("bots", "odds");
        String newUrl = url.replace("https", "https:");
        System.out.println(newUrl);
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
