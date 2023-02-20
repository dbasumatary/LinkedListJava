package com.linkedlist;
/*Creating Linked List by popping 56 from the stack*/

public class LinkedListMain {
    public static void createLinkedList(Integer key1, Integer key2, Integer key3){          //new method
        MyNode<Integer> nodeOne = new MyNode<>(key1);
        MyNode<Integer> nodeTwo = new MyNode<>(key2);
        MyNode<Integer> nodeThree = new MyNode<>(key3);

        LinkedList linkedList = new LinkedList();               //creating new LinkedList object of class LinkedList
        linkedList.append(nodeOne);                       //appending first node
        linkedList.append(nodeTwo);                       //appending second node
        linkedList.append(nodeThree);                     //appending third node
        System.out.println("The initial linked list is: ");
        linkedList.display();

        linkedList.pop();                                //pop method to take out the last element
        System.out.println("After popping the first element, the linked list will be: ");
        linkedList.display();
    }
    public static void main(String[] args) {
        createLinkedList(56,30,70);                 //calling the method
    }
}
