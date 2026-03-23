package Kunal.Recursion;

public class Numbers {
    static void main(String[] args) {// write a function that takes a number and prints it
        //also print th enext 5 numbers
        Number(1);


    }

    static void Number(int n) {
        if (n==8){
            System.out.println("8");
            return;
        }
        System.out.println(n);
        Number(n+1);    // as many time you call tbe funtion it will take memory in the stack for each new call
        // here it will also act like new funtion and similar way it will work inside the stack



    }
}

