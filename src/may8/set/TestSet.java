package may8.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(400);
        set.add(300);
        set.add(445);
        set.add(20);
        System.out.println(set);
    }
}


