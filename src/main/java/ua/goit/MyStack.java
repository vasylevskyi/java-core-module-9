package ua.goit;

import java.util.Arrays;

/*  push(Object value) додає елемент в кінець
    remove(int index) видаляє елемент за індексом
    clear() очищає колекцію
    size() повертає розмір колекції
    peek() повертає перший елемент стеку
    pop() повертає перший елемент стеку та видаляє його з колекції*/

public class MyStack<T> extends MyArrayList<T> {
    public void push (T value) {
        if (listSize >= data.length) {
            data = Arrays.copyOf(data, data.length + 10);
        }
        data[listSize] = value;
        listSize++;
    }
    public T peak() {
        return data[listSize - 1];
    }
    public T pop() {
        T lastElementValue = data[listSize - 1];
        data[listSize - 1] = null;
        listSize--;
        return lastElementValue;
    }


}
