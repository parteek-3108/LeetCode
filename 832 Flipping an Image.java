class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length/2;j++)
            {
                int f=0;
                if(A[i][A[i].length-1-j]==0)
                    f=1;
                int s=0;
                if(A[i][j]==0)
                    s=1;
                A[i][A.length-1-j]=s;
                A[i][j]=f;
            }
            if(A[i].length%2==1)
            {
                if(A[i][A[i].length/2]==0)
                    A[i][A[i].length/2]=1;
                else 
                    A[i][A[i].length/2]=0;
            }
        }
        return A;
    }
}