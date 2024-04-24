package april20;

class Pen {

     final int SALARY = 10;

    public void write(){
        System.out.println("Pen can write ");
    }

}

class BluePen extends Pen {

    public void write(){
        System.out.println("Blue color");
    }
}

public class TestingFinal {
    public static void main(String[] args) {


    }
}
