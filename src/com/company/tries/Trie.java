package com.company.tries;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Trie {

    private TrieNode root;
    private ArrayList<String> dictionary;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String string) {
        String s = toT9(string);
        TrieNode current = root;

        for (int i = 0; i < s.length(); i++) {
            current = current.getChildren()
                    .computeIfAbsent(s.charAt(i), character -> new TrieNode());
        }
        current.setEndOfWord(true);
        current.addWord(string);
    }

    public List<String> exists(String s) {

        List<String> words = new ArrayList<>();
        TrieNode current = root;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            TrieNode node = current.getChildren().get(ch);
            current = node;
        }

        return current.getWords();
    }

    public static String toT9(String word) {
        word = word.toLowerCase();
        StringBuilder sb = new StringBuilder(word.length());

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int t9;

            if (c < 'a' || c > 'z')
                return sb.toString();
            else if (c >= 'a' && c <= 'c')
                t9 = 2;
            else if (c >= 'd' && c <= 'f')
                t9 = 3;
            else if (c >= 'g' && c <= 'i')
                t9 = 4;
            else if (c >= 'j' && c <= 'l')
                t9 = 5;
            else if (c >= 'm' && c <= 'o')
                t9 = 6;
            else if (c >= 'p' && c <= 's')
                t9 = 7;
            else if (c >= 't' && c <= 'v')
                t9 = 8;
            else // if (c >= 'w' && c <= 'z')
                t9 = 9;

            sb.append(t9);
        }

        return sb.toString();
    }

    public void insertFromFile(String filePath) {
        load(filePath);
        for(String word :dictionary){
            insert(word);
        }
        System.out.println("Udało się!");
    }



    private void load(String filePath) {
        Scanner s = null;
        try {
            s = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (s.hasNext()) {
            dictionary.add(s.next());
        }
        s.close();
    }

}


