import postit.PostIt;

public class Main {
    public static void main(String[] args) {
        createPostItObjects();


    }

    public static void createPostItObjects(){
        PostIt postIt1 = new PostIt("orange", "Idea 1", "blue");
        PostIt postIt2 = new PostIt("pink", "Awesome", "yellow");
        PostIt postIt3 = new PostIt("yellow", "Superb!", "green");
    }
}
