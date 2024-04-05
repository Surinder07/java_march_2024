package april2;

public class Rectangle {

    // variables
    double width;
    double length;
    double area;

    /*public void calculateArea(){
        // area of rectangle
        area = width * length;
        System.out.println("Area of Rectangle : "+ area);
    }*/

    public double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {
        // Create Object of Recatangle class
        Rectangle rectangle = new Rectangle();
        double areaOfRec = rectangle.calculateArea(3, 4);
        System.out.println("Area of Rec  : "+ areaOfRec);

    }
}


/*

Create a class called Rectangle
variables - width , length

1. create a method to calcualte area
2. create a method to calculate perimeter

main -- to call these methods to print area and perimeter.

 */