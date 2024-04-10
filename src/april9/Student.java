package april9;

public class Student {

    static int x = 10; // instance variables
    // method ?
    public static void main(String[] args) {
         System.out.println(x);
        show();
    }


    public static  void show(){
        System.out.println();
        System.out.println("Non static method...");
    }

}
