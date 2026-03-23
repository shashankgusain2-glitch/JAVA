package Kunal.Pattern;

public class P5 {
    static void main() {
        Solution(10);
    }

    static void Solution(int n) {

        for (int i = 1; i < n + 1; i++) {
            if(i<=n/2) {

                for (int j = 0; j < i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
            else {
                for (int k = n-i; k>0; k--) {  // n-i is the fromualwe made for the lowertt pattern
                    System.out.print("*");

                }
                System.out.println();
            }


        }
    }
}
