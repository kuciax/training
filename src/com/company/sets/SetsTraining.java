package com.company.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsTraining {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("Z");
        hashSet.add("f");
        hashSet.add("a"); 

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
