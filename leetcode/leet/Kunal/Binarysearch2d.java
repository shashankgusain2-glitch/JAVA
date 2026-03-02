//INT THIS  ROW AND COLUMN ARE SORTED
public class Binarysearch2d {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 5;
        int[] result = searchMatrix(matrix,target);
        System.out.println(result[0] + "," + result[1]);//  return the result array
    }
    public static int[] searchMatrix(int[][] matrix ,int target){
        int n = matrix.length;
        int m = matrix[0].length;  // length for columns
        //while the row is smaller than the lenght of the matrix the search shouud continue and when greater than the matrix size then the search should stop
        int row =0;
        int column = m-1;   // the length of the column is the length of the row because in 2d array the number of columns is equal to the number of rows
        while (row < n && column >=0){
            if (matrix[row][column]==target){
                int[] r= {row,column};   // in this basiically we store the valure of row and column
                
                return r;
            }
            else if(matrix [row][column] >target){
                column --;

            }
            else{
                row++;
            }
            
        }
        return new int[]{-1,-1};  // if the target is not found in the matrix then we return -1,-1
    


    }

    
}
