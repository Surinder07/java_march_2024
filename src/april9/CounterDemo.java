package april9;

public class CounterDemo {

    static int count = 3;

    CounterDemo(){
        count --;
        System.out.println(count);
    }

    public static void main(String[] args) {
        CounterDemo c1 = new CounterDemo();
        CounterDemo c2 = new CounterDemo();
        CounterDemo c3 = new CounterDemo();

    }
}
