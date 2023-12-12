package com.example.model;

import java.util.ArrayList;

public class Notebook {
    private ArrayList<Note> notebook;

    public Notebook() {
        this.notebook = new ArrayList<Note>();
    }

    public Note getNoteWithTitle(String title) {
        for (Note note : this.notebook) {
            if (note.getTitle().equals(title)) {
                return note;
            }
        }
        return null;
    }

    public void add(String title, String content) {
        this.notebook.add(new Note (title, content));
    }

    public void remove(String title) {
        for (Note note : this.notebook) {
            if (note.getTitle().equals(title)) {
                this.notebook.remove(note);
                break;
            }
        }
    }
    
    public void editContent(String title, String content) {
        for (Note note : this.notebook) {
            if (note.getTitle().equals(title)) {
                note.setContent(content);
                break;
            }
        }
    }
}
