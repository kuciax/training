package com.company.tries;


public class Application {

    public static void main(String[] args) {
        Trie trie = new Trie();
        //trie.insertFromFile("C:\\Users\\kucia\\Desktop\\slowa.txt");
        trie.insert("aaaa");
        trie.insert("bbbb");
        System.out.println(trie.exists("2222"));


    }


}

