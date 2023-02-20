package com.linkedlist;
/*Creating Linked List by popping 56 from the stack*/

public class LinkedList {
    private MyNode head;
    private MyNode tail;
    public LinkedList(){           //constructor creation
        this.head = null;
        this.tail = null;
    }
    public void add(MyNode newNode) {          //method add
        //If the linked list is empty
        if (this.head == null){
            this.head = newNode;
        }
        if (this.tail == null){
            this.tail = newNode;
        }//If the linked list is not empty
        else {
            MyNode tempNode = this.head;              //save the old head in a variable
            this.head = newNode;                      //the new head
            this.head.setNext(tempNode);              //the new head should point to old head
        }
    }
    public void append(MyNode newNode) {          //method append
        //If the linked list is empty
        if (this.head == null){
            this.head = newNode;
        }
        if (this.tail == null){
            this.tail = newNode;
        }//If the linked list is not empty
        else {
            this.tail.setNext(newNode);            //setting the next tail
            this.tail = newNode;                   //appending the tails 56 -> 30
        }
    }
    public void insert(Interface earlierNode, Interface newNode) {
        Interface tempNode = head;
        tempNode = earlierNode.getNext();
        earlierNode.setNext(newNode);                         //setting the newNode as earlierNode
        newNode.setNext(tempNode);                            //newNode will point to element which was earlierNode
    }
    public void pop() {                                       //pop method
        if(head == null)
            System.out.println("Linked List is empty!");
        else
            this.head = (MyNode) head.getNext();             //the next node will be the new head
    }

    public void display(){                           //display method
        Interface temp = head;
        if(head == null) {
            System.out.println("Linked List is empty");
        }
        System.out.print("LinkList Sequence: " );
        while (temp != null) {
            if(temp.getNext() != null) {
                System.out.print(temp.getKey() + " -> ");
                temp = temp.getNext();
            }
            else {
                System.out.println(temp.getKey());
                temp = temp.getNext();
            }
        }
    }
}
