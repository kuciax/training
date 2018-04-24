package com.company.stackandqueues;

//
//public class QueueImpl<T> {
//    private GenericNode<T> head;
//    private GenericNode<T> tail;
//
//    public void printList() {
//        GenericNode current = head;
//        while (current.getNext() != null) {
//            System.out.println(current.getData());
//            current = current.getNext();
//        }
//        System.out.println(current.getData());
//    }
//    public boolean isEmpty() {
//        return head == null;
//    }
//
//    public T peek() {
//        return head.getData();
//    }
//
//    public void add(T data) {
//        GenericNode<T> node = new GenericNode<>();
//        if (tail != null) {
//            tail.setNext(node);
//        }
//        tail = node;
//        if (head == null) {
//            head = node;
//        }
//    }
//}


import com.company.Node;

public class QueueImpl {
    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        return head.getData();
    }

    public void add(int data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.setNext(node);
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public void printList() {
        Node current = head;
        while (current.getNext() != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println(current.getData());
    }

    public int remove() {
        int data = head.getData();
        if (head == null)
            tail = null;
        head = head.getNext();
        return data;
    }

}
