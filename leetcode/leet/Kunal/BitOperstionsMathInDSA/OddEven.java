package Kunal.BitOperstionsMathInDSA;
///check for false is no is odd using bitwise operations
/// here we use AND operator for this
public class OddEven {
    static void main(String[] args) {
        int n = 68;
        System.out.println(isOdd(n));

    }
    public static boolean isOdd(int n){
        if ((n & 1)==1){
            return true;
        }
        else {
            return false;
        }
    }
}
