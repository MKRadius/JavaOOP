package com.example.model;

public class Note {
    private String title;
    private String content;

    public Note() {
        this.title = "";
        this.content = "";
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void add(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void remove(String title) {
        this.title = "";
        this.content = "";
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getContentWithTitle(String title) {
        return this.content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\nContent: " + this.content;
    }
}
