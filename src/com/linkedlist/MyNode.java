package com.linkedlist;

public class MyNode {
    private int key;
    private MyNode next;                  //next is a type of node
    public MyNode(int key) {              //Constructor of same class
        this.key = key;
        this.next = null;
    }
    //Getters and setters
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public MyNode getNext() {
        return next;
    }
    public void setNext(MyNode next) {
        this.next = next;
    }
}
