package blogpost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> listOfBlogs;

    public Blog(){
        listOfBlogs = new ArrayList<>();
    }

    public void add(BlogPost blogPost){
        listOfBlogs.add(blogPost);
    }

    public void delete(int index){
        listOfBlogs.remove(index);
    }

    public void update(int index, BlogPost blogPost){
        listOfBlogs.remove(index);
        listOfBlogs.add(index, blogPost);
    }

    public static void main(String[] args) {
        BlogPost blogPost1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet."
                , "2000.05.04.");
        BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why"
                , "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost blogPost3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump"
                , "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention." +
                " When I asked to take his picture outside one of IBM’s New York City offices," +
                " he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

        Blog blog = new Blog();

        blog.add(blogPost1);
        blog.add(blogPost2);
        blog.delete(1);
        blog.add(blogPost2);
        blog.update(1, blogPost3);
    }
}
