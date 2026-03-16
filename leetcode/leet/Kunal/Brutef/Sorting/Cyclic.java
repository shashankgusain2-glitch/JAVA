package Kunal.Brutef.Sorting;

public class Cyclic {
    //,// Cyclic sort is a sorting algorithm that is used to sort an array of n objects which are in the range of 1 to n. The idea is to put each object to its correct position. The correct position of an object with value v is at index v-1.  which is mostly simliar condition
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        Solution(arr);
        System.out.println(java.util.Arrays.toString(arr));
      
    }
    public static void Solution(int[] arr){
        int i=0;
        while (i<arr.length){
            // basic Solution is use forumla   index= value-1;
            if (i==arr[i]-1){  // if the element is at the correct position then we move to the next element
                i++;
            }
            else{
                Swap(arr,i,arr[i]-1);  // if the element is not at the correct position then we swap it with the element which is at the correct position
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
