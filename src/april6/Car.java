package april6;

public class Car{

    String color;
    String brand;
    double price;

    public Car(){

        color = "blue";
        price = 100;

    }

    public void displayCarInfo(){
        System.out.println("Color  : " + color);
        System.out.println("Brand  : " + brand);
        System.out.println("Price : " + price);
    }
}
