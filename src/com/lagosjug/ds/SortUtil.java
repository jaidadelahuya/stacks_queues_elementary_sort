package com.lagosjug.ds;

public class SortUtil {

    //is item v less than item w?
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    //Swap item in array a[] at index i with the one at index j.
    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
