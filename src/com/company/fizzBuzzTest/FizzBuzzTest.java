package com.company.fizzBuzzTest;

public class FizzBuzzTest {
    public static void run() {
        String fizz = "fizz";
        String buzz = "buzz";
        for (int i = 0; i < 100; i++) {
            if (i % 15 == 0) System.out.println(fizz + " " + buzz + " " + i);
            else if (i % 3 == 0) System.out.println(fizz + " " + i);
            else if (i % 5 == 0) System.out.println(buzz + " " + i);
            else System.out.println(i);

        }
    }
}
