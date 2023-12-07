package com.example.model;

import java.util.HashMap;

public class Note {
    private HashMap<String, String> note;

    public Note() {
        this.note = new HashMap<String, String>();
    }

    public void add(String key, String value) {
        this.note.put(key, value);
    }

    public String get(String key) {
        return this.note.get(key);
    }

    public void remove(String key) {
        this.note.remove(key);
    }

    public void update(String key, String value) {
        this.note.replace(key, value);
    }

    public String toString() {
        return "Title: " + this.note.keySet().toArray()[0] + "\nContent: " + this.note.values().toArray()[0];
    }
}
