package march30;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating scanner to take user input

        char c;
        do {
            System.out.println("Welcome to my calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");

            System.out.println("Enter your choice from the above menu, Please only enter numbers : ");
            int input = sc.nextInt(); // taking user input


            switch (input) {
                case 1:
                    System.out.print("Enter the first Number ");
                    int x = sc.nextInt();

                    System.out.print("Enter the seconc Number ");
                    int y = sc.nextInt();
                    int sum = x + y;
                    System.out.println("Sum of " + x + " and " + y + " is : " + sum);
                    break;

                case 2:
                    System.out.print("Enter the first Number ");
                    int a = sc.nextInt();

                    System.out.print("Enter the seconc Number ");
                    int b = sc.nextInt();
                    int sub = a - b;
                    System.out.println("Sub of " + a + " and " + b + " is : " + sub);
                    break;
            }

            System.out.println("Do you still want to continue? Press 'Y' for yes and 'N' for No");
            c = sc.next().charAt(0);
            //String s = sc.next();
            // s.equalsIgnoreCase();  , ==
        }while (c == 'y' || c == 'Y');
    }
}
