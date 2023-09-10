package ua.goit;

import java.util.Arrays;

public class MyArrayList <T> {
    protected static final int DEFAULT_LIST_SIZE = 10;
    protected T[] data;
    protected int listSize;

    public MyArrayList() {
        data = (T[]) new Object[DEFAULT_LIST_SIZE];
        listSize = 0;
    }
    public void add(T value) {
        if (listSize >= data.length) {
            data = Arrays.copyOf(data, data.length + 10);
        }
            data[listSize] = value;
            listSize++;
     }

    public void remove(int index) {
        if (index < 0 || index >= listSize) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < listSize - 1; i++) {
            data[index] = data[index+1];
        }
        listSize--;
    }
    public void clear () {
        data = (T[]) new Object[DEFAULT_LIST_SIZE];
        listSize = 0;
    }

    public int size() {
        return listSize;
    }
    public T get(int index) {
        if (index < 0 || index >= listSize) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }




    /* Методи
add(Object value) додає елемент в кінець
remove(int index) видаляє елемент із вказаним індексом
clear() очищає колекцію
size() повертає розмір колекції
get(int index) повертає елемент за індексом
* */

}
