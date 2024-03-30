package march30;

public class Test {
    public static void main(String... args) {
        int counter = 1;
        int sum = 0;
        do{
            System.out.println(counter); // 2
            sum = sum + counter;  // sum = 3 + 3
            counter ++;
        }while(counter <=10);
        System.out.println("Sum of numbers from 1-10  = "+sum);

        // print numbers from 1-10 and calculate the sum of those numbers.
        //
        // print numbers from 1-n , calculate the sum upto n.

        /*
        1st iteration ------ sum = 1
        2nd ---->  sum = 3
        3rd -----> sum = 6
............
        10 + 45 = 55

         */






        // sum  == 3
        // 1 2 3 4 5 6 7 8 9 10
        // Sum = 55




        /*int counter = 0;
        while (counter <= 10){
            System.out.println(counter);
            counter ++;
        }*/




        // Loops ?
        /*

        1. while
        2. do - while
        3. for loop
        4. foreach


         */




    }
}
