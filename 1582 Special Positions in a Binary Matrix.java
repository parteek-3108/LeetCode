class Solution {
    private boolean check(int [][]mat,int i,int j)
    {
        int t=0;
        for(t=0;t<mat.length;t++)
        {
            if(t==i)
                continue;
            if(mat[t][j]==1)
                break;
        }
        if(t!=mat.length)
        {
           return  false;
        }
        for(t=0;t<mat[i].length;t++)
        {
            if(t==j)
                continue;
            if(mat[i][t]==1)
                break;
        }
        if(t!=mat[i].length)
            return false;
        return true;
    }
    public int numSpecial(int[][] mat) {
        if(mat.length==0 || mat[0].length==0)
            return 0;
        boolean col[]=new boolean[mat[0].length];
        boolean row[]=new boolean[mat.length];
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    if(col[j]!=true && row[i]!=true && check(mat,i,j))
                    count++;
                    col[j]=true;
                    row[i]=true;
                }
                
            }
        }
        return count;
    }
}