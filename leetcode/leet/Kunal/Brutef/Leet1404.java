package Brutef;
// IN this we have to `find the number of steps to reduce a number to one   fom bianry to decimal form also 
//we use Interger.parseInt(String  ,2) to convert binary to decimal form
public class Leet1404 {
       /// in this solution Integer.pardeInt can convert s.length() up to 2 power 31  -1   but int his question we have length 5000 so over flow condition may occor
       /// even with long data type it can go up to 2 power 63 -1   so we have to use our own method to convert binary to decimal form
    public static void main (String[] args ){
        String s = "10";
        int result = Solution(s);
        System.out.println(result);

    }
    public static int Solution(String s ){
        int no = Decimal(s);
        int steps=0;
        while (no>1){
            if (no %2==0){
                no=no/2;
                steps++;
            }
            else{
                no=no+1;
                steps++;
            }
        }
        return steps;

    }
    public static int Decimal(String s){
        int Binary=1;
        int sum =0;
        for (int i = s.length()-1;i>=0;i--){
            int num =s.charAt(i)-'0';//`to convert char to int  this is used 
            int digit = num*Binary;
            sum += digit;
            Binary *= 2;
        }
        return sum;

    }
}
