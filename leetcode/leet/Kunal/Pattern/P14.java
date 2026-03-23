package Kunal.Pattern;

public class P14 {

    static void main() {
        int n =10;
        for (int i = 1; i <=n ; i+=2) {
            for (int j = n-i ;j >0 ; j-=2) {
                System.out.print(" ");

            }
            int k =i;
            if (k==n-1){
                for (int a = 0; a < k; a++) {
                    System.out.print("*");
                }

            }
            else  {
                for (int b = 1; b <=k; b++) {
                    if(b==1){
                        System.out.print("*");
                    }
                    else if (b==k){
                        System.out.println("*");
                    }
                    else {
                        System.out.println(" ");
                    }
                }

            }

        }
    }
}
