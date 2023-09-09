package ua.goit;

public class Main {
    public static void main(String[] args) {
//      Test MyArrayList
        MyArrayList<String> arrayList1 = new MyArrayList<>();
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
        System.out.println(arrayList2.get(1));

    }
}
