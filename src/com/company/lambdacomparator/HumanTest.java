package com.company.lambdacomparator;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void testPreLambdaSort() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Sarah", 10));
        humans.add(new Human("Jack", 12));

        humans.sort((Human h1, Human h2)->h1.getName().compareTo(h2.getName()));
        assertEquals("Jack", humans.get(0).getName());

    }

}