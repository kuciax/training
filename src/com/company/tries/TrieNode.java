package com.company.tries;

import java.util.ArrayList;
import java.util.HashMap;

public class TrieNode {

    private boolean isEndOfWord;
    private HashMap<Character, TrieNode> children;
    private ArrayList<String> words;

    public TrieNode() {

        children = new HashMap<>();
        words = new ArrayList<String>();
    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.isEndOfWord = endOfWord;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void addWord(String word) {
        words.add(word);
    }

    public ArrayList<String> getWords() {
        return words;
    }
}
