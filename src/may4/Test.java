package may4;

import java.util.*;

public class Test {
    public static void main(String[] args) {


        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);

        //List<Integer> list = List.of(10, 290, 320);


/*
       System.out.println(arrayList);

        arrayList.add(2, 1000);
        System.out.println(arrayList);

        Integer element = arrayList.get(3);
        System.out.println(element);*/

        list1.addAll(list2);
        // Object[] objects = list1.toArray();
        System.out.println(list1);

        int i = list1.indexOf(10);
        System.out.println("Index of 10 is : " +i);

        // traversing
        // for loop
        // for each loop
        // iterator



    }
}
