public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Introduction to Java Programming", "John Smith", "2020");
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", "2018");
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", "2019");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.findBookByAuthor("Jane Doe");

        library.borrowBook("Data Structures and Algorithms");
        library.displayBooks();
        library.addBook(book2);
        library.displayBooks();

        library.isBookAvailable("The Art of Fiction");
        library.isBookAvailable("The Hundred-Year-Old Man Who Climbed Out the Window and Disappeared");
        System.out.println("");

        book1.setRating(4.8);
        book2.setRating(4.5);
        book3.setRating(4.7);

        System.out.println("\"" + book1.getTitle() + "\" rating: " + book1.getRating());
        System.out.println("\"" + book2.getTitle() + "\" rating: " + book2.getRating());
        System.out.println("\"" + book3.getTitle() + "\" rating: " + book3.getRating());
        System.out.println("");

        book1.addReview("Amazing");
        book2.addReview("Good");
        book3.addReview("Great");

        System.out.println("\"" + book1.getTitle() + "\" review: " + book1.getReview());
        System.out.println("\"" + book2.getTitle() + "\" review: " + book2.getReview());
        System.out.println("\"" + book3.getTitle() + "\" review: " + book3.getReview());
    }
}