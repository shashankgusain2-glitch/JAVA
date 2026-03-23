package Kunal.Stringa;

import java.util.ArrayList;
import java.util.HashSet;

public class Operators
{
    static void main() {
        System.out.println('a'+'b');  // here it basically just add up the ASCII value of the a and b
        System.out.println("a"+"b");// here it add up the string
        System.out.println('a'+3);  // it added up the ASCII value of a with 3

        // this is CASTING
        System.out.println((char)100);  // here it basically converts the numericla value into scii and return the number
        System.out.println((char)('a'+3));// it add ups nad convert in to char


        // int case of Strign and integrer
        System.out.println("a"+1);// when int added with string it got converted into its  WRAPPER CLASS  .tostring\

        System.out.println("shanky "+ new ArrayList<>());
        // here Wrapper class similar is happwning but right now the ArrayList i empty so we got an empty array after shanky
        System.out.println("shanky "+ new Integer(77));

        // So BASICALLY IF THER IS ANY THING OBJECT CONNECT TO THE STRING   .toString methord is used ;;



        // now if string not present
        // as operator is DEFINED FOR PRIMITIVE   the abovw one
        // also can be used with any complex object but at least one the object shoud be of String type

        //System.out.println(new Integer(99)+ new ArratList<>());  /// this will throw an error
    }

}
