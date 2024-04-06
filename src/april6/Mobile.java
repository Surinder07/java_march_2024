package april6;

public class Mobile {

    // properties , member variables
    double weight;
    String brand;
    double price;
    String color;

    // methods , behaviour

    // outgoingcall
    // receivecalls
    // texting
    // set of block of statements which perform some specific task.

    // blue
    public void makeOutGoingCalls(String color, String something){
        System.out.println("Making call from " + color + " color Iphone");
        System.out.println(something);
    }

    public void receiveIncomingCalls(){
        System.out.println("Receing a call ");
    }

    public void texting(){
        System.out.println("sending a text message");
    }

}
