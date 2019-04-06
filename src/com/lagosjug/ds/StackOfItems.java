package com.lagosjug.ds;

public class StackOfItems<Item> {
    //pointer to the top node
    private Node first = null;

    //definition of a node
    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }
    public void push(Item item) {
        // 1. maintain pointer to first node
        Node oldfirst = first;

        // 2. create a new node
        first = new Node();
        first.item = item;

        //3. set the next property of the new node to the old first
        first.next = oldfirst;
    }

    public Item pop() {

        // 1. save away the value of the first node
        Item item = first.item;

        //2. assign the first node to the second node at the top of the stack
        first = first.next;

        //3. return the saved away value of the old first node
        return item;
    }

}
