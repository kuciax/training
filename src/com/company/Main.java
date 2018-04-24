package com.company;


import com.company.linkedlist.LinkedListImpl;
import com.company.stackandqueues.QueueImpl;

import java.util.List;
import java.util.Queue;
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
        //Array array = new Array(10);
        //array.setRandomNums(5, 10);
        //array.printArray();
        //array.bubbleSort();
        //array.printArray();
        // Array array = new Array(10);
        //array.setRandomNums(1,100);
        //array.printArray();
        //System.out.println("*************");
        //ArrayUtils.quickSort(array.getInts(),0,9);
        //array.printArray();
//        LinkedListImpl linkedList = new LinkedListImpl();
//        linkedList.apped(1);
//        linkedList.apped(2);
//        linkedList.apped(3);
//        linkedList.apped(4);
//        linkedList.printList();
//        System.out.println("*********************");
//        System.out.println("1:"+linkedList.getValueOf(1));
//        System.out.println(linkedList.getValueOf(5));
//
        QueueImpl queue = new QueueImpl();
        queue.add(2);
        queue.add(3);
        queue.printList();


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
