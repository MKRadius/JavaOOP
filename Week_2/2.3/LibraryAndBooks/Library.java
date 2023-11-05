import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void displayBooks() {
        System.out.println("Library catalog:");

        for (Book book : bookList) {
            System.out.println((bookList.indexOf(book) + 1) + ". Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\", Year: " + book.getYear());
        }

        System.out.println("");
    }

    public void findBookByAuthor(String author) {
        System.out.println("Books by author \"" + author + "\"");

        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + book.getYear());
            }
        }

        System.out.println("");
    }
}