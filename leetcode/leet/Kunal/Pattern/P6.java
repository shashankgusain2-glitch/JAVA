package Kunal.Pattern;

public class P6 {
    static void main() {
        Solution (5);
    }

    static void Solution(int n ) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");

            }
            for (int k = n-i; k <n ; k++) {  // third loop for filling the rest of space



                System.out.print("*");
            }
            System.out.println();
        }

    }
}
