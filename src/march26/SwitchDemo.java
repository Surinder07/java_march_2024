package march26;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input ");
        int input = scanner.nextInt();

        switch (input){
            case 1 :
                System.out.println("Switch on the fan");
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
