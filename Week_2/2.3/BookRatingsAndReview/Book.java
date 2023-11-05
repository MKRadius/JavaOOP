public class Book {
    private String title;
    private String author;
    private String year;
    private double rating;
    private String review;

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
        this.rating = rating;
    }

    public double getRating() {
        return this.rating;
    }

    public void addReview(String review) {
        this.review = review;
    }

    public String getReview() {
        return this.review;
    }
}
