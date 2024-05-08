package may8.set;

import java.util.HashSet;
import java.util.Set;

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









    }
}
/*

Set does not allow duplicates
Set does not have order - random order
backed up by HashMap

 */