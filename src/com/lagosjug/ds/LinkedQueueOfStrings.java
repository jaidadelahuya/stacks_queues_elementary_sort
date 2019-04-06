package com.lagosjug.ds;

public class LinkedQueueOfStrings {

    //pointers the first and last nodes
    private Node first, last;

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(String item) {
        //1. maintain pointer to the last node
        Node oldlast = last;

        //2. create a new node and point the last node to it
        last = new Node();
        last.item = item;


        //3. check if queue is empty
        if (isEmpty()) {
            //assign last to first because its really the first node
            first = last;
        } else {
            // else set the next property of the old last to the new last node
            oldlast.next = last;
        }
    }

    public String dequeue() {
        //1. save away value in first node
        String item = first.item;

        //2. assign the first node to the second node
        first = first.next;

        //3. check if queue is empty
        if (isEmpty()) {
            //set last node to null
            last = null;
        }
        //4. return saved away value
        return item;
    }
}
