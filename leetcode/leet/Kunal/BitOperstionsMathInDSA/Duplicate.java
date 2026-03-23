package Kunal.BitOperstionsMathInDSA;

import java.sql.SQLOutput;

public class Duplicate
{
    static int [] arr = {1,1,2,3,2,3,3,4,5,4,5};

    static void main(String[] args) {
        int s=0;
        for ( int i =0;i <arr.length ;i++){
            s ^= arr[i];


        }
        System.out.println(s);

    }
}
