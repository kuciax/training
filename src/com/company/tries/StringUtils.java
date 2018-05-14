package com.company.tries;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringUtils {

    public static String toT9(String word) {
        word = word.toLowerCase();
        word = deAccent(word);
        StringBuilder stringBuilder = new StringBuilder(word.length());

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);
            int t9 = 0;
            if (c == 'ł') c = 'l';

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

    public static String deAccent(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }
}
