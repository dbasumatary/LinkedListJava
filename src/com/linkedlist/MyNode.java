package com.linkedlist;

public class MyNode<K> implements Interface<K> {
    private K key;
    private Interface<K> next;                  //next is a type of node
    public MyNode(K key) {                      //Constructor of same class
        this.key = key;
        this.next = null;
    }
    //Getters and setters
    @Override
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    @Override
    public Interface<K> getNext(){
        return next;
    }
    public void setNext(Interface<K> next) {
        this.next = next;
    }
}