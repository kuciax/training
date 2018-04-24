package com.company.stackandqueues;

import com.company.Node;

public class StackImpl {
    Node top;

    public void push(int data) {
        Node node = new Node(data);
        node.setNext(top);
        top = node;
    }

    public int pull() {
        int data = top.getData();
        top = top.getNext();
        return data;
    }
}
