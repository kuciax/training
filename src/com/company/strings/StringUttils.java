package com.company.strings;

import java.util.Optional;

public class StringUttils {
    public static String removeLastChar(String string) {
        return Optional.ofNullable(string)
                .filter(s -> s.length() != 0)
                .map(s -> s.substring(0, s.length() - 1))
                .orElse(string);
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static String reverseAllLettersInSentence(String s) {
        String[] string = s.split(" ");
        String dest = "";
        for (int i = string.length - 1; i >= 0; i--) {
            dest += string[i] + " ";
        }

        return dest;
    }

    public static boolean isPalindrome(String string){
        return string.equals(new StringBuilder(string).reverse().toString());
    }


}
