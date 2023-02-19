package com.linkedlist;

public class LinkedListMain {
    public static void createLinkedList(Integer key1, Integer key2, Integer key3){          //new method
        MyNode<Integer> nodeOne = new MyNode<>(key1);
        MyNode<Integer> nodeTwo = new MyNode<>(key2);
        MyNode<Integer> nodeThree = new MyNode<>(key3);

        LinkedList linkedList = new LinkedList();               //creating new LinkedList object of class LinkedList
        //Calling the method append from another class
        linkedList.append(nodeOne);
        linkedList.append(nodeTwo);
        linkedList.append(nodeThree);

        //Calling the method displayNode from another class
        linkedList.display();
    }
    public static void main(String[] args) {
        createLinkedList(56,30,70);                 //calling the method
    }
}
