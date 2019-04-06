package com.lagosjug.ds;

public class ArrayStackOfStringsFixed {
    //Array to be used
    private String[] s;

    //pointer to the top of the stack
    private int N = 0;

    public ArrayStackOfStringsFixed(int capacity) {
        //initialize the array
        s = new String[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String item) {
        //Add an item to the top of the stack
        //then increment the pointer by 1
        s[N++] = item;
    }

    public String pop() {
        //1. decrement the pointer by 1
        //2. save away the item at the top position
        String item = s[--N];

        //3. set the item at the top position to null to avoid loitering
        s[N] = null;

        //4. return saved away item
        return item;
    }
}
