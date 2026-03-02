package Brutef;

import java.util.Arrays;

public class Leet1356 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        
    // public int[] sortByBits(int[] arr) {
        /// here 10 power 4 so max bit size that it can go isapproximatiley 14   just to remember
        //Integer.bitcount  is user to find no. of 1 in a no. in binary form 
        //lets say brute force is that  first sort the array   mostly in ascendign form 
        //then make a new array in which the checked values will go 
        //  check from no. of 1 in nums in bit form till 14    and push them in new array   and just return the array
        Arrays.sort(arr);
        // return Solution(arr);
        int[] result = Solution(arr);
        System.out.println(Arrays.toString(result)) ;  // to print the array in a readable format

        
    }
    public static int[] Solution(int[]arr){   // what i lean is to return array use arrray data type while cretating class
        int n = arr.length;
        int[] newarr = new int [n];
        int bit =14;
        int index=0;
        for (int i=0;i<=14;i++){

            for (int j=0;j<n;j++){
                if (i==Integer.bitCount(arr[j])){
                    
                    newarr[index]=arr[j];
                    index++;
                }
            }
        }
        return newarr;
    }
}
    
