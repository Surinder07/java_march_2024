package may8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // raw type
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // this will throw exception
//        for (Integer e: list) {
//            list.remove(e);
//        }


        /*Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(next == 10) {
                //list.remove(new Integer(10));
                iterator.remove();
            }
        }
        System.out.println(list);*/

        ListIterator<Integer> listIterator = list.listIterator();

        // previous
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());

        }

        System.out.println();

        // next
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }





    }
}
