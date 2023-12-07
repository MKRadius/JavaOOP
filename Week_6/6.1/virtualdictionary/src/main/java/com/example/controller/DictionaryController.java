package com.example.controller;

import com.example.model.Dictionary;

public class DictionaryController {
    private Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();
    }

    public void addWordToDictionary(String word, String meaning) {
        dictionary.addWord(word, meaning);
    }

    public String searchWordInDictionary(String word) {
        return dictionary.getDefinition(word);
    }
}