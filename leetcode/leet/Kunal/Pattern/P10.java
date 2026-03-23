package Kunal.Pattern;

import java.sql.SQLOutput;

public class P10 {
    static void main() {
        int n =10;
        for (int i = 1; i <= n; i+=2) {
            for (int j = 0; j <n-i ; j+=2) {
                System.out.print(" ");

            }
            for (int k = 0; k <i ; k++) {
                if(k%2==0) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();   // similar for the reverse part

        }
    }
}
