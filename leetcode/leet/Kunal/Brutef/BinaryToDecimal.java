package Brutef;

public class BinaryToDecimal {
    public static void main (String[] args){
        String s ="1011";
        int result = Decimal(s);
        System.out.println(result);

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
