import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Introduction to Java Programming", "John Smith", "9780130319975");
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", "8210568109653");
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", "9183275013871");

        LibraryMember member1 = new LibraryMember("Member One");
        LibraryMember member2 = new LibraryMember("Member Two");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addMember(member1);
        library.addMember(member2);

    }
}
