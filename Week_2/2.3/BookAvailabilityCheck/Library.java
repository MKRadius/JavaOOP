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

    public void borrowBook(String title) {
        Book borrow = null;

        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                borrow = book;
                break;
            }
        }

        if (borrow != null) {
            System.out.println("Borrowed: \"" + borrow.getTitle() + "\"");
            bookList.remove(borrow);
        }
        else {
            System.out.println("Book with title \"" + title + "\" not found");
        }
    }

    public void returnBook(Book book) {
        bookList.add(book);
    }

    public boolean isBookAvailable(String title) {
        boolean isAvailable = false;

        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                isAvailable = true;
                break;
            }
        }

        if (isAvailable) {
            System.out.println("Book with title \"" + title + "\" is available");
        }
        else {
            System.out.println("Book with title \"" + title + "\" is unavailable");
        }

        return isAvailable;
    }
}