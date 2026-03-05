package Brutef;

import java.util.Arrays;

public class Leet41 {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int result = firstMissingPositive(arr);
        System.out.println(result);
    }
    public static int firstMissingPositive(int[] arr) {
        int n =arr.length;
        int mising =1;
        Arrays.sort(arr);  // to sort thge array in ascending order
        for(int i=0;i<n;i++){
            if (arr[i]<=0){
                continue;
            }
            else if (arr[i]==mising){
                mising ++;

            }
           
        }
        return mising;
     }

}

