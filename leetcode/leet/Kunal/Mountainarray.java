public class Mountainarray {   // used in question no. 1095 of leetcode logically 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,40,39,38,37,36,35,34,33,32,31,30};
        int target = 30;
        int result=Solution(arr,target);
        System.out.println(result);
        
        
    }
    // this is for chechiing inwich part it lies and for result;
    public static int Solution(int[] arr , int target){
        int peakValue =Mountain(arr);
        int FirstPart =Orderagnostic(arr,target,0,peakValue);
        if(FirstPart!= -1){
            return FirstPart;
        }
        else{
            return Orderagnostic(arr, target, peakValue+1,arr.length-1);
        }
    }
    //this function is used to find the peak element in the mountain array 
    public static int Mountain(int[] arr ){ 
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

    //oreder agnostic bs    as sultion can be present in both the part of the mountain array so we have to check in both the part of the mountain array  and for that we will use order agnostic bs
     public static int Orderagnostic(int[] arr ,int target,int startln ,int endln){
        
        boolean isAsc = arr[startln]<=arr[endln];  // we use <= as equal to is logically the right way
        while (startln<=endln){ 
            int mid = startln +(endln -startln)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (arr[mid]>target){
                    endln = mid-1;
                }
                else{
                    startln = mid+1;
                }
            }
            else{
                if (arr[mid]>target){
                    startln = mid+1;
                }
                else{
                    endln = mid-1;
                }
            }
            
        }
        return -1;
    
}
    
}
