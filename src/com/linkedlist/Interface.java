package com.linkedlist;
/*Interface for node operations*/

public interface Interface<K> {
    void setKey(K key);
    K getKey();
    Interface<K> getNext();
    void setNext(Interface<K> next);
}
