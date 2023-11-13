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

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
