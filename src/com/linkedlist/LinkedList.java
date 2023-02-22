package com.linkedlist;
/*Delete 40 from the linked list sequence 56-->30-->40-->70*/

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
    public void pop() {                                       //pop method deleting from head
        if(head == null)
            System.out.println("Linked List is empty!");
        else
            this.head = (MyNode) head.getNext();             //the next node will be the new head
    }

    public void popLast(){                                   //popLast method deleting from tail
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

    public void delete(MyNode deleteNode){                                 //delete node by given node
        MyNode tempNode = this.head;
        // If the element to be deleted is either the first or the last element
        if ( deleteNode.equals(this.head)){                         //if the element to be deleted is the first element
            pop();
        }
        if ( deleteNode.equals(this.tail)){                        //if the element to be deleted is the last element
            popLast();
        }

        while (!(tempNode.getNext().equals(tail))){                // searching for the element to be deleted
            if (tempNode.getNext().getKey().equals(deleteNode.getKey())){    //if next node after head equals to given node
                MyNode newNode = (MyNode) tempNode.getNext().getNext();      //newNode will be shifted to the right two times
                tempNode.setNext(newNode);                                   //newNode will be set as next to tempNode
                break;
            }
            tempNode = (MyNode) tempNode.getNext();                       //iterating for next loop
        }
    }

    public void findSize(){                                   //size of the linked list sequence
        int size;
        MyNode tempNodeOne = this.head;
        MyNode tempNodeTwo = this.tail;
        if (tempNodeOne.equals(tempNodeTwo)){                     // If there is only one element
            size = 1;
        } else if (tempNodeOne.getNext().equals(tempNodeTwo)){   // If there are only two elements
            size = 2;
        } else{                                                  // If there are minimum 2 elements
            size = 2;
            while (!tempNodeOne.getNext().equals(tempNodeTwo)){
                size++;                                          //increase size for every loop
                tempNodeOne = (MyNode) tempNodeOne.getNext();
            }
        }
        System.out.println("The size of the linked list sequence is: " + size);
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