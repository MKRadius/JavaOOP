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

    public void userBorrowBook(String title, User user) {
        Book borrow = null;

        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                borrow = book;
                break;
            }
        }

        if (borrow != null) {
            System.out.println("User \"" + user.getName() + "\" borrowed: \"" + borrow.getTitle() + "\"");
            System.out.println("");
            
            bookList.remove(borrow);
            user.borrowBook(borrow);
        }
        else {
            System.out.println("Book with title \"" + title + "\" not found");
        }
    }

    public void userReturnBook(Book book, User user) {
        user.returnBook(book);
        bookList.add(book);
        System.out.println("User \"" + user.getName() + "\" returned: \"" + book.getTitle() + "\"");
        System.out.println("");
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

    public double getAverageBookRating() {
        double sumRatingOfAllbook = 0;

        for (Book book : bookList) {
            sumRatingOfAllbook += book.getRating();
        }

        return sumRatingOfAllbook / bookList.size();
    }

    public Book getMostReviewedBook() {
        int index = 0;
        int mostReviewed = 0;

        for (Book book : bookList) {
            if (book.getReview().size() >= mostReviewed) {
                index = bookList.indexOf(book);
            }
        }

        return bookList.get(index);
    }
}