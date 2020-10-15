class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length==0)
            return new int[matrix.length];
        int res[]=new int[matrix.length*matrix[0].length];
        boolean up=true;
        int k=0;
        int i=0,j=0;
        while(i<matrix.length && j<matrix[i].length)
        {          
            if(up)
            {
                while(i>=0 && j<matrix[i].length)
                {
                    res[k++]=matrix[i][j];
                    i--;
                    j++;
                }
                i++;
                j--;
                if(j==matrix[i].length-1)
                { i++;}
                else
                {j++;
                }
            }
            else
            {
              while(j>=0 && i<matrix.length) 
              {
                  res[k++]=matrix[i][j];
                  i++;
                  j--;
              }
                i--;
                j++;
                if(i==matrix.length-1)
                { j++;}
                else
                {
                    i++;
                }
            }
            up=!up;
        }
        return res;
    }
}