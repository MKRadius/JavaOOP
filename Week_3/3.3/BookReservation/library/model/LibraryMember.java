package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private static int totalMember = 0;

    private String name;
    private int memberId;
    private List<Book> reservedBooks = new ArrayList<>();

    public static int getTotalMemeber() {
        return totalMember;
    }

    public LibraryMember(String name) {
        this.name = name;
        this.memberId = ++totalMember;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}
