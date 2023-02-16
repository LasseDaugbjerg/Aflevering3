import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*  for (int i = 0; i < 10; i++) */
        {
            /*  System.out.println(getRandomNumber()); */

          /*  Scanner sc = new Scanner(System.in);
            System.out.print("Enter your CPR number: ");
            String cpr = sc.nextLine();
            if (isValidCPR(cpr)) {
                System.out.println("Your CPR number is valid.");
            } else {
                System.out.println("Your CPR number is not valid.");
            }
            sc.close(); */

            ArrayList<Article> articles = new ArrayList<>();

            articles.add(new Article("Lasse Rasmussen", "BREAKING NEWS, KEA LUKKER!"));
            articles.add(new Article("Willy William", "AFSLØRING: Lasse lyver"));
            articles.add(new Article("Gucci Prada", "Få dit designertøj her!"));
            articles.add(new Article("Lasse Daugbjerg", "Hvad sker der for medierne?"));
            articles.add(new Article("Lass Bass", "Java is still very much alive!"));

            for (Article article : articles) {
                System.out.println(article);
            }
        }

// Opgave A //
 /*
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    } */

        // Opgave B //
   /* public static boolean isValidCPR(String cpr) {
        if (cpr.length() != 10) {
            return false;
        }
        int dayDate = Integer.parseInt(cpr.substring(0, 2));
        int monthDate = Integer.parseInt(cpr.substring(2, 4));
        if (dayDate > 31 || monthDate > 12) {
            return false;
        }
        return true;
    } */

        // Opgave C //
        // Article.java //

        // Opgave D //
        //Square.java //
        List<Square> squareListed = new ArrayList<>();
        squareListed.add(new Square(4, 4));
        squareListed.add(new Square(2, 6));
        squareListed.add(new Square(3, 8));
        squareListed.add(new Square(2, 5));

        Collections.sort(squareListed);

        for (Square square : squareListed) {
            System.out.println(square.getPerimeter());
        }

        // Opgave E //
        // RedditPost.java //
        RedditPost newPost = new RedditPost("LassBass", "Så er der nyt på reddit!!");

        // Print out the initial values of the post's attributes here
        System.out.println("The author is: " + newPost.getAuthor());
        System.out.println("Title: " + newPost.getTitle());
        System.out.println("Post-Date is: " + newPost.getPostDate());
        System.out.println("Upvotes are: " + newPost.getUpvotes());
        System.out.println("Downvotes are: " + newPost.getDownvotes());

        // Set the upvotes and downvotes for the post here
        newPost.setUpvotes(5);
        newPost.setDownvotes(3);

        // Print out the updated values of the post's attributes here
        System.out.println("Author: " + newPost.getAuthor());
        System.out.println("Title: " + newPost.getTitle());
        System.out.println("Post-Date: " + newPost.getPostDate());
        System.out.println("Upvotes: " + newPost.getUpvotes());
        System.out.println("Downvotes: " + newPost.getDownvotes());

        // Opgave F //
        // RedditFrontPage.java//

        RedditFrontPage frontPage = new RedditFrontPage();

        // Add some posts to the front page
        frontPage.addPost(new RedditPost("Hans Hansen", "Heres a new post1"));
        frontPage.addPost(new RedditPost("Lars Larsen", "Here is a new post2"));
        frontPage.addPost(new RedditPost("Peter Petersen", ".. And here is a new post3"));

        // Print out the initial list of posts
        System.out.println("List of posts:");
        for (RedditPost post : frontPage.getPosts()) {
            System.out.println(post.getTitle() + " by " + post.getAuthor());
        }

        // Remove the second post (index 1)
        frontPage.removePost(1);

        // Print out the updated list of posts
        System.out.println("The new updated list of posts:");
        for (RedditPost post : frontPage.getPosts()) {
            System.out.println(post.getTitle() + " by " + post.getAuthor());
        }

    }
}