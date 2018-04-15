package com.company;


import com.company.enums.EnumUtils;
import com.company.factorials.Factorial;
import com.company.fizzBuzzTest.FizzBuzzTest;
import com.company.strings.StringUttils;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //trainStream();
        //EnumUtils.iterateEnumByForEach();
        //EnumUtils.iterateEnumByStreams();
        // System.out.println(StringUttils.removeLastChar("abcd"));
        //FizzBuzzTest.run();
        // System.out.println(Factorial.calc(3));
        // System.out.println(StringUttils.reverseString("abcd"));
        //System.out.println(StringUttils.reverseAllLettersInSentence("new StringUtils method"));
        // System.out.println(StringUttils.isPalindrome("kajak"));

    }

    public static void trainGeneratingLong() {
        Long generatedLong = new Random().nextLong();
        System.out.println(generatedLong);

        Long leftLimit = 1L;
        Long rightLimit = 10L;
        System.out.println(leftLimit);
        System.out.println(rightLimit);

        Long nextLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        System.out.println(nextLong);
    }

    //Streams
    public static void trainStream() {
        Stream<Integer> aStream = Stream.of(1, 2, 3, 4, 5);
        //prepending
        Stream<Integer> newStream = Stream.concat(Stream.of(99), aStream);
        //  newStream.forEach(integer  -> System.out.println(integer));
        //appending
        Stream<String> bStream = Stream.of("a", "b", "c", "d", "e");
        Stream<String> newBStream = Stream.concat(bStream, Stream.of("A"));
        newBStream.forEach(integer -> System.out.println(integer));
        //inserting
        Stream<Double> cStream = Stream.of(1.1, 2.2, 3.3);
        Stream<Double> newCStream = insertInStream(cStream, 9.9, 3);
        newCStream.forEach(t -> System.out.println(t));

    }

    public static <T> Stream<T> insertInStream(Stream<T> stream, T elem, int index) {
        List<T> result = stream.collect(Collectors.toList());
        result.add(index, elem);
        return result.stream();
    }


}
