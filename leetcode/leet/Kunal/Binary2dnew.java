////// UNSERSTND THOS TOPIC AAGIN ITS ON KUNNA; INARY 2D VIDEO 2 ND QUESTION IN THE VIDEO
public class Binary2dnew {
    public static void main (String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int target = 7;
       

    }
    public static int[] BinarySearch(int[][] matrix,int target,int row ,int Cstart,int Cend){
        while (Cstart<=Cend){   // a normal binary search on thr roow of the 2d matroc to find the target
            int mid = Cstart+(Cend-Cstart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            else if (matrix[row][mid]>target){
                Cend=mid-1;
            }
            else {
                Cstart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows==1){
            return BinarySearch(matrix,target,0,0,cols-1);
        }
        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;
        while (rstart<rend-1){  // run the loop until 2 rows are remaining
            int mid = rstart+(rend-rstart)/2;
            if (matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            else if (matrix[mid][cmid]>target){
                rend=mid;  // we are not doing mid-1 because we want to include the mid row in our search space
            }
            else {
                rstart=mid; // we are not doing mid+1 because we want to include the mid row in our search space
            }
        }
        // now we have 2 rows remaining
        // check whether the target is in the col of 2 rows
        if (matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if (matrix[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        // search in 1st half of 1st row
        if (target<=matrix[rstart][cmid-1]){
            return BinarySearch(matrix,target,rstart,0,cmid-1);
        }
        // search in 2nd half of 1st row
        if (target>=matrix[rstart][cmid+1] && target<=matrix[rstart][cols-1]){
            return BinarySearch(matrix,target,rstart,cmid+1,cols-1);
        }
        // search in 1st half of 2nd row
        if (target<=matrix[rstart+1][cmid-1]){
            return BinarySearch(matrix,target,rstart+1,0,cmid-1);
        }
        // search in 2nd half of 2nd row
         else {
             return BinarySearch(matrix,target,rstart+1,cmid+1,cols-1);
         }

    }
    
}
//// THIS IS ALL AUTO GENRETAED SO SONT GOT FOR THIS OKKAY