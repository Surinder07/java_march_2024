package may8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // raw type
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(next == 10) {
                //list.remove(new Integer(10));
                iterator.remove();
            }


        }
        System.out.println(list);


    }
}
