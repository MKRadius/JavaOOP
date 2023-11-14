package system;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.LibraryMember;

public class Library {
    List<Book> books = new ArrayList<>();
    List<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book successfully added");
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member successfully added");

    }

    public void borrowBook(LibraryMember member, Book book) {
        boolean libHasBook = false;

        for (Book libBook : books) {
            if (libBook.isSame(book)) {
                libHasBook = true;
                break;
            }
        }
        
        if (libHasBook) {
            books.remove(book);
            member.borrowFromLib(book);

            System.out.println("Member " + member.getMemberId() + " borrowed: " + book.getTitle());
        }
        else {
            System.out.println("Book unavailable at library");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        boolean memHasBook = false;

        for (Book memBook : member.getBorrowedBooks()) {
            if (memBook.isSame(book)) {
                memHasBook = true;
                break;
            }
        }
        
        if (memHasBook) {
            member.returnToLib(book);
            books.add(book);
            
            System.out.println("Member " + member.getMemberId() + " returned: " + book.getTitle());
        }
        else {
            System.out.println("Member lost the book");
        }
    }
}
