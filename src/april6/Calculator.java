package april6;

public class Calculator {

    public int sum(int a , int b){
        return a + b;
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }

    public double sum(double a, double b, double c){
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int sum = cal.sum(10, 20, 230);
        System.out.println(sum);

    }
}

/*

Method overloading
same name but diff parameters

 */
