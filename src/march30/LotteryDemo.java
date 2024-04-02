package march30;

import java.util.Scanner;

public class LotteryDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to My Lottery System");

        System.out.println("Enter the number you want to try");
        int number = scanner.nextInt();
        int luckyNumber = 27;

        if(number == 27){
            System.out.println("You won the Lottery of $50K");
        }

    }
}
