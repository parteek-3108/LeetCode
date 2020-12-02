class Solution {
    public int countSquares(int[][] matrix) {
        int ans = 0;
        for (int i=0;i<matrix.length;i++) {
            for  (int j=0; j<matrix[0].length; j++) {
                //Only if self is 1 then -> Just Monitor adjacent elements in : Up,left, and diagonally up-left elements
                if (matrix[i][j]==1
                    && i-1>=0&&j-1>=0 //Taking care of bounds
                    && matrix[i-1][j-1]!=0&&matrix[i-1][j]!=0&&matrix[i][j-1]!=0) { // Up,left, and diagonally up-left elements are all non-zero
                    // Take minimum of those up-left elements, and add one to include self single 1
                    matrix[i][j]=Math.min(Math.min(matrix[i-1][j-1],matrix[i-1][j]), matrix[i][j-1]) + 1;
                }
                //if self is 0, nothing will be added to answer.
                ans+=matrix[i][j];
            }
        }
        return ans;
    }
}