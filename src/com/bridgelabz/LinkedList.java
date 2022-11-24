package com.bridgelabz;

public class LinkedList {

    Node head;
    Node tail;

    void push(int data) {

        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    void add(int data) {

        Node node = new Node(data);

        if (head == null) {

            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void insert(int data) {

        Node node = new Node(data);
        head.next = node;
        node.next = tail;
    }

    void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}