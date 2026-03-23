package Kunal.Stringa;

public class performance {
    static void main() {
//        for (int i = 0 ;i<26;i++){
//            char ch = (char)('a'+i);
//            System.out.print(ch);    // this  a cahracter for  leets make it in String form
        StringBuilder s = new StringBuilder();/////
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a'+i);
            s .append(ch);   // append is used to conactiantre with the string   insted of s= s+ch  because this cumsumes very high space as evry time a new object it created i point to it and forgets the old one and also this leads to a very large spac ewastage
  // thats why we use String Builder that just append it
// this basically is chngig the original string only so no wastage of space
        }
        System.out.println(s);
        s.reverse();   // evese the string
        System.out.println(s);
        }
    }

