package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private static int totalMember = 0;

    private String name;
    private int memberId;
    List<Book> borrowedBooks = new ArrayList<>();

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

    public void borrowFromLib(Book book) {
        borrowedBooks.add(book);
    }

    public void returnToLib(Book book) {
        borrowedBooks.remove(book);
    }
}
