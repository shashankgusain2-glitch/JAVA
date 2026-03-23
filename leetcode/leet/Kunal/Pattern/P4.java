package Kunal.Pattern;

public class P4 {
    static void main() {
        Solution(5);
    }

    static void Solution(int n) {
        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);

            }
            System.out.println();

        }

    }
}
