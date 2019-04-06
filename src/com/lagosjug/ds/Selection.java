package com.lagosjug.ds;

public class Selection {

    public static void sort(Comparable[] a) {
        //1. get the length of the array to be sorted
        int N = a.length;

        //iterate through the array
        for (int i = 0; i < N; i++) {
            //2. maintain pointer to the position where the next sorted element will be placed
            int min = i;
            //3・Identify index of minimum entry on right.
            for (int j = i+1; j < N; j++) {
                if (SortUtil.less(a[j], a[min])) {
                    min = j;
                }
            }
            //4.
            SortUtil.exch(a, i, min);
        }
    }
}
