package com.linkedlist;
/*Creating Linked List by adding 30 and 56 to 70*/

public class LinkedList {
    private MyNode head;
    private MyNode tail;
    public LinkedList(){           //constructor creation
        this.head = null;
        this.tail = null;
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
            this.tail = newNode;                   //appending the tails
        }
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
