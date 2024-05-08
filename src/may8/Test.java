package may8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // raw type
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // loop

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();
        // for each loop
// for every integer element in the list print the element
        for (Integer element : list  ) {
            System.out.println(element);
        }

        // Iterator
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();
            iterator.remove();
            System.out.println(next);
        }


// Concurrent Modification excption


    }
}
