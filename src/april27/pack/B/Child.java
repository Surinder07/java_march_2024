package april27.pack.B;

import april27.pack.A.Parent;

public class Child extends Parent{

    int y = 10;

    public void childMethod(){

        System.out.println("Child class method ");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
    }
}
