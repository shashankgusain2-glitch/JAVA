package leet.Kunal;
///  can be usded in solution finding for letcode question 35 and 744

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,8,9};
        int temp = 1;
        int result =Ceil(arr,temp);
        System.out.println(result);
        
    }

    public static int Ceil(int[] arr, int temp){
        int start =0;
        int end = arr.length-1;

        while (start<=end ){
            int mid = start +(end -start)/2;
            if(arr[mid]==temp){   // for question no. 744 of leetcode you just have to comment it and return steart%n;      or you can make condition like if(start==n){return 0;}
                return mid;
            }
            else if(arr[mid]>temp){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
       return start; 
       // return start%n;  /// for question no. 744 of leetcode 
       
      // THIS GIVE THE INDEX OF THE CEILING ELEMENT IN THE ARRAY BECAUSE
        /// when while loop is violated then the start will be greater than the end also here er need to find the smallest number which is greater than the target element so we will return the start index because it will be the smallest number which is greater than the target element  so that what statrt will become 

    }

    
}
