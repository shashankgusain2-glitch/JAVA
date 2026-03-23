package Kunal;

public class lc3550 {
    static void main(String[] args) {
//    int [] arr= {2,10,20};
        int []arr= {10,3,2};
        System.out.println(smallestIndex(arr));


        }
    public static int smallestIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int s = Sum(arr[i]);
            if (i == s) {
                return i;
            }
        }
        return -1;
    }


    public static int Sum(int a){// it check the sum of digits of a no.
        int sum = 0;
        while( a>0) {

            sum += a % 10;
            a /= 10;
        }
        return sum;

    }

}
