package com.company.tries;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TrieT9 {

    private TrieNode root;

    public TrieT9() {
        root = new TrieNode();
    }

    public void insert(String string) {
        String wordT9 = toT9(string);
        TrieNode current = root;

        for (int i = 0; i < wordT9.length(); i++) {
            current = current.getChildren()
                    .computeIfAbsent(wordT9.charAt(i), character -> new TrieNode());
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
            if (node == null) {
                return Collections.emptyList();
            }
            current = node;

        }
        return current.getWords();
    }


    public static String toT9(String word) {
        word = word.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(word.length());

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int t9 = 0;

            if (c < 'a' || c > 'z')
                return stringBuilder.toString();
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
            else if (c >= 'w' && c <= 'z')
                t9 = 9;

            stringBuilder.append(t9);
        }

        return stringBuilder.toString();
    }


    public void insertFromFile(String filePath) throws FileNotFoundException {
        load(filePath);
        System.out.println("Udało się! Słowa z pliku tekstowego zostały wczytane");
    }


    private void load(String filePath) throws FileNotFoundException {
        Scanner s = new Scanner(new File(filePath));
        while (s.hasNext()) {
            insert(s.next());
        }
        s.close();
    }

    public void getMatchedWords(String word) {
        List<String> currentList = new ArrayList<String>();
        currentList = exists(word);
        int numberOfWords = currentList.size();
        int currentNumber;

        if (currentList.isEmpty())
            System.out.println("Niestety, nie znaleźliśmy słów, które odpowiadają twojemu zapytaniu");
        else {
            if (numberOfWords > 5)
                currentNumber = 5;
            else currentNumber = numberOfWords;

            System.out.println("W slowniku znajduje sie " + numberOfWords +
                    " słów, które odpowiadają podanemu zapytaniu, oto kilka z nich: ");
            for (int i = 0; i < currentNumber; i++) {
                System.out.println(currentList.get(i));
            }
        }
    }

}


