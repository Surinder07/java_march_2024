package april23.abstraction;


import april20.Student;

public abstract class Shape {
    // it may or may not have abstract methods...
    public abstract void getArea(); // method does not have body...

    public void show(){
        System.out.println("something...");
    }
}
class Square extends Shape {

    @Override
    public void getArea() {
        System.out.println("calculating area.... ");
    }
}
class MainDemo {
    public static void main(String[] args) {

      // Shape shape = new Shape();
        Shape square = new Square();  // why? Upcasting...
        square.getArea();
    }
}



















