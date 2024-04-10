package april9;

public class Laptop {
    {
        System.out.println("Instance block 2"); // 2
    }
    Laptop(){
        System.out.println("Inside the constructor"); // 4
    }
    {
        System.out.println("Instance block1"); // 3
    }

    static {
        System.out.println("Inside static block"); // 1
    }

    public static void show(){
        System.out.println("Inside show method"); // Nothing
    }
    public void display(){
        System.out.println("Inside display method"); // 5
    }
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.display();
        show();
    }

}
