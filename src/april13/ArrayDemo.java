package april13;

public class ArrayDemo {
    public static void main(String[] args) {

        // create an array
        //          0   1 2  3 4  5   6  7
        int[] arr = {23,5,23,5,3,4356,34,5};


        // length = 8

      /*  for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }*/

        // for each loop
        //
        for (int x : arr)  {
            System.out.println(x);
        }
    }
}

/*  System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        */