package Kunal.Pattern;

public class P7 {
    static void main() {
        Solution(5);
    }
    static void Solution(int n ) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");

            }
            for (int k = n-i; k >0 ; k--) {  // third loop for filling the rest of space



                System.out.print("*");
            }
            System.out.println();
        }
}}
