package Kunal.Pattern;

public class P12 {
    static void main() {
        int n =10;
        for (int a = n; a >0; a-=2) {
            for (int j = n-a; j >0; j-=2) {
                System.out.print(" ");

            }
            for (int k = 1; k <a ; k++) {
                if(k%2==0) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();   // similar for the reverse part

        }
        for (int i = 2; i <= n; i+=2) {
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
            System.out.println();

        }
        // in the reverse part



    }
}
