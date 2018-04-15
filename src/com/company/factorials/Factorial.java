package com.company.factorials;

public class Factorial {
    public static long calc(int num){
        if(num==0) return 1;
        else return num*calc(num-1);
    }
}
