package com.linkedlist;
/*Searching linked list to find node with value 30*/

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

    public void popLast(){                                   //popLast method
        MyNode tempNode = head;
        while (tempNode.getNext().getNext() != null){              //checking if third element is empty or not
            this.tail = (MyNode) tempNode.getNext();              //setting the second element as tail
            this.tail.setNext(null);                             //setting the second element as tail
        }
    }

    public MyNode search(){                                      //search method
        if(head == null)
            System.out.println("Linked List is empty!");
        else{
            MyNode tempNode = head;                              //initiating tempNode as head
            int position = 0;                                    //to check the position of node
            while (tempNode != null){
                position++;
                if(tempNode.getKey().equals(30)){                //checking if the key equals 30
                    System.out.println("The node with value 30 is located at position "+position+" in the linked list");
                }
                tempNode = (MyNode) tempNode.getNext();           //iterating by changing tempNode to next node
            }
        }
        return null;
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