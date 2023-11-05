import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String year;
    private ArrayList<Double> rating = new ArrayList<>();
    private ArrayList<String> review = new ArrayList<>();



    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYear() {
        return this.year;
    }

    public void setRating(double rating) {
        this.rating.add(rating);
    }

    public double getRating() {
        double sumRating = 0;

        for (Double rt : rating) {
            sumRating += rt;
        }

        return sumRating / rating.size();
    }

    public void addReview(String review) {
        this.review.add(review);
    }

    public ArrayList<String> getReview() {
        return this.review;
    }
}
