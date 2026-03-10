package Brutef.Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int [] arr = {5, 1, 4, 2, 8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    
    }
    public static void bubble(int[] arr){
        boolean swapped;
        for (int i=0; i<arr.length; i++){ 
            swapped=false;   /// first we will assume that the array is already sorted and then we will check if it is not sorted or not by using the swapped variable
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;  // if we found any element which is greater than the next element then we will swap them and set the swapped variable to true
                }
            }
            if (!swapped){  // if the swapped variable is false then it means that the array is already sorted and we can break the loop
                break;    ///!false =true     means if there is no ssorting so there is no need to run the loop and we can break the loop and save the time to runnonin of the loop
            }
        }
    }
    
}
