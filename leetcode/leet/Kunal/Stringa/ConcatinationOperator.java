package Kunal.Stringa;

import java.util.ArrayList;

public class ConcatinationOperator {
    static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char) ('a'+3));
        System.out.println((int) ('a'+3));

        System.out.println("a"+1);
        //simply its similar to "a"+"1"   // here in this case .toString so interger becames its wrapper class
        System.out.println("shanky"+  new ArrayList<>());  // here the lsit is emplty so akter shanky its empty
        System.out.println("shanky"+ new Integer(8));

        // rember that yu can concatinate at most any data type here or any complex one but  AT LEAST ONE SHOULD BE OF TYPE STRING
        String ans = new Integer(88)+ ""+new ArrayList<>();
        System.out.println(ans);

    }
}
