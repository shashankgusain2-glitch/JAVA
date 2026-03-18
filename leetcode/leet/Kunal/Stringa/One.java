package Kunal.Stringa;

public class One {
      public static void main(String[] args) {
        String name = "Shanky";
        System.out.println(name);
     //// YOU SHOULD ALL KNIW THAT STRING ARE IMMTABLE IN JAVA MENAS THAT THEY CAN NOT BE CHANGED ONCE THEY ARE CREATED BUT YOU CAN REASSIGN THE VALUE OF THE STRING VARIABLE TO A NEW STRING VALUE. SO IN THIS CASE WE ARE REASSIGNING THE VALUE OF THE STRING VARIABLE "name" TO "Shankt kky" AND THEN PRINTING IT OUT. THIS IS NOT CHANGING THE ORIGINAL STRING "Shanky" BUT RATHER CREATING A NEW STRING "Shankt kky" AND ASSIGNING IT TO THE VARIABLE "name".
     

     ///basically meaning that you cant modify the original but assigna new objrct in that   that what happwning heere
     /// 
     /// 
     /// and garbage collector will take care of the original string "Shanky" as it is no longer referenced by any variable and is eligible for garbage collection.


        name = "Shankt kky";
        System.out.println(name);    



        // for comparsio of string 
        String a="dine";
        String b="dine";

        //even a single space in the string make a differnce   so remnember that like 
         // this will return true as a and b are pointing to the same string literal "dine" in the string pool
        String c=" dine";
        System.out.println(a==c);  // this will return false as tc has extra space before it

        System.out.println(a==b);



 System.out.println("for chechking differnt object of same values");
        //  for making a different obkects with a sme value you can use new keyword like this
        String d = new String("dine");
        String e = new String("dine");
        System.out.println(d==e);  // this will return false as d and e are different objects in memory
        System.out.println(d.equals(e));  // this will return true as d and e have   as it  only compares the values not he refernce




        System.out.println("for arrays");
        System.out.println(new int [] {1,2,3});   // int his the error occurs to the systme .outprintln class as  int this java       YOU SHOULD REACHER ON THT AALSO BUT YOU UNDERSTANS THIS IN JAVA OOPS

        System.out.println(java.util.Arrays.toString(new int [] {1,2,3}));  // this will print the array in a readable format



        // .toString is just like some wrapper class you can also use it with some functions like this 
        Integer num = new Integer(10);
        System.out.println(num.toString());  // this will print the string representation of the integer
        System.out.println(num); 
    }



}
