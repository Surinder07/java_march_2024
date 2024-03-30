package march26;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {


        System.out.println("Do you still want to continue? Press 'Y' = yes , Press 'N' for No");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to My calculator ");
        System.out.println(" 1. Press 1 for addition");
        System.out.println(" 2. Press 2 for multiplication");
        System.out.println(" 3. Press 3 for sub");
        System.out.println(" 4. Press 4 for div");
        System.out.println(" 5. Press 5 for Modulus");
        System.out.println(" 6. Press 0 for exit");

        System.out.print("Enter your choice : ");
        int input = scanner.nextInt();

        System.out.println("Enter the first Number ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second Number ");
        int num2 = scanner.nextInt();

        int sum;
        switch (input){
            case 1 :

                sum = num1 + num2;
                System.out.println("Sum of num1 and num2  :"+ sum);
                break;
            case 2 :
                System.out.println("Switch on the Red bulb");
                break;
            case 3 :
                System.out.println("Switch on the Green bulb");
                break;
            default:
                System.out.println("Nothing found!!!");
        }
/*
   Create a calculator
   which + , *, - , / , %
   Welcome to my calculator
   1. Press 1 for addition
   2. Press 2 for multiplication
   3. Press 3 for subtraction
   4. Press 4 for div
   5. Press 5 for modulus
   6. 0 for exit

   Please enter your input : 2
   calculate multiplication ,

 */







        /*
        int input = 10;
        switch(input)

          case 1 :
           // you logic here

          break;


          case 2 :

          break;


          case 3 :

          break;

          default :
             // some statement





         */




    }
}
