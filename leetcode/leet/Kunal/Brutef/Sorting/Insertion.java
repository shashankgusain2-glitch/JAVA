package Kunal.Brutef.Sorting;

public class Insertion {
    
    public static void main(String[] args) {
        int[] arr = {5, 4, 1,9,4,14,332,41,55};
        Solution(arr);
        System.out.println(java.util.Arrays.toString(arr));
      
    }
    public static void Solution(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){  // my question i have done j++ sue to it only check the one case ehich due to it only check comparison bte the last fo the soted part and the new elment only son tbis is wherre it fails so here we put j--      till j<0 so it check all the elemt of the soted part and no erroe occur 
                // also i maske i till arr,length-1 because we are comparing the element with the next element so if we put i till arr.length then it will give us an error because we are trying to access the element which is not present in the array  as j become out of bound due to it
                if (arr[j-1]>arr[j]){
                    Swap(arr,j-1,j);
                }
                else{
                    break;   // as in inserion sort they sart sorting from the starting fo the loop so if the element is greater than the previous element then we break the loop because the array is already sorted in that part
                }

            }
        }
    }
    public static void Swap (int[] arr , int First , int Last){
        int temp ;
        temp=arr[First];
        arr[First] = arr[Last];
        arr[Last] = temp;

        
    }

}