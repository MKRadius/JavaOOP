package com.example.model;

import java.util.HashMap;

public class Dictionary {
    private static int dictionaryCount = 0;
    private int id;
    private String title;
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.id = ++dictionaryCount;
        this.title = "dictionary" + dictionaryCount;
        this.dictionary = new HashMap<>();
    }
    
    public Dictionary(String title) {
        this.id = ++dictionaryCount;
        this.title = title;
        this.dictionary = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void addWord(String word, String definition) {
        dictionary.put(word, definition);
    }

    public String getDefinition(String word) {
        if (!dictionary.containsKey(word)) {
            return "Word not found";
        }
        return dictionary.get(word);
    }

    public void removeWord(String word) {
        dictionary.remove(word);
    }

    public void editWord(String word, String definition) {
        if (!dictionary.containsKey(word)) {
            return;
        }
        dictionary.replace(word, definition);
    }

    public String toString() {
        return "Dictionary: " + title;
    }
}
