  /////////    IN THIS SOLUTION THIS ONLY CHECKS THE TARGET THAT IS PRESENT IN THE FIRST PART OF THE MOUNTAIN ARRAY AND 
  /// // IT MISSES THE TARHET IF PRESENT IN THE SECOND PART OF THE MOUNTAIN ARRAY  SO THIS SOLUTION IS NOT CORRECT   TS ITS DRAW BACK
public class FindinMountainarray {  //used in question no. 1095 of leetcode  here we have to find the target element in the mountain array and return the index of the target element if it is present otherwise return -1   that elemrent whihc occured first
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,36,40,39,38,37,36,35,34,33,32,31,30,10,4,3,2,1};
        int target = 3;
        System.out.println(Solution(arr,target));
        
    }
    public static int Solution(int[] arr ,int target){
        int startln =0;
        int endln  = Mountains(arr);
        while (startln<=endln){
            int mid = startln +(endln -startln)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>target){
                endln = mid-1;
            }
            else{
                startln = mid+1;
            }
        }
        return -1;


    }
    

     public static int Mountains(int[] arr ){ 
        int start =0;
        int end= arr.length-1;
        while (start<end){
            int mid = start +(end -start)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    
}
}
