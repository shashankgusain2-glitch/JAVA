package leetcode.leet.Kunal.Brutef;
/// its not the solution for this questuiion   as inthat we have to fid 1 that is onl present in the diagoal cell
///    the LOop concept is very much used over here
/// 
public class Leet1582 {
    public static void main(String[] args) {
        int[][] math = { { 1, 0, 0 }, { 0, 1, 1 }, { 0, 0, 1 } };
        int result = Position(math);
        System.out.println(result);

    }

    public static int Position(int[][] math) {
        int row = math.length;
        int Solution = 0;
        for (int i = 0; i < row; i++) { // ROW
            int Check = 0; // checking no. of zeros in the row
            int column = math[i].length;
            for (int j = 0; j < column; j++) {// COLUMN
                if (math[i][j] == 1) {
                    Check++;
                }
                // we didnt use else continu as its useless without it also do the same function
            }

            if (Check == 1) {
                Solution++; ////////////////////
            }

        }

        return Solution;
    }
}
