package com.company.tries;

import java.io.*;
import java.util.*;

public class TrieT9 {

    private TrieNode root;


    public TrieT9() {
        root = new TrieNode();
    }

    public void insert(String string) {
        
        String wordT9 = StringUtils.toT9(string);
        TrieNode current = root;

        for (int i = 0; i < wordT9.length(); i++) {
            current = current.getChildren()
                    .computeIfAbsent(wordT9.charAt(i), character -> new TrieNode());
        }
        current.setEndOfWord(true);
        current.addWord(string);
    }


    public List<String> getWords(String digitString) {

        List<String> words = new ArrayList<>();
        TrieNode current = root;

        for (int i = 0; i < digitString.length(); i++) {
            char ch = digitString.charAt(i);

            TrieNode node = current.getChildren().get(ch);

            if (node == null) {
                return Collections.emptyList();
            }
            current = node;

        }
        return current.getWords();
    }


    public void insertFromFile(String filePath) throws IOException {
        System.out.println("Nastąpi wczytanie wyrazów z pliku txt");
        load(filePath);
    }


    private void load(String filePath) throws IOException {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            System.out.println("Plik odnaleziono");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;
        while ((line = reader.readLine()) != null) {
            insert(line);
        }
        reader.close();
    }


    public void getMatchedWords(String word) {

        List<String> currentList = new ArrayList<>();
        currentList = getWords(word);
        int numberOfWords = currentList.size();
        int currentNumber;

        if (currentList.isEmpty() || word.isEmpty())
            System.out.println("Niestety, nie znaleźliśmy słów, które odpowiadają twojemu zapytaniu");

        else {
            if (numberOfWords > 5)
                currentNumber = 5;
            else currentNumber = numberOfWords;

            System.out.println("Liczba wystąpień w słowniku " + numberOfWords + "\n" +
                    "Przykłady: ");
            for (int i = 0; i < currentNumber; i++) {
                System.out.println(currentList.get(i));
            }
        }
    }

}


