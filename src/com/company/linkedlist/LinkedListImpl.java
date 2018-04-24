package com.company.linkedlist;

import com.company.Node;

public class LinkedListImpl {
    Node head;
    int indexes = 0;

    public void apped(int data) {
        if (head == null) {
            head = new Node(data);
            indexes++;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node(data));
        indexes++;
    }

    public void prepend(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node newHead = new Node(data);
        newHead.setNext(head);
        head = newHead;
        indexes++;
    }

    public void deleteWithValue(int data) {
        if (head == null) return;
        Node current = head;
        if (head.getData() == data) {
            head = head.getNext();
            return;
        }
        while (current.getNext() != null) {
            if (current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
                indexes--;
            }
            current = current.getNext();

        }
    }

//    public int getValueOf(int index) throws IndexOutOfBoundsException {
//        if (index < 0 || index > indexes) throw new IndexOutOfBoundsException();
//        Node current = head.getNext();
//        for (int i = 0; i < indexes; i++) {
//            current = current.getNext();
//        }
//        return current.getData();
//    }

    public void setValueOf(int index, int data) throws IndexOutOfBoundsException {
        if (index < 0 || index > indexes) throw new IndexOutOfBoundsException();
        Node current = head;//.getNext();
        for (int i = 0; i < indexes; i++) {
            current = current.getNext();
        }
        current.setData(data);
    }

    public int getSize() {

        if (head == null)
            return 0;
        else return indexes;
    }

    public int returnHeadValue() {
        return head.getData();
    }

    public void printList() {
        Node current = head;
        while (current.getNext() != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println(current.getData());
    }

    public int getValueOf(int index) throws IndexOutOfBoundsException {
        Node current = head;
        int i = 0;
        while (i < index) {
            if (current.getNext() == null) throw new IndexOutOfBoundsException();
            current = current.getNext();
            i++;
        }
        return current.getData();

    }
}
