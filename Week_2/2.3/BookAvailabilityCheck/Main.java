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
        library.addBook(new Book("Data Structures and Algorithms", "Jane Doe", "2018"));
        library.displayBooks();

        library.isBookAvailable("The Art of Fiction");
        library.isBookAvailable("The Hundred-Year-Old Man Who Climbed Out the Window and Disappeared");
    }
}