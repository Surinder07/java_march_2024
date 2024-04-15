package april13;

public class RevDemo {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        arrayReverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void arrayReverse(int[] arr){
        int start = 0;          // 0
        int end = arr.length-1; // 4

        int temp;

        while(start < end){
            temp = arr[end];   // arr[4]  , temp --- 50
            arr[end] = arr[start]; // arr[0]   , arr[end] = 10
            arr[start] = temp;

            start ++;
            end --;
        }
    }
}


   /*
        temp = arr[end]
        arr[end] = arr[start];
        arr[start] = temp;
         */

// Find the maximum element in the array
// find the minimum element in array

/*

   int max = 0;
   max =50;
           int[] arr = {10,20,30,40,50};




 */