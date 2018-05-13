package com.company.tries;


import java.io.FileNotFoundException;

public class Application {

    public static void main(String[] args) {
        TrieT9 trieT9 = new TrieT9();
        try {
            trieT9.insertFromFile("C:\\Users\\kucia\\Desktop\\slowa.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        trieT9.getMatchedWords("");


    }


}

