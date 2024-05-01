package april30;

import java.util.Scanner;

public class DivMain {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the first Number ");
        int num2 = scanner.nextInt();
        int result = 0;
        try {
             result = num1 / num2;
            System.out.println("Not useful");
        }

        catch (NullPointerException e) {
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (Exception e) {

            System.out.println(e);
        }
        System.out.println(result);

        System.out.println("End of the result..");
    }
}

// 5 -10
// NullPointer , ArrayOutOfBound exception