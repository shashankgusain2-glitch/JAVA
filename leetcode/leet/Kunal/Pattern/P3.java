package Kunal.Pattern;

public class P3 {
    static void main() {
        Solution(5);
    }

    static void Solution(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
