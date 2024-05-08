package may8.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(400);
        set.add(300);
        set.add(445);
        set.add(20);
        set.add(null);
        set.add(300);
        System.out.println(set);

        System.out.println(set.contains(445));

        // how to get an element from set ?
        // list.get()


        // iterate
        // for each loop , iterator ....


        // Tree Set  :  ascending Order

        TreeSet<Integer> treeSet = new TreeSet<>();


        // Problem : 
        // 10,304,50,203,503,23,30,50,203,503, 22,100

        List<Integer> list = Arrays.asList(0, 304, 50, 203, 503, 23, 30, 50, 203, 503, 22, 100);


    }
}
/*

Set does not allow duplicates
Set does not have order - random order
backed up by HashMap

 */