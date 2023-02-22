package com.linkedlist;
/*Delete 40 from the linked list sequence 56-->30-->40-->70*/

public class LinkedListMain {
    public static void deleteLastElement(Integer key1, Integer key2, Integer key3){          //new method
        MyNode<Integer> nodeOne = new MyNode<>(key1);
        MyNode<Integer> nodeTwo = new MyNode<>(key2);
        MyNode<Integer> nodeThree = new MyNode<>(key3);

        LinkedList linkedList = new LinkedList();               //creating new LinkedList object of class LinkedList
        linkedList.append(nodeOne);                       //appending first node
        linkedList.append(nodeTwo);                       //appending second node
        linkedList.append(nodeThree);                     //appending third node
        System.out.println("The initial linked list is: ");
        linkedList.display();

        linkedList.popLast();                            //pop method to take out the last element
        System.out.println("After popping the last element, the linked list will be: ");
        linkedList.display();
    }

    public static void searchElement(Integer key1, Integer key2, Integer key3){
        MyNode<Integer> nodeOne = new MyNode<>(key1);
        MyNode<Integer> nodeTwo = new MyNode<>(key2);
        MyNode<Integer> nodeThree = new MyNode<>(key3);
        LinkedList linkedList = new LinkedList();               //creating new LinkedList object of class LinkedList

        linkedList.append(nodeOne);                       //appending first node
        linkedList.append(nodeTwo);                       //appending second node
        linkedList.append(nodeThree);                     //appending third node
        
        linkedList.search();                              //calling search method
    }

    public static void insertElement(Integer key1, Integer key2, Integer key3){
        MyNode<Integer> nodeOne = new MyNode<>(key1);
        MyNode<Integer> nodeTwo = new MyNode<>(key2);
        MyNode<Integer> nodeThree = new MyNode<>(key3);
        MyNode<Integer> insertedNode = new MyNode<>(40);
        LinkedList linkedList = new LinkedList();               //creating new LinkedList object of class LinkedList

        linkedList.append(nodeOne);                       //appending first node
        linkedList.append(nodeTwo);                       //appending second node
        linkedList.append(nodeThree);                     //appending third node

        linkedList.search();
        System.out.println("Now we want to add "+ insertedNode.getKey()+ " after " + nodeTwo.getKey());
        linkedList.insert(nodeTwo,insertedNode);          //insert method
        linkedList.display();                             //display method
        linkedList.findSize();
    }

    public static void deleteNode(){                           //method to delete 40 from the sequence
        MyNode<Integer> nodeOne = new MyNode<>(56);
        MyNode<Integer> nodeTwo = new MyNode<>(30);
        MyNode<Integer> nodeThree = new MyNode<>(70);
        MyNode<Integer> insertedNode = new MyNode<>(40);
        LinkedList linkedList = new LinkedList();               //creating new LinkedList object of class LinkedList

        linkedList.append(nodeOne);                       //appending first node
        linkedList.append(nodeTwo);                       //appending second node
        linkedList.append(nodeThree);                     //appending third node

        linkedList.insert(nodeTwo,insertedNode);          //insert method
        linkedList.display();                      //display the former link list sequence
        linkedList.findSize();                     //size of the former link list sequence
        System.out.println("\nWe want to delete 40 from the linked list sequence. So the final sequence is: ");
        linkedList.delete(insertedNode);           //delete the specified node
        linkedList.display();                      //display the new link list sequence
        linkedList.findSize();                     //size of the new link list sequence
    }

    public static void main(String[] args) {
        deleteNode();                 //calling the method
    }
}
