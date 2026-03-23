    package Kunal.BitOperstionsMathInDSA;

    public class Ithdigit {
        static void main(String[] args) {
            int n =8;
            int k =4 ;// i th bit that i have to find in the no.
            System.out.println(bit(n,k));

        }
        public static int bit(int n,int k){
            // apply this formula   1& (N<<(K-1))
          return (n>>(k-1)&1);


        }
    }
