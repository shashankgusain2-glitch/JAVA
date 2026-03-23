package Kunal.Pattern;

public class P8 {
    static void main() {
        int n =10;
        for (int i = 1; i <= n; i+=2) {
            for (int j = 0; j <n-i ; j+=2) {
                System.out.print(" ");

            }
            for (int k = 0; k <i ; k++) {  // third loop for filling the rest of space



                System.out.print("*");
            }
            System.out.println();
        }
    }
}
