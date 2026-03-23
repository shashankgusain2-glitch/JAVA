package Kunal.Recursion;

public class Fibonacchi {
    static void main() {
        // till 15
        System.out.println(Fibo(6));

    }
    static int Fibo (int  n){
        if (n<2){
            return n;

        }
        return Fibo(n-1)+Fibo(n-2);

    }

}
