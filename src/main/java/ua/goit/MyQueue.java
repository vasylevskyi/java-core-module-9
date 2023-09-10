package ua.goit;

import java.util.Objects;

/*
add(Object value) додає елемент в кінець
clear() очищає колекцію
size() повертає розмір колекції
peek() повертає перший елемент з черги
poll() повертає перший елемент з черги і видаляє його з колекції
*/

public class MyQueue<T> extends MyLinkedList<T> {

    public T peak() {
        if (listSize == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<T> currentNode = head;
        return currentNode.value;
    }

    public T poll() {
        if (listSize == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T firstElementValue = head.value;
        if (listSize == 1) {
            head = null;
            tail = null;
            listSize = 0;
        } else {
            head = head.next;
            head.previous = null;
        }
        listSize--;
        return firstElementValue;
    }
}







