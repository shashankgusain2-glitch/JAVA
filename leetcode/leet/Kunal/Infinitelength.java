public class Infinitelength {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,12,13,14,15,22,23,24,25,26,27,28,29,30};
        int target=14;
        System.out.println(Infinite(arr,target));


    }
    public static int Infinite(int[] arr , int target){
        int start=0;
        int end=1;
        while (end<arr.length && target > arr[end]){ //// ALSO LEARN THIS && PROCESS AND HOW IT WORK AND HOWIT  WAS FAILING WHEN YOU SWAP THOSE TEO CONDITIONS     // in this case
            /// we were first solving it without arr.length   but   at some cases end exceeds the arr.length asctual size son not valid ans
            int newstart = end+1;
            end = end +(end -start +1)*2;  /// prevous end position + size of the previous box *2;
            if (end > arr.length-1){
                end = arr.length-1;
            }
            start = newstart;

        }
        return Boolwan(arr ,target, start, end);
        
    }
    public static int Boolwan(int[] arr, int target , int start ,int end){
       

        while(start<=end ){
            int mid = start +(end -start)/2;
            if (arr[mid]<target){
                start = mid+1;
            }
            else if (arr[mid]>target){
                end =mid-1;

            }
            else{
                return mid;
            }
        }
        return -1;
        
    }
}
