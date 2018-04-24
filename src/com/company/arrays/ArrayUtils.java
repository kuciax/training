package com.company.arrays;

public class ArrayUtils {
    public static void quickSort(int [] ints, int l, int r) {
        int p, q,tmp;
        p = l ;
        q = r;
        int x = ints[(p + q) / 2];
        do {
            while (ints[p] < x)
                p++;
            while (ints[q] > x)
                q--;
            if (p <= q) {
                tmp = ints[p];
                ints[p] = ints[q];
                ints[q] = tmp;
                p++;
                q--;
            }
        } while (p <= q);
        if (l<q) quickSort(ints,l,q);
        if (p<r) quickSort(ints,p,r);
    }

}
