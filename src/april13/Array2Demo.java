package april13;

import java.util.Scanner;

public class Array2Demo {
    public static void main(String[] args) {

        //Scanner to take user input

        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        // sum = sum + arr[0] + arr[1] + arr[2].....length of array

        System.out.println("Printing the elements of array");
        for (int i = 0; i <arr.length ; i++) {
           sum = sum + arr[i];
        }

        System.out.println(sum);

    }
}
/*

integer array ----- > arr  = {23,44,23,52,54,23,87,87}

print the sum of integers .


2.   arr  = {10,20,30,40,50,60,70}

   OP ---- {70,60,50,40,30,20,10}

 */