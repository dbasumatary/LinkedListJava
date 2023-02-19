package com.linkedlist;
/*Interface Linked List*/

public interface Interface<K> {
    void setKey(K key);
    K getKey();
    Interface<K> getNext();
    void setNext(Interface<K> next);

}
