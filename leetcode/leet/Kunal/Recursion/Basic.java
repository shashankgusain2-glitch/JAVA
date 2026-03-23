package Kunal.Recursion;

public class Basic{
    static void main(String[] args) {
        Message();

    }

    static void Message() {
        System.out.println("hwello");
        Message1();  // we just make neew function that call each otheer

    }
    static void Message1(){
        System.out.println("hello");
        Message2();
    }
    static void Message2(){
        System.out.println("hello");// similarly this how you can print it 5 or many other times

    }
}  // lets just say that you want to print hello 6 time without changing the actual Message fundtion, also not chanoging the input so we can do is



















































