

public class FirsyAndLast {
    //  can be usded in solution finding for letcode question 34 
 public static void main(String[] args) {
    int ans[] ={-1,-1};
    int[] arr ={5,7,7,7,7,8,8,10};
    int target = 7;
    int start= Check(arr,target,true);
    int end = Check(arr,target,false);
    ans[0]=start;
    ans[1]=end;


//   return ans;
    System.out.println(ans[0]+" "+ans[1]);  // this can be used in form of return 
    
 }
 public static int Check(int[] arr, int target, boolean Findindex){
    int start =0;
    int end =arr.length-1;
    int ans =-1;  //  if not found
    while (start<=end){
        int mid = start +(end-start)/2;
        if (arr[mid]>target){
            end=mid-1;

        }
        else if(arr[mid] < target){
            start=mid+1;

        }
        else{
            ans = mid;
            if(Findindex){
                end=mid-1;  // for finding the first index of the target element in the array  
            }
            else{
                start=mid+1;  // for finding the last index of the target element in the array
            }
        }


 }
    return ans;
 
    
 }
}
