package Kunal.Pattern;

public class P9 {
    static void main() {
        int n =10;
        for (int i = n-1; i >0; i-=2) {
            for (int j = 0; j <n-i-1 ; j+=2) {
                System.out.print(" ");

            }
            for (int k = i; k >0 ; k--) {  // third loop for filling the rest of space



                System.out.print("*");
            }
            System.out.println();
        }
    }

}
