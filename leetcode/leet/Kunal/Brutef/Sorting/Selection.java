
package Kunal.Brutef.Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        Solution(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  Solution(int[]arr){
        
        int start =0;
        for (int i=0; i<arr.length;i++){  // most of the important things happens in this loop   the most importrnt onr is the last = arr.length-i-1;  this is the one which is responsible for the sorting of the array  which divide the arr which area sjpuld be sote in which area should not be sorted

            int last= arr.length-i-1;
            int Swapping = max( arr,start,last);   /// Max function called     // we got the index of the max element in the array which is not sorted yet
            Swap(  arr,Swapping,last   );    // the Swap function called
            // here first element is sawpped with the last elment of the unsorted arraay

        }
    }

    public static int max (int [] arr,int start , int last){  // to find the maximum element in the array
        int max=start;

        
        for (int i=start; i<=last; i++){  // this loops find the max elmet int the range of the array that os not sorted yrt
            if(arr[i]>arr[max]){
                max = i;  // its the index of the max element in the array
            }
        }
        return max;
    }

    public static void Swap (int[] arr , int First , int Last){
        int temp ;
        temp=arr[First];
        arr[First] = arr[Last];
        arr[Last] = temp;

        
    }
}
