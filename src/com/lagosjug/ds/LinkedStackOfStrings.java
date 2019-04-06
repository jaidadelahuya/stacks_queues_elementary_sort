package com.lagosjug.ds;

public class LinkedStackOfStrings {

    private Node first = null;


    public boolean isEmpty() {
        return first == null;
    }


    public void push(String item) {
        // 1. maintain pointer to first node
        Node oldfirst = first;

        // 2. create a new node
        first = new Node();
        first.item = item;

        //3. set the next property of the new node to the old first
        first.next = oldfirst;
    }

    public String pop() {

        // 1. save away the value of the first node
        String item = first.item;

        //2. assign the first node to the second node at the top of the stack
        first = first.next;

        //3. return the saved away value of the old first node
        return item;
    }
}
