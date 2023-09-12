package ua.goit;

import java.security.InvalidKeyException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws InvalidKeyException {
//      Test MyArrayList
/*        MyArrayList<String> arrayList1 = new MyArrayList<>();
        MyArrayList<Integer> arrayList2 = new MyArrayList<>();

        arrayList1.add("First string object");
        arrayList1.add("Second string object");
        arrayList1.add("Third string object");


        System.out.println(arrayList1.get(0));
        System.out.println(arrayList1.get(1));
        System.out.println(arrayList1.get(2));
        System.out.println(arrayList1.size());
        System.out.println("-----------------------");

        //arrayList1.clear();
        arrayList1.remove(1);
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.get(0));
        System.out.println(arrayList1.get(1));

        arrayList2.add(10);
        arrayList2.add(20);

        System.out.println(arrayList2.get(0));
        System.out.println(arrayList2.get(1));*/

//      Test MyLinkedList
/*        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("First, index = 0");
        myLinkedList.add("Second, index = 1");
        myLinkedList.add("Third, index = 2");
        myLinkedList.add("Fourth, index = 3");
        myLinkedList.add("Fifth, index = 4");

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(4));

        myLinkedList.remove(2);
        System.out.println(myLinkedList.size());

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        //System.out.println(myLinkedList.get(4));

        myLinkedList.clear();
        System.out.println(myLinkedList.size());
        //System.out.println(myLinkedList.get(0));*/

//      Test MyQueue
/*        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("First Element");
        myQueue.add("Second Element");

        System.out.println(myQueue.peak());
        System.out.println(myQueue.size());
        System.out.println("------------------");

        myQueue.poll();

        System.out.println(myQueue.peak());
        System.out.println(myQueue.size());*/

//      Test MyStack
/*        MyStack<String> myStack = new MyStack<>();
        myStack.push("First Element");
        myStack.push("Second Element");

        System.out.println(myStack.get(0));
        System.out.println(myStack.listSize);
        System.out.println("--------------");

*//*        myStack.clear();
        System.out.println(myStack.get(0));
        System.out.println(myStack.listSize);*//*

        myStack.pop();
        System.out.println(myStack.get(0));
        System.out.println(myStack.listSize);
        System.out.println(myStack.get(1));*/

//      Test MyHashMap
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("First key", "First value");
        myHashMap.put("First key", "False value");
        myHashMap.put("Second key", "Second value");
        myHashMap.put("Second key", "False value");
        myHashMap.put("Third key", "Third value");

        System.out.println(myHashMap.get("First key"));
        System.out.println(myHashMap.get("Second key"));
        System.out.println(myHashMap.get("Third key"));
        System.out.println("-----------------------");

        myHashMap.remove("Second key");

        System.out.println(myHashMap.get("First key"));
        System.out.println(myHashMap.get("Second key"));
        System.out.println(myHashMap.get("Third key"));
        System.out.println(myHashMap.size());

        System.out.println("------------------------");

        myHashMap.clear();

        System.out.println(myHashMap.size());


    }
}
