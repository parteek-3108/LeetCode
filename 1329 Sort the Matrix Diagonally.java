class Solution {
    public int[][] diagonalSort(int[][] mat) {
        if(mat.length==0)
            return mat;
        int i=0,j=0;
        for(i=mat.length-1;i>=0;i--)
        {
            int i1=i,j1=j;
            while(i1<mat.length && j1<mat[0].length)
            {
                int t1=i1-1,t2=j1-1;
                int key=mat[i1][j1];
                while(t1>=0 && t2>=0 && mat[t1][t2]>key)
                {
                    mat[t1+1][t2+1]=mat[t1][t2];
                    t1--;
                t2--;
                }
                mat[t1+1][t2+1]=key;
                i1++;
                j1++;
            }
        }
        i=0;
        for(j=1;j<mat[0].length;j++)
        {
            int i1=i,j1=j;
            while(i1<mat.length && j1<mat[0].length)
            {
                int t1=i1-1,t2=j1-1;
                int key=mat[i1][j1];
                while(t1>=0 && t2>=0 && mat[t1][t2]>key)
                {
                    mat[t1+1][t2+1]=mat[t1][t2];
                    t1--;
                t2--;
                }
                mat[t1+1][t2+1]=key;
                i1++;
                j1++;
            }
        }
        return mat;
        
    }
}