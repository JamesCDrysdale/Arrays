package org.example;

public class WordCollection {
    private String[] words;

    public WordCollection() {
        this.words = new String[5]; // Array with room for 5 words
    }

    public int getWordCount() {
        return this.words.length;
    }
}
