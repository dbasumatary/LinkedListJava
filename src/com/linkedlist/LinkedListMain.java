package com.linkedlist;
/*Creating Linked List by inserting 30 to 56 and 70*/

public class LinkedListMain {
    public static void createLinkedList(Integer key1, Integer key2, Integer key3){          //new method
        MyNode<Integer> nodeOne = new MyNode<>(key1);
        MyNode<Integer> nodeTwo = new MyNode<>(key2);
        MyNode<Integer> nodeThree = new MyNode<>(key3);

        LinkedList linkedList = new LinkedList();               //creating new LinkedList object of class LinkedList
        linkedList.append(nodeOne);                       //appending first node
        linkedList.append(nodeThree);                     //appending second node

        MyNode<Integer> nodeInsert = new MyNode<>(key2);
        linkedList.insert(nodeOne,nodeInsert);                   //using insert method to add new node
        System.out.println(30 + " has been inserted in the linked list between nodes "+ key1 + " and " + key3);
        linkedList.display();
    }
    public static void main(String[] args) {
        createLinkedList(56,30,70);                 //calling the method
    }
}
