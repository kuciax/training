package com.company.arrays;

public class Array {

    private int[] ints;
    int length;

    public Array(int length) {

        this.length = length;
        ints = new int[length];
    }

    public void setRandomNums(int left, int right) {
        for (int i = 0; i < length; i++) {
            ints[i] = (int) (left + Math.random() * (right - left));
        }

    }

    public void printArray() {
        for (int i = 0; i < length; i++)
            System.out.println(ints[i]);
    }

    public void bubbleSort() {
        int tmp;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    tmp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = tmp;
                }
            }
        }

    }

    public int[] getInts() {
        return ints;
    }
}
