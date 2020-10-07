class Solution {
    private int find(boolean a[][],int i,int j)
    {
        if(i>=a.length || j>=a[0].length)
            return 0;
        if(i==a.length-1 && j==a[0].length-1)
            return 1;
        
        if(a[i][j])
            return 0;
        if(t[i][j]==-1){
        a[i][j]=true;
        int r=find(a,i,j+1);
        int d=find(a,i+1,j);
        a[i][j]=false;
        t[i][j]=r+d;
        }
        //System.out.println(r+" "+d);
        return t[i][j];
    }
    int t[][];
    public int uniquePaths(int m, int n) {
        boolean a[][]=new boolean[m][n];
        t=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                t[i][j]=-1;
            }
        }
        return find(a,0,0);
        
    }
}