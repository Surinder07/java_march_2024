package march23;

public class ComparisonDemo {
    public static void main(String[] args){

        int x = 20;
        int y = 30;
        int a = 50;
        int b = 20;
// = -> assignment operator
// ==   LHS = RHS
        // boolean result = x == y;
        System.out.println( x != y);// true
        System.out.println( x > a); // false
        System.out.println( x < b);  // false
        System.out.println( a <= y);  // 50 <= 30, false
        System.out.println( a >= y); // true
        System.out.println( a != y);  // true
        System.out.println( a ==  y); // false
     }
}

// compile time error
// runtime error