public class Ordeagnosticbs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;
        System.out.println(Solution(arr,target));
        
    }
    public static int Solution(int[] arr ,int target){
        int startln =0;
        int endln  = arr.length-1;
        boolean isAsc = arr[startln]<arr[endln];
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
