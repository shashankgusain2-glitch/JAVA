package Kunal.Recursion;

import javax.xml.transform.Source;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,11};
        int target = 8;
        System.out.println(Binary(arr,target,0,arr.length-1));

    }

    static int Binary(int[] arr, int target, int s , int e) {
        // if condition
        if(s>e){
            return -1;
        }

        int m = s+(e-s)/2;
        if (arr[m]==target){
            return m;

        } else if (arr[m]<target) {
            return Binary(arr,target,m+1,e);

        }
        return Binary(arr,target,s,m-1);

    }
}

