package org.example;

import java.util.Iterator;

class NodeList<E> implements Iterable<E> {
    private Node<E> head;
    private Node<E> tail;

        private int size = 0;

    public void addElem(E elem) {
        Node<E> temp = new Node(elem, null);
        if (head == null)
            tail = head = temp;
        else {
            tail.setNext(temp);
            tail = temp;
        }
        size++;
    }
//    public void addFirst(E elem){
//        if(tail==null){
//            addElem(elem);
//            return;
//        }
//
//        Node<E> temp = new Node<E>(elem,null);
//        tail.next = temp;
//        tail = temp;
//        size++;
//    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }


    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<E> temp = head;
        while (temp != null) {
            builder.append(temp.value).append("->");
            if (temp == tail) builder.append("End");
            temp = temp.next;
        }
        return builder.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<E>(this);
    }
}

class MyIterator<E> implements Iterator<E> {
    Node<E> current;

    public MyIterator(NodeList<E> es) {
        current = es.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public E next() {
        E data = current.getValue();
        current = current.getNext();
        return data;
    }
}

class Node<E> {
    Node<E> next;
    E value;

    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getNext() {
        return next;
    }

    public E getValue() {
        return value;
    }
}