package com.company.tries;

import java.io.IOException;
import java.util.Scanner;


public class Application {

    public static void main(String[] args) throws IOException {
        TrieT9 trieT9 = new TrieT9();
        trieT9.insertFromFile("C:\\Users\\kucia\\Desktop\\slowa.txt");
        System.out.println("Podaj cyfry");
        Scanner scanner = new Scanner(System.in);
        trieT9.getMatchedWords(scanner.next());
        scanner.close();

    }


}

