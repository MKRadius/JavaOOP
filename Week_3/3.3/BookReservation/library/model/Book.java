package model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean reserved = false;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public boolean isSame(Book book) {
        if (this.title  == book.getTitle() && 
            this.author == book.getAuthor() && 
            this.isbn   == book.getIsbn()) {
            return true;
        }
        else return false;
    }

    public boolean isReserved() {
        return this.reserved;
    }
}
