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


        // book1 with 3 ratings - avg: 4.47
        book1.setRating(4.8);
        book1.setRating(4.2);
        book1.setRating(4.4);
        // book2 with 2 ratings - avg: 4.3
        book2.setRating(4.1);
        book2.setRating(4.5);
        // book1 with 1 rating - avg: 4.7
        book3.setRating(4.7);
        // Average rating should be 4.49

        System.out.println("Average rating of all books: " + String.format("%.2f", library.getAverageBookRating()));
        System.out.println("");


        // book1 with 2 reviews
        book1.addReview("Amazing");
        book1.addReview("Eh");
        // book1 with 3 reviews
        book2.addReview("Good");
        book2.addReview("Confusing");
        book2.addReview(":D");
        // book1 with 1 review
        book3.addReview("Great");
        // Should display book2 (DSA) as most reviewed

        System.out.println("Most reviewed book: \"" + library.getMostReviewedBook().getTitle() + "\"");
        System.out.println("");
    }
}