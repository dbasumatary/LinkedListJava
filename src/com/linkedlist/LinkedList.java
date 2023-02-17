package com.linkedlist;
/*Creating a simple linked list of 56, 30 and 70*/

public class LinkedList {
    public static void main(String[] args) {
        MyNode nodeOne = new MyNode(56);
        MyNode nodeTwo = new MyNode(30);
        MyNode nodeThree = new MyNode(70);
        //Linking the nodes one after the other
        nodeOne.setNext(nodeTwo);
        nodeTwo.setNext(nodeThree);

        System.out.println(nodeOne.getKey() + " --> " + nodeTwo.getKey() + " --> " + nodeThree.getKey());
    }
}
