package april27.pack.C;

import april27.pack.B.Child;

public class ChildSubclass extends Child {

    int y = 10;

    public void childMethod(){

        System.out.println("Child class method ");
    }

    public static void main(String[] args) {
        ChildSubclass child = new ChildSubclass();
        child.parentMethod();

    }
}
