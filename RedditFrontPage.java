import java.util.ArrayList;

public class RedditFrontPage {

    private ArrayList<RedditPost> posts;

    public RedditFrontPage() {
        this.posts = new ArrayList<RedditPost>();
    }

    // Add a post to the list
    public void addPost(RedditPost post) {
        this.posts.add(post);
    }

    // Remove a post from the list by its index
    public void removePost(int index) {
        if (index >= 0 && index < this.posts.size()) {
            this.posts.remove(index);
        }
    }

    // Get the list of posts
    public ArrayList<RedditPost> getPosts() {
        return this.posts;
    }
}
