package ua.goit;

import java.util.LinkedList;
import java.util.Objects;

public class MyLinkedList <T> {
    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        listSize++;
    }
    public void remove(int index) {
        Objects.checkIndex(index, listSize);
        Node<T> currentNode = head;
        Node<T> beforeIndexNode = head;
        Node<T> afterIndexNode = head;
        if (listSize == 1) {
            head = null;
            tail = null;
            listSize = 0;
            return;
        }
        if (index == 0) {
            head = head.next;
            head.previous = null;
            return;
        }
        if (index == listSize - 1) {
            tail = tail.previous;
            tail.next = null;
            return;
        }
        for (int i = 0; i <= index; i++) {
            afterIndexNode = afterIndexNode.next;
            if (i == index) {
                beforeIndexNode = currentNode.previous;
                beforeIndexNode.setNext(currentNode.next);
                afterIndexNode.setPrevious(currentNode.previous);
            }
            currentNode = currentNode.next;
        }
        listSize--;
    }
    public void clear () {
        head = null;
        tail = null;
        listSize = 0;
    }
    public int size() {
        return listSize;
    }
    public T get(int index) {
        Objects.checkIndex(index, listSize);
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    static class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> previous;

        public Node(T value) {
            this.value = value;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public void setPrevious(Node<T> previous) {
            this.previous = previous;
        }
    }



/*
add(Object value) додає елемент в кінець
remove(int index) видаляє елемент із вказаним індексом
clear() очищає колекцію
size() повертає розмір колекції
get(int index) повертає елемент за індексом
*/
}
