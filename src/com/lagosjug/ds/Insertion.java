package com.lagosjug.ds;

public class Insertion {

    public static void sort(Comparable[] a) {

        //1. get the length of the array
        int N = a.length;

        //2. iterate through the array and maintain pointer
        for (int i = 0; i < N; i++){

            //3. iterate backwards
            for (int j = i; j > 0; j--) {

                //4. check if item in position j is less than item in position (j-1)
                if (SortUtil.less(a[j], a[j-1])) {

                    //5. swap positions of item at position j with item at position i
                    SortUtil. exch(a, j, j-1);
                }else {
                    break;
                }
            }

        }
    }
}
