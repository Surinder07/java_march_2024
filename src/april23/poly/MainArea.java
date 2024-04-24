package april23.poly;

public class MainArea {
    public static void main(String[] args) {

        // Upcasting....
        // child class's object class be assigned to the parent class reference.

//        Shape circle = new Circle();
//        circle.getArea();


        Shape obj = new Circle();
        obj.getArea();  //



        Circle circle = new BlueCircle();


        // convert one type to another

//        int x = 10;  //
//        float y = x;

//        float x = 10.12f;
//        int y = (int)x;
//        System.out.println(y);






    }
}

/*

Shape
|
Circle
|
BlueArea


 */






// polymorphim

// compile time
// static polymorphism          dyanmic poly...
// method overloading           overriding..


// calculator -- add(int a, int b ) , add(int a, int b, int c)